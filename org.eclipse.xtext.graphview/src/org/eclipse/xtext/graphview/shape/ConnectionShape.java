/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;

public class ConnectionShape extends PolylineConnection {

	public ConnectionShape() {
		setLineWidth(2);
		setForegroundColor(ColorConstants.buttonDarker);
		setConnectionRouter(new BendpointConnectionRouter());
		PolylineDecoration target = new PolylineDecoration();
		target.setLineWidth(2);
		target.setScale(8, 4);
		setTargetDecoration(target);
	}

}
