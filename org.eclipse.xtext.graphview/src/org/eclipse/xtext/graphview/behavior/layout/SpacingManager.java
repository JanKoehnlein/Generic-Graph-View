package org.eclipse.xtext.graphview.behavior.layout;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class SpacingManager {

	private double scale = 1;
	
	public double getScale() {
		return scale;
	}
	
	public void setScale(double scale) {
		this.scale = scale;
	}
	
	public void respaceChildren(IFigure parent) {
		for(Object child: parent.getChildren()) {
			if (child instanceof Connection) {
				PointList points = ((Connection) child).getPoints();
				points.performScale(scale);
			}  
			if(child instanceof IFigure) {
				Rectangle bounds = ((IFigure) child).getBounds();
 				bounds.x *= scale;
				bounds.y *= scale;
				((IFigure)child).setBounds(bounds);
			}
		}
		for(Object child: parent.getChildren()) {
			if (child instanceof IFigure) {
				((IFigure) child).revalidate();
			}
		}
	}
}
