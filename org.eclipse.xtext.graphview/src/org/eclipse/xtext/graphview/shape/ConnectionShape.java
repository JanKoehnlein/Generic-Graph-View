package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;

public class ConnectionShape extends PolylineConnection {

	public ConnectionShape() {
		setConnectionRouter(new BendpointConnectionRouter());
		setTargetDecoration(new PolylineDecoration());
	}
	
}
