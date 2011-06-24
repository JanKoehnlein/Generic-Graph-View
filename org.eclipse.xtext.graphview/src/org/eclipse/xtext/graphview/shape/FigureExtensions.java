/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.style.type.ColorLiteral;

public class FigureExtensions {

	public static void foreground(IFigure figure, ColorLiteral colorLiteral) {
		figure.setForegroundColor(ColorLiterals.color(colorLiteral));
	}

	public static void background(IFigure figure, ColorLiteral colorLiteral) {
		figure.setBackgroundColor(ColorLiterals.color(colorLiteral));
	}

	public static void font(IFigure figure, String fontName, int height, int style) {
		figure.setFont(FontLiterals.font(fontName, height, style));
	}
}
