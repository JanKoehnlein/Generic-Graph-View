package org.eclipse.xtext.graphview.figure;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public interface INodeFigure {

	public Dimension getPreferredSize();
	
	public void setBounds(Rectangle bounds);
}
