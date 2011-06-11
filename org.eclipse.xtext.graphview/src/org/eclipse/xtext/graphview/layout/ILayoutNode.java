package org.eclipse.xtext.graphview.layout;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public interface ILayoutNode {

	public Dimension getPreferredSize();
	
	public void setLocation(Point position);
	
	public void setBounds(Rectangle bounds);
}
