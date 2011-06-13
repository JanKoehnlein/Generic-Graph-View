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
