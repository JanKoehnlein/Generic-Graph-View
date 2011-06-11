package org.eclipse.xtext.graphview.layout;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutEntity;
import org.eclipse.zest.layouts.LayoutRelationship;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;
import org.eclipse.zest.layouts.exampleStructures.SimpleNode;
import org.eclipse.zest.layouts.exampleStructures.SimpleRelationship;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

public class DiagramZestLayoutAdapter extends AbstractDiagramLayout {

	private static final Logger LOG = Logger
			.getLogger(DiagramZestLayoutAdapter.class);

	public void layout(IFigure container) {
		LayoutAlgorithm layoutAlgorithm = new CompositeLayoutAlgorithm(new LayoutAlgorithm[] {
				new GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING)
				, new HorizontalShift(LayoutStyles.NONE)
		});
		Map<ILayoutNode, LayoutEntity> childrenToNodes = Maps.newHashMap();
		Map<Connection, LayoutRelationship> connectionToEdges = Maps
				.newHashMap();
		for (Object child : container.getChildren()) {
			if (child instanceof ILayoutNode) {
				ILayoutNode childFigure = (ILayoutNode) child;
				Dimension childPreferredSize = childFigure.getPreferredSize();
				SimpleNode graphNode = new SimpleNode(childFigure, 0, 0,
						childPreferredSize.width, childPreferredSize.height);
				childrenToNodes.put(childFigure, graphNode);
				// layoutAlgorithm.addEntity(graphNode);
			}
		}
		Layer connectionLayer = getConnectionLayer(container);
		if (connectionLayer != null) {
			for (Object child : connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					Connection connection = (Connection) child;
					LayoutEntity sourceNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					LayoutEntity targetNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					SimpleRelationship edge = new SimpleRelationship(
							sourceNode, targetNode, false);
					connectionToEdges.put(connection, edge);
					// layoutAlgorithm.addRelationship(edge);
				}
			}
		}
		try {
			layoutAlgorithm.applyLayout(Iterables.toArray(
					childrenToNodes.values(), LayoutEntity.class), Iterables
					.toArray(connectionToEdges.values(),
							LayoutRelationship.class), 0, 0, 1000, 1000, false,
					false);
			for (Map.Entry<ILayoutNode, LayoutEntity> entry : childrenToNodes
					.entrySet()) {
				LayoutEntity node = entry.getValue();
				ILayoutNode figure = entry.getKey();
				figure.setBounds(new Rectangle((int) node.getXInLayout(),
						(int) node.getYInLayout(), (int) node.getWidthInLayout(),
						(int) node.getHeightInLayout()));
			}
			// for (Map.Entry<Connection, LayoutRelationship> entry :
			// connectionToEdges.entrySet()) {
			// Connection connection = entry.getKey();
			// List<Bendpoint> bendpoints = Lists.newArrayList();
			// for (int i = 0; i < points.size(); ++i) {
			// bendpoints.add(new AbsoluteBendpoint(points.getPoint(i)));
			// }
			// connection.setRoutingConstraint(bendpoints);
			// }
		} catch (InvalidLayoutConfiguration e) {
			LOG.error("Error in layout config", e);
		}
	}

}
