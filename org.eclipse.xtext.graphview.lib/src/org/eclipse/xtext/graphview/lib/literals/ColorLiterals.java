/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.literals;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorLiterals {

	public static Color color(ColorLiteral literal) {
		String symbolicName = literal.toString();
		if (!JFaceResources.getColorRegistry().hasValueFor(symbolicName)) {
			RGB rgb = new RGB(literal.getRed(), literal.getGreen(), literal.getBlue());
			JFaceResources.getColorRegistry().put(symbolicName, rgb);
		}
		return JFaceResources.getColorRegistry().getColorDescriptor(symbolicName).createColor(Display.getDefault());
	}

	public static Color color(int red, int green, int blue) {
		return color(new ColorLiteral(red, green, blue));
	}
}
