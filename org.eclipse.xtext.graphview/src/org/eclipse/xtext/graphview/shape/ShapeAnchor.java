/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * For some reason, the original {@link ChopboxAnchor} produces ugly results.
 * 
 * @author Jan Koehnlein
 */
public class ShapeAnchor extends ChopboxAnchor {
	
	public ShapeAnchor(IFigure owner) {
		super(owner);
	}
	
	public Point getLocation(Point reference) {
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(getBox());
		getOwner().translateToAbsolute(r);
		double centerX = r.x + .5 * r.width;
		double centerY = r.y + .5 * r.height;

		if (r.isEmpty()
				|| (reference.x == (int) centerX && reference.y == (int) centerY))
			return new Point((int) centerX, (int) centerY); // This avoids
															// divide-by-zero

		double dx = reference.x - centerX;
		double dy = reference.y - centerY;

		// r.width, r.height, dx, and dy are guaranteed to be non-zero.
		double scale = .5 / Math.max(Math.abs(dx) / r.width, Math.abs(dy)
				/ r.height);

		dx *= scale;
		dy *= scale;
		centerX += dx;
		centerY += dy;

		return new PrecisionPoint(centerX, centerY);
	}

}
