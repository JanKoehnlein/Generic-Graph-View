package org.eclipse.xtext.graphview.shape;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.graphview.style.type.ColorLiteral;

public class ColorLiterals {

	public static Color color(ColorLiteral literal) {
		String symbolicName = literal.toString();
		if(!JFaceResources.getColorRegistry().hasValueFor(symbolicName)) {
			RGB rgb = new RGB(literal.getRed(), literal.getGreen(), literal.getBlue());
			JFaceResources.getColorRegistry().put(symbolicName, rgb);
		}
		return JFaceResources.getColorRegistry().getColorDescriptor(symbolicName).createColor(Display.getDefault());
	}
	
	public static Color color(int red, int green, int blue) {
		return color(new ColorLiteral(red, green, blue));
	}
}
