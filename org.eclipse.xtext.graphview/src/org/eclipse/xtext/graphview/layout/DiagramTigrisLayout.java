package org.eclipse.xtext.graphview.layout;

import java.awt.Point;
import java.util.Map;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.tigris.geflayout.layout.Layouter;
import org.tigris.geflayout.layout.LayouterEdge;
import org.tigris.geflayout.sugiyama.SugiyamaEdge;
import org.tigris.geflayout.sugiyama.SugiyamaLayouter;
import org.tigris.geflayout.sugiyama.SugiyamaNode;

import com.google.common.collect.Maps;

public class DiagramTigrisLayout extends AbstractDiagramLayout {

	public void layout(IFigure container) {
		Layouter layouter = new SugiyamaLayouter();
		Map<ILayoutNode, SugiyamaNode> childrenToNodes = Maps.newHashMap();
		Map<Connection, LayouterEdge> connectionToEdges = Maps.newHashMap();
		for (Object child : container.getChildren()) {
			if (child instanceof ILayoutNode) {
				ILayoutNode childFigure = (ILayoutNode) child;
				final Dimension childPreferredSize = childFigure.getPreferredSize();
				SugiyamaNode graphNode = new SugiyamaNode() {
					
					private Point location = new Point();

					@Override
					public java.awt.Dimension getSize() {
						return new java.awt.Dimension(childPreferredSize.width, childPreferredSize.height);
					}
					
					@Override
					public Point getLocation() {
						return location;
					}
					
					public void setLocation(Point newLocation) {
						location.setLocation(newLocation);
					};
					
					@Override
					public boolean isDummyNode() {
						return false;
					}
				};
				childrenToNodes.put(childFigure, graphNode);
				layouter.add(graphNode);
			}
		}
		Layer connectionLayer = getConnectionLayer(container);
		if (connectionLayer != null) {
			for (Object child : connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					Connection connection = (Connection) child;
					SugiyamaNode sourceNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					SugiyamaNode targetNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					SugiyamaEdge edge = new SugiyamaEdge(sourceNode, targetNode) {
						@Override
						public void route() {
						}
					};
					connectionToEdges.put(connection, edge);
					layouter.add(edge);
				}
			}
		}
		layouter.layout();
		for (Map.Entry<ILayoutNode, SugiyamaNode> entry : childrenToNodes.entrySet()) {
			SugiyamaNode node = entry.getValue();
			ILayoutNode figure = entry.getKey();
			java.awt.Rectangle bounds = node.getBounds();
			figure.setBounds(new Rectangle(bounds.x, bounds.y, bounds.width, bounds.height));
		}
//		for (Map.Entry<Connection, LayouterEdge> entry : connectionToEdges.entrySet()) {
//			Connection connection = entry.getKey();
//			PointList points = entry.getValue().getPoints();
//			List<Bendpoint> bendpoints = Lists.newArrayList();
//			for (int i = 0; i < points.size(); ++i) {
//				bendpoints.add(new AbsoluteBendpoint(points.getPoint(i)));
//			}
//			connection.setRoutingConstraint(bendpoints);
//		}
	}

}
