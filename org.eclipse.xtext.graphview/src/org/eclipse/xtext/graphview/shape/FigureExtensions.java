package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.graphview.style.type.ColorLiteral;

public class FigureExtensions {

	public static Color foreground(IFigure figure, ColorLiteral colorLiteral) {
		Color color = getColor(colorLiteral);
		figure.setForegroundColor(color);
		return color;
	}

	public static Color background(IFigure figure, ColorLiteral colorLiteral) {
		Color color = getColor(colorLiteral);
		figure.setBackgroundColor(color);
		return color;
	}

	public static Color color(IFigure figure, ColorLiteral literal) {
		return getColor(literal);
	}
	
	private static Color getColor(ColorLiteral literal) {
		String symbolicName = literal.toString();
		if(!JFaceResources.getColorRegistry().hasValueFor(symbolicName)) {
			RGB rgb = new RGB(literal.getRed(), literal.getGreen(), literal.getBlue());
			JFaceResources.getColorRegistry().put(symbolicName, rgb);
		}
		return JFaceResources.getColorRegistry().getColorDescriptor(symbolicName).createColor(Display.getDefault());
	}
	
	public static Font font(IFigure figure, String fontName, int height, int style) {
		FontData fontData = new FontData(fontName, height, style);
		String symbolicName = fontData.toString();
		if(!JFaceResources.getFontRegistry().hasValueFor(symbolicName)) {
			JFaceResources.getFontRegistry().put(symbolicName,
					new FontData[] { fontData });
		}
		Font font = JFaceResources.getFontRegistry().get(symbolicName);
		figure.setFont(font);
		return font;
	}
}
