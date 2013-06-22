/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;

public class FigureUtil {

	public static Layer getConnectionLayer(IFigure container) {
		if (container != null) {
			LayeredPane layeredPane = findParentOfType(container, LayeredPane.class);
			if (layeredPane != null) {
				Layer layer = layeredPane.getLayer("Connection Layer");
				if (layer == null)
					return getConnectionLayer(layeredPane.getParent());
				else
					return layer;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T> T findParentOfType(IFigure figure, Class<T> type) {
		if (type.isInstance(figure))
			return (T) figure;
		if (figure.getParent() != null)
			return findParentOfType(figure.getParent(), type);
		return null;
	}

}
