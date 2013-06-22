/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.graphview.lib.literals.ColorLiterals;

public class TransparencyHelper {

	private ColorMemento colorMemento;

	private IFigure figure;

	public static final int WHITENING_DELTA = 100;

	public void setFigure(IFigure figure) {
		this.figure = figure;
	}

	public void setTransparent(boolean isTransparent) {
		if (isTransparent) {
			if (colorMemento == null) {
				colorMemento = new ColorMemento(figure);
				makeTransparent(figure);
			}
		} else {
			if (colorMemento != null) {
				colorMemento.restore();
				colorMemento = null;
			}
		}
	}

	public void makeTransparent(IFigure figure) {
		figure.setForegroundColor(makeTransparent(figure.getForegroundColor()));
		figure.setBackgroundColor(makeTransparent(figure.getBackgroundColor()));
		for (Object child : figure.getChildren())
			if (child instanceof IFigure)
				makeTransparent((IFigure) child);
	}

	protected Color makeTransparent(Color c) {
		if (c.getRed() == c.getGreen() && c.getGreen() == c.getBlue()) {
			int newValue = 127 + c.getRed() / 2;
			return ColorLiterals.color(newValue, newValue, newValue);
		}
		int red = c.getRed() + WHITENING_DELTA;
		int green = c.getGreen() + WHITENING_DELTA;
		int blue = c.getBlue() + WHITENING_DELTA;
		int max = Math.max(red, Math.max(green, blue));
		if (max > 255) {
			int delta = max - 255;
			red -= delta;
			green -= delta;
			blue -= delta;
		}
		return ColorLiterals.color(red, green, blue);
	}

	protected int makeTransparent(int color) {
		return Math.min(color + 64, 255);
	}

}
