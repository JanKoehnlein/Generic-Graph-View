/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.layout;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.ShortestPathConnectionRouter;

public abstract class AbstractAutoLayout implements IAutoLayout {

	private ConnectionRouter connectionRouter;
	
	protected Layer getConnectionLayer(IFigure container) {
		LayeredPane layeredPane = findParentOfType(container, LayeredPane.class);
		if (layeredPane != null)
			return layeredPane.getLayer("Connection Layer");
		return null;
	}

	@SuppressWarnings("unchecked")
	protected <T> T findParentOfType(IFigure figure, Class<T> type) {
		if (type.isInstance(figure))
			return (T) figure;
		if (figure.getParent() != null)
			return findParentOfType(figure.getParent(), type);
		return null;
	}
	
	
	public void setConnectionRouter(ConnectionRouter connectionRouter) {
		this.connectionRouter = connectionRouter;
	}
	
	public ConnectionRouter getConnectionRouter(IFigure container) {
		return (connectionRouter == null) ? new ShortestPathConnectionRouter(container) : connectionRouter;
	}
}
