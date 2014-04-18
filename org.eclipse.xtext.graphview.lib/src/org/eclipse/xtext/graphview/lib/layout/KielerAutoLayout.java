/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.layout;

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
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.xtext.graphview.lib.shape.FigureUtil;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.alg.BasicProgressMonitor;
import de.cau.cs.kieler.core.alg.IKielerProgressMonitor;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphFactory;
import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KLabeledGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.kiml.AbstractLayoutProvider;
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout;
import de.cau.cs.kieler.kiml.klayoutdata.KInsets;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutDataFactory;
import de.cau.cs.kieler.kiml.klayoutdata.KPoint;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.util.BoxLayoutProvider;

public class KielerAutoLayout extends AbstractAutoLayout {

	protected static class ExtensionPointReader {

		private static final String KIML_CLASS = "class";

		private static final Logger LOG = Logger.getLogger(KielerAutoLayout.class);

		private static final String KIML_PARAMETER = "parameter";

		private static final String KIML_NAME = "name";

		private static final String KIML_LAYOUT_PROVIDERS = "de.cau.cs.kieler.kiml.layoutProviders";

		static {
			for (IConfigurationElement layoutProviderConfig : Platform.getExtensionRegistry().getConfigurationElementsFor(
					KIML_LAYOUT_PROVIDERS)) {
				String layoutAlgorithmName = layoutProviderConfig.getAttribute(KIML_NAME);
				if (layoutProviderConfig.getAttribute(KIML_CLASS) != null)
					System.out.println(layoutAlgorithmName);
			}
		}

		protected static AbstractLayoutProvider getLayoutProvider(String layoutName) {
			for (IConfigurationElement layoutProviderConfig : Platform.getExtensionRegistry().getConfigurationElementsFor(
					KIML_LAYOUT_PROVIDERS)) {
				String layoutAlgorithmName = layoutProviderConfig.getAttribute(KIML_NAME);
				if (Strings.equal(layoutName, layoutAlgorithmName)) {
					AbstractLayoutProvider layoutProvider;
					try {
						if (layoutProviderConfig.getAttribute(KIML_CLASS) != null) {
							layoutProvider = (AbstractLayoutProvider) layoutProviderConfig.createExecutableExtension(KIML_CLASS);
							String layoutAlgorithmParameter = layoutProviderConfig.getAttribute(KIML_PARAMETER);
							layoutProvider.initialize(layoutAlgorithmParameter);
							return layoutProvider;
						}
					} catch (CoreException e) {
						LOG.error("Error instantiating KIELER layout provider " + Strings.notNull(layoutName), e);
					}
				}
			}
			LOG.warn("No KIELER layout provider named '" + Strings.notNull(layoutName) + "' found. Using default.");
			return new BoxLayoutProvider();
		}
	}
	
	private KGraphFactory graphFactory = KGraphFactory.eINSTANCE;

	private KLayoutDataFactory layoutDataFactory = KLayoutDataFactory.eINSTANCE;

	private BendpointConnectionRouter connectionRouter = new BendpointConnectionRouter();

	private String layoutName;
	
	private Map<IProperty<?>, Object> properties = Maps.newHashMap(); 

	public KielerAutoLayout() {
		this("Sugiyama");
	}

