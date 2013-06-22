package org.eclipse.xtext.graphview.behavior.layout;

import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.xtext.graphview.lib.shape.FigureUtil;

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
			if(child instanceof IFigure) {
				Rectangle bounds = ((IFigure) child).getBounds();
 				bounds.x *= scale;
				bounds.y *= scale;
				((IFigure)child).setBounds(bounds);
			}
		}
		for(Object child: parent.getChildren()) {
			if(child instanceof IFigure) ((IFigure) child).revalidate();
		}
		Layer connectionLayer = FigureUtil.getConnectionLayer(parent);
		if(connectionLayer != null) {
			for(Object child: connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					Connection connection = (Connection) child;
					ConnectionRouter connectionRouter = connection.getConnectionRouter();
					Object constraint = connectionRouter.getConstraint(connection);
					if(constraint instanceof List<?>) {
						for(Object bendpoint: (List<?>) constraint) {
							if (bendpoint instanceof AbsoluteBendpoint) {
								((AbsoluteBendpoint) bendpoint).scale(scale);
							}
						}
					}
				}
			}
		}
	}
}
