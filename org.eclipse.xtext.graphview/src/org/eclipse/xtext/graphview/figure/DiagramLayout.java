package org.eclipse.xtext.graphview.figure;

import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.Node;

import com.google.common.collect.Maps;

public class DiagramLayout extends AbstractLayout {

	protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
		container.validate();
		List<?> children = container.getChildren();
		Rectangle result =
			new Rectangle().setLocation(container.getClientArea().getLocation());
		for (int i = 0; i < children.size(); i++)
			result.union(((IFigure)children.get(i)).getBounds());
		result.resize(container.getInsets().getWidth(), container.getInsets().getHeight());
		return result.getSize();
	}

	@SuppressWarnings("unchecked")
	public void layout(IFigure container) {
		CompoundDirectedGraph graph = new CompoundDirectedGraph();
		Map<INodeFigure, Node> childrenToNodes = Maps.newHashMap();
		for(Object child: container.getChildren()) {
			if (child instanceof INodeFigure) {
				INodeFigure childFigure = (INodeFigure) child;
				Node graphNode = new Node();
				graphNode.setSize(childFigure.getPreferredSize());
				childrenToNodes.put(childFigure, graphNode);
				graph.nodes.add(graphNode);
			}
		}
		new CompoundDirectedGraphLayout().visit(graph);
		for(Map.Entry<INodeFigure, Node> entry : childrenToNodes.entrySet()) {
			Node node = entry.getValue();
			entry.getKey().setBounds(new Rectangle(node.x, node.y, node.width, node.height));
		}
	}


}