	public KielerAutoLayout(String layoutName) {
		setLayoutName(layoutName);
		setSpacing(15);
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public void setSpacing(double spacing) {
		properties.put(LayoutOptions.SPACING, new Float(spacing));
	}
	
	public double getSpacing() {
		return ((Float) properties.get(LayoutOptions.SPACING)).doubleValue();
	}
	
	public void setAspectRatio(float aspectRatio) {
		properties.put(LayoutOptions.ASPECT_RATIO, aspectRatio);
	}
	
	public void setRandomSeed(int randomSeed) {
		properties.put(LayoutOptions.RANDOM_SEED, randomSeed);
	}
	
	@SuppressWarnings("unchecked")
	private <T> void setLayoutProperty(KNode node, IProperty<?> key, T value) {
		node.getData(KShapeLayout.class).setProperty((IProperty<T>)key, value);
	}
	
	public Rectangle layout(IFigure container) {
		Map<ILayoutNode, KNode> childrenToNodes = Maps.newHashMap();
		Map<Connection, KEdge> connectionToEdges = Maps.newHashMap();
		KNode rootNode = createKNode(null);
		for(Map.Entry<IProperty<?>,Object> property: properties.entrySet())
			setLayoutProperty(rootNode, property.getKey(), property.getValue());
		for (Object child : container.getChildren()) {
			if (child instanceof ILayoutNode) {
				ILayoutNode childFigure = (ILayoutNode) child;
				KNode graphNode = createKNode(childFigure.getPreferredSize());
				rootNode.getChildren().add(graphNode);
				childrenToNodes.put(childFigure, graphNode);
			}
		}
		Layer connectionLayer = FigureUtil.getConnectionLayer(container);
		if (connectionLayer != null) {
			for (Object child : connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					Connection connection = (Connection) child;
					connection.setConnectionRouter(getConnectionRouter(container));
					KNode sourceNode = childrenToNodes.get(connection.getSourceAnchor().getOwner());
					KNode targetNode = childrenToNodes.get(connection.getTargetAnchor().getOwner());
					if (targetNode != null && sourceNode != null) {
						KEdge graphEdge = createKEdge(sourceNode, targetNode);
						connectionToEdges.put(connection, graphEdge);
					}
				}
			}
		}
		IKielerProgressMonitor progressMonitor = new BasicProgressMonitor();
		AbstractLayoutProvider kielerLayoutProvider = ExtensionPointReader.getLayoutProvider(layoutName);
		kielerLayoutProvider.doLayout(rootNode, progressMonitor);
		kielerLayoutProvider.dispose();
		Rectangle containerBounds = null;
		for (Map.Entry<ILayoutNode, KNode> entry : childrenToNodes.entrySet()) {
			KShapeLayout data = entry.getValue().getData(KShapeLayout.class);
			if (data != null) {
				Rectangle bounds = new Rectangle((int) data.getXpos(), (int) data.getYpos(), (int) data.getWidth(), (int) data.getHeight());
				entry.getKey().setBounds(bounds);
				if (containerBounds == null)
					containerBounds = bounds.getCopy();
				else
					containerBounds.union(bounds);
			}
		}
		for (Map.Entry<Connection, KEdge> entry : connectionToEdges.entrySet()) {
			KEdgeLayout edgeLayout = entry.getValue().getData(KEdgeLayout.class);
			if (edgeLayout != null && !edgeLayout.getBendPoints().isEmpty()) {
				List<Bendpoint> gefBendPoints = Lists.newArrayList();
				for (KPoint bendPoint : edgeLayout.getBendPoints()) {
					AbsoluteBendpoint gefBendPoint = new AbsoluteBendpoint(new PrecisionPoint(bendPoint.getX(), bendPoint.getY()));
					gefBendPoints.add(gefBendPoint);
					if (containerBounds == null)
						containerBounds = new Rectangle(gefBendPoint, new Dimension(0, 0));
					else
						containerBounds.union(gefBendPoint);
				}
				getConnectionRouter(container).setConstraint(entry.getKey(), gefBendPoints);
			}
		}
		return (containerBounds == null) ? new Rectangle() : containerBounds;
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

	protected KLabel createKLabel(KLabeledGraphElement parent) {
		KLabel graphLabel = graphFactory.createKLabel();
		KShapeLayout labelLayoutData = layoutDataFactory.createKShapeLayout();
		graphLabel.getData().add(labelLayoutData);
		graphLabel.setText("");
		parent.getLabels().add(graphLabel);
		return graphLabel;
	}

	protected KNode createKNode(Dimension preferredSize) {
		KNode graphNode = graphFactory.createKNode();
		KShapeLayout layoutData = layoutDataFactory.createKShapeLayout();
		if (preferredSize != null) {
			layoutData.setSize(preferredSize.width, preferredSize.height);
		}
		createKLabel(graphNode);
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
