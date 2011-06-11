package org.eclipse.xtext.graphview.layout;

import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.Node;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class DiagramGraphLayout extends AbstractDiagramLayout {

	@SuppressWarnings("unchecked")
	public void layout(IFigure container) {
		CompoundDirectedGraph graph = new CompoundDirectedGraph();
		Map<ILayoutNode, Node> childrenToNodes = Maps.newHashMap();
		Map<Connection, Edge> connectionToEdges = Maps.newHashMap();
		for (Object child : container.getChildren()) {
			if (child instanceof ILayoutNode) {
				ILayoutNode childFigure = (ILayoutNode) child;
				Node graphNode = new Node();
				graphNode.setSize(childFigure.getPreferredSize());
				childrenToNodes.put(childFigure, graphNode);
				graph.nodes.add(graphNode);
			}
		}
		Layer connectionLayer = getConnectionLayer(container);
		if (connectionLayer != null) {
			for (Object child : connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					Connection connection = (Connection) child;
					Node sourceNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					Node targetNode = childrenToNodes.get(connection
							.getSourceAnchor().getOwner());
					Edge edge = new Edge(sourceNode, targetNode);
					connectionToEdges.put(connection, edge);
					graph.edges.add(edge);
				}
			}
		}
		new DirectedGraphLayout().visit(graph);
		for (Map.Entry<ILayoutNode, Node> entry : childrenToNodes.entrySet()) {
			Node node = entry.getValue();
			ILayoutNode figure = entry.getKey();
			Dimension childPreferredSize = figure.getPreferredSize();
			figure.setBounds(new Rectangle(node.x, node.y,
					childPreferredSize.width, childPreferredSize.height));
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

}
