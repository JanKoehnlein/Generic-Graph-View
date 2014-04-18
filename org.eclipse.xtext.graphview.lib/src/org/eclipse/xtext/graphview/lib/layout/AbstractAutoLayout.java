/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.layout;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ShortestPathConnectionRouter;

public abstract class AbstractAutoLayout implements IAutoLayout {

	private ConnectionRouter connectionRouter;

	public void setConnectionRouter(ConnectionRouter connectionRouter) {
		this.connectionRouter = connectionRouter;
	}

	public ConnectionRouter getConnectionRouter(IFigure container) {
		return (connectionRouter == null) ? new ShortestPathConnectionRouter(container) : connectionRouter;
	}
}