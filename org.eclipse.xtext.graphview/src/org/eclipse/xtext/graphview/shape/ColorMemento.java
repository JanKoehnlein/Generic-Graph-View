/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;

import com.google.common.collect.Maps;

public class ColorMemento {

	private Map<IFigure, Color> fgColors;

	private Map<IFigure, Color> bgColors;

	public ColorMemento(IFigure parent) {
		fgColors = Maps.newHashMap();
		bgColors = Maps.newHashMap();
		addFigure(parent);
	}

	protected void addFigure(IFigure parent) {
		if (parent != null) {
			fgColors.put(parent, parent.getForegroundColor());
			bgColors.put(parent, parent.getBackgroundColor());
			for (Object child : parent.getChildren()) {
				if (child instanceof IFigure) {
					addFigure((IFigure) child);
				}
			}
		}
	}

	public void restore() {
		for (Map.Entry<IFigure, Color> entry : fgColors.entrySet())
			entry.getKey().setForegroundColor(entry.getValue());
		for (Map.Entry<IFigure, Color> entry : bgColors.entrySet())
			entry.getKey().setBackgroundColor(entry.getValue());
	}

}
