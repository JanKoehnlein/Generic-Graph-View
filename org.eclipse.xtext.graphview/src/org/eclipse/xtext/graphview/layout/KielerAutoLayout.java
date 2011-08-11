package org.eclipse.xtext.graphview.layout;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.alg.BasicProgressMonitor;
import de.cau.cs.kieler.core.alg.IKielerProgressMonitor;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphFactory;
import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kiml.AbstractLayoutProvider;
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout;
import de.cau.cs.kieler.kiml.klayoutdata.KInsets;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutDataFactory;
import de.cau.cs.kieler.kiml.klayoutdata.KPoint;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.kiml.util.BoxLayoutProvider;

public class KielerAutoLayout extends AbstractAutoLayout {

	protected static class ExtensionPointReader {
		private static final String KIML_CLASS = "class";

		private static final Logger LOG = Logger
				.getLogger(KielerAutoLayout.class);

		private static final String KIML_PARAMETER = "parameter";

		private static final String KIML_NAME = "name";

		private static final String KIML_LAYOUT_PROVIDERS = "de.cau.cs.kieler.kiml.layoutProviders";

		protected static AbstractLayoutProvider getLayoutProvider(
				String layoutName) {
			for (IConfigurationElement layoutProviderConfig : Platform
					.getExtensionRegistry().getConfigurationElementsFor(
							KIML_LAYOUT_PROVIDERS)) {
				String layoutAlgorithmName = layoutProviderConfig
						.getAttribute(KIML_NAME);
				if (Strings.equal(layoutName, layoutAlgorithmName)) {
					AbstractLayoutProvider layoutProvider;
					try {
						if (layoutProviderConfig.getAttribute(KIML_CLASS) != null) {
							layoutProvider = (AbstractLayoutProvider) layoutProviderConfig
									.createExecutableExtension(KIML_CLASS);
							String layoutAlgorithmParameter = layoutProviderConfig
									.getAttribute(KIML_PARAMETER);
							layoutProvider.initialize(layoutAlgorithmParameter);
							return layoutProvider;
						}
					} catch (CoreException e) {
						LOG.error("Error instantiating KIELER layout provider "
								+ Strings.notNull(layoutName), e);
					}
				}
			}
			LOG.warn("No KIELER layout provider named '"
					+ Strings.notNull(layoutName) + "' found. Using default.");
			return new BoxLayoutProvider();
		}
	}
	
	private KGraphFactory graphFactory = KGraphFactory.eINSTANCE;

	private KLayoutDataFactory layoutDataFactory = KLayoutDataFactory.eINSTANCE;

	private BendpointConnectionRouter connectionRouter = new BendpointConnectionRouter();

	private String layoutName;
	
	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public void layout(IFigure container) {
		Map<ILayoutNode, KNode> childrenToNodes = Maps.newHashMap();
		Map<Connection, KEdge> connectionToEdges = Maps.newHashMap();
		KNode rootNode = createKNode(null);
		for (Object child : container.getChildren()) {
			if (child instanceof ILayoutNode) {
				ILayoutNode childFigure = (ILayoutNode) child;
				KNode graphNode = createKNode(childFigure.getPreferredSize());
				rootNode.getChildren().add(graphNode);
				childrenToNodes.put(childFigure, graphNode);
			}
		}
		Layer connectionLayer = getConnectionLayer(container);
		if (connectionLayer != null) {
			for (Object child : connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					Connection connection = (Connection) child;
					connection
							.setConnectionRouter(getConnectionRouter(container));
					KNode sourceNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					KNode targetNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					if (targetNode != null && sourceNode != null) {
						KEdge graphEdge = createKEdge(sourceNode, targetNode);
						connectionToEdges.put(connection, graphEdge);
					}
				}
			}
		}
		IKielerProgressMonitor progressMonitor = new BasicProgressMonitor();
		AbstractLayoutProvider kielerLayoutProvider = ExtensionPointReader
				.getLayoutProvider(layoutName);
		kielerLayoutProvider.doLayout(rootNode, progressMonitor);
		for (Map.Entry<ILayoutNode, KNode> entry : childrenToNodes.entrySet()) {
			KShapeLayout data = entry.getValue().getData(KShapeLayout.class);
			if (data != null) {
				Rectangle bounds = new Rectangle((int) data.getXpos(),
						(int) data.getYpos(), (int) data.getWidth(),
						(int) data.getHeight());
				entry.getKey().setBounds(bounds);
			}
		}
		for (Map.Entry<Connection, KEdge> entry : connectionToEdges.entrySet()) {
			KEdgeLayout edgeLayout = entry.getValue()
					.getData(KEdgeLayout.class);
			if (edgeLayout != null) {
				List<Bendpoint> gefBendPoints = Lists.newArrayList();
				for (KPoint bendPoint : edgeLayout.getBendPoints()) {
					gefBendPoints.add(new AbsoluteBendpoint((int) bendPoint
							.getX(), (int) bendPoint.getY()));
				}
				getConnectionRouter(container).setConstraint(entry.getKey(),
						gefBendPoints);
			}
		}
	}

	protected KEdge createKEdge(KNode sourceNode, KNode targetNode) {
		KEdge graphEdge = graphFactory.createKEdge();
		KEdgeLayout edgeLayout = layoutDataFactory.createKEdgeLayout();
		edgeLayout.setSourcePoint(layoutDataFactory.createKPoint());
		edgeLayout.setTargetPoint(layoutDataFactory.createKPoint());
		graphEdge.getData().add(edgeLayout);
		sourceNode.getOutgoingEdges().add(graphEdge);
		targetNode.getIncomingEdges().add(graphEdge);
		return graphEdge;
	}

	protected KNode createKNode(Dimension preferredSize) {
		KNode graphNode = graphFactory.createKNode();
		KShapeLayout layoutData = layoutDataFactory.createKShapeLayout();
		if (preferredSize != null) {
			layoutData.setSize(preferredSize.width, preferredSize.height);
		}
		KLabel graphLabel = graphFactory.createKLabel();
		KShapeLayout labelLayoutData = layoutDataFactory.createKShapeLayout();
		graphLabel.getData().add(labelLayoutData);
		graphNode.setLabel(graphLabel);
		KInsets insets = layoutDataFactory.createKInsets();
		layoutData.setInsets(insets);
		graphNode.getData().add(layoutData);
		return graphNode;
	}

	@Override
	public ConnectionRouter getConnectionRouter(IFigure container) {
		return connectionRouter;
	}

}