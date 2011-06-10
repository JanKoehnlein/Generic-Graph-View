package org.eclipse.xtext.graphview.figure;

import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.Node;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class DiagramLayout extends AbstractLayout {

	protected Dimension calculatePreferredSize(IFigure container, int wHint,
			int hHint) {
		container.validate();
		List<?> children = container.getChildren();
		Rectangle result = new Rectangle().setLocation(container
				.getClientArea().getLocation());
		for (int i = 0; i < children.size(); i++)
			result.union(((IFigure) children.get(i)).getBounds());
		result.resize(container.getInsets().getWidth(), container.getInsets()
				.getHeight());
		return result.getSize();
	}

	@SuppressWarnings("unchecked")
	public void layout(IFigure container) {
		CompoundDirectedGraph graph = new CompoundDirectedGraph();
		Map<INodeFigure, Node> childrenToNodes = Maps.newHashMap();
		Map<Connection, Edge> connectionToEdges = Maps.newHashMap();
		for (Object child : container.getChildren()) {
			if (child instanceof INodeFigure) {
				INodeFigure childFigure = (INodeFigure) child;
				Node graphNode = new Node();
				graphNode.setSize(childFigure.getPreferredSize());
				childrenToNodes.put(childFigure, graphNode);
				graph.nodes.add(graphNode);
			}
		}
//		Layer connectionLayer = getConnectionLayer(container);
//		if (connectionLayer != null) {
//			for (Object child : connectionLayer.getChildren()) {
//				if (child instanceof Connection) {
//					Connection connection = (Connection) child;
//					Node sourceNode = childrenToNodes.get(connection
//							.getSourceAnchor().getOwner());
//					Node targetNode = childrenToNodes.get(connection
//							.getSourceAnchor().getOwner());
//					Edge edge = new Edge(sourceNode, targetNode);
//					connectionToEdges.put(connection, edge);
////					graph.edges.add(edge);
//				}
//			}
//		}
		new CompoundDirectedGraphLayout().visit(graph);
		for (Map.Entry<INodeFigure, Node> entry : childrenToNodes.entrySet()) {
			Node node = entry.getValue();
			entry.getKey().setBounds(
					new Rectangle(node.x, node.y, node.width, node.height));
		}
		for (Map.Entry<Connection, Edge> entry : connectionToEdges.entrySet()) {
			Connection connection = entry.getKey();
			PointList points = entry.getValue().getPoints();
			List<Bendpoint> bendpoints = Lists.newArrayList();
			for (int i = 0; i < points.size(); ++i) {
				bendpoints.add(new AbsoluteBendpoint(points.getPoint(i)));
			}
			connection.setRoutingConstraint(bendpoints);
		}
	}

	protected Layer getConnectionLayer(IFigure container) {
		if (container instanceof LayeredPane) {
			Layer layer = ((LayeredPane) container)
					.getLayer("Connection Layer");
			if (layer != null)
				return layer;
		}
		if (container != null)
			return getConnectionLayer(container.getParent());
		return null;
	}
}
