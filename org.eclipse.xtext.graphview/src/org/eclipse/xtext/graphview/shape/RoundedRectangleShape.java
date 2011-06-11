package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.xtext.graphview.layout.ILayoutNode;

public class RoundedRectangleShape extends RoundedRectangle implements ILayoutNode {

	public RoundedRectangleShape() {
		setSize(200,100);
		ToolbarLayout layout = new ToolbarLayout(false);
		layout.setSpacing(5);
		layout.setStretchMinorAxis(true);
		setLayoutManager(layout);
		setBorder(new MarginBorder(5, 5, 5, 5));
	}
}
