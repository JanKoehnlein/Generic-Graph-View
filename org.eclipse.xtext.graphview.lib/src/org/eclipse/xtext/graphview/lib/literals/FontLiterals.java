/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.literals;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class FontLiterals {

	public static Font font(String fontName, int height, int style) {
		FontData fontData = new FontData(fontName, height, style);
		String symbolicName = fontData.toString();
		if (!JFaceResources.getFontRegistry().hasValueFor(symbolicName)) {
			JFaceResources.getFontRegistry().put(symbolicName, new FontData[] { fontData });
		}
		Font font = JFaceResources.getFontRegistry().get(symbolicName);
		return font;
	}

}
