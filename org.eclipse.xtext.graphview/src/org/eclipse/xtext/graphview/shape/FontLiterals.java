package org.eclipse.xtext.graphview.shape;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class FontLiterals {

	public static Font font(String fontName, int height, int style) {
		FontData fontData = new FontData(fontName, height, style);
		String symbolicName = fontData.toString();
		if(!JFaceResources.getFontRegistry().hasValueFor(symbolicName)) {
			JFaceResources.getFontRegistry().put(symbolicName,
					new FontData[] { fontData });
		}
		Font font = JFaceResources.getFontRegistry().get(symbolicName);
		return font;
	}

}
