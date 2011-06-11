package org.eclipse.xtext.graphview.shape;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class Resources {

	public static Color color(int r, int g, int b) {
		RGB rgb = new RGB(r, g, b);
		JFaceResources.getColorRegistry().put(rgb.toString(), rgb);
		return JFaceResources.getColorRegistry()
				.getColorDescriptor(rgb.toString())
				.createColor(Display.getDefault());
	}

	public static Color color(String rgb) {
		if (rgb.startsWith("#") && rgb.length() == 7) {
			int r = Integer.parseInt(rgb.substring(1, 3), 16);
			int g = Integer.parseInt(rgb.substring(3, 5), 16);
			int b = Integer.parseInt(rgb.substring(5, 7), 16);
			return color(r, g, b);
		}
		return null;
	}

	public static Font font(String name, int height, int style) {
		FontData fontData = new FontData(name, height, style);
		JFaceResources.getFontRegistry().put(fontData.toString(),
				new FontData[] { fontData });
		return JFaceResources.getFontRegistry().get(fontData.toString());
	}
}
