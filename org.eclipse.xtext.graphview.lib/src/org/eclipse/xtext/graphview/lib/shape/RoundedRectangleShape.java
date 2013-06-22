/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.xtext.graphview.lib.layout.ILayoutNode;
import org.eclipse.xtext.graphview.lib.literals.ColorLiteral;
import org.eclipse.xtext.graphview.lib.literals.ColorLiterals;

public class RoundedRectangleShape extends RoundedRectangle implements ILayoutNode {

	public RoundedRectangleShape() {
		// some reasonable defaults
		setSize(200, 100);
		setLineWidth(2);
		setForegroundColor(ColorConstants.buttonDarkest);
		setBackgroundColor(ColorLiterals.color(new ColorLiteral("#deedf5")));
		DefaultNodeLayout layout = new DefaultNodeLayout();
		layout.setSpacing(5);
		layout.setStretchMinorAxis(true);
		setLayoutManager(layout);
		setBorder(new MarginBorder(5, 5, 5, 5));
	}
}
