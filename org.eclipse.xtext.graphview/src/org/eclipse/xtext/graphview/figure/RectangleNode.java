package org.eclipse.xtext.graphview.figure;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;

public class RectangleNode extends RectangleFigure implements INodeFigure {

	public RectangleNode() {
		// some reasonable defaults
		setSize(200,100);
		ToolbarLayout layout = new ToolbarLayout(false);
		layout.setSpacing(5);
		layout.setStretchMinorAxis(true);
		setLayoutManager(layout);
		setBorder(new MarginBorder(5, 5, 5, 5));
	}
	
}
