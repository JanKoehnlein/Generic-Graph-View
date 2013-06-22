/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;

/**
 * @author Jan Koehnlein
 */
public class DiamondDecoration extends PolygonDecoration {

	public DiamondDecoration() {
		PointList points = new PointList(new int[] { -2, 0, -1, -1, 0, 0, -1, 1 }); 
		setTemplate(points);
		setScale(8,5);
		setLineWidth(2);
		setOpaque(true);
		setBackgroundColor(ColorConstants.white);
	}
}
