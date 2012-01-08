/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.graphview.layout.IAutoLayout;
import org.eclipse.xtext.graphview.layout.KielerAutoLayout;

public class DiagramShape extends FreeformLayer { // implements ScalableFigure 

	private IAutoLayout autoLayoutManager;

	public DiagramShape() {
		setLayoutManager(new XYLayout());
		setFont(FontLiterals.font("Helvetica", 12, SWT.BOLD));
		setAutoLayoutManager(new KielerAutoLayout());
	}

	public IAutoLayout getAutoLayoutManager() {
		return autoLayoutManager;
	}

	public void setAutoLayoutManager(IAutoLayout autoLayoutManager) {
		this.autoLayoutManager = autoLayoutManager;
	}

	@Override
	protected boolean useLocalCoordinates() {
		return true;
	}

	// private double scale = 1.0;
	//
	// /**
	// * @see org.eclipse.draw2d.Figure#getClientArea()
	// */
	// public Rectangle getClientArea(Rectangle rect) {
	// rect = new PrecisionRectangle(super.getClientArea(rect));
	// rect.scale(scale);
	// return rect;
	// }
	//
	// /**
	// * Returns the current zoom scale level.
	// *
	// * @return the scale
	// */
	// public double getScale() {
	// return scale;
	// }
	//
	// /**
	// * @see org.eclipse.draw2d.IFigure#isCoordinateSystem()
	// */
	// public boolean isCoordinateSystem() {
	// return true;
	// }
	//
	// /**
	// * @see org.eclipse.draw2d.Figure#paintClientArea(Graphics)
	// */
	// protected void paintClientArea(Graphics graphics) {
	// if (getChildren().isEmpty())
	// return;
	//
	// PrecisionRectangle absBounds = new PrecisionRectangle(getBounds());
	// translateToAbsolute(absBounds);
	// if(absBounds.width *absBounds.height < 5000)
	// return;
	//
	// boolean optimizeClip = getBorder() == null || getBorder().isOpaque();
	// if (scale == 1.0) {
	// super.paintClientArea(graphics);
	// } else if (useLocalCoordinates()) {
	// graphics.translate(getBounds().x + getInsets().left, getBounds().y
	// + getInsets().top);
	// ScaledGraphics g = new ScaledGraphics(graphics);
	// g.scale(scale);
	//
	// // if (!optimizeClip)
	// // g.clipRect(getClientArea());
	// g.pushState();
	// paintChildren(g);
	// g.dispose();
	// graphics.restoreState();
	// }
	// }
	//
	// /**
	// * Sets the zoom level
	// *
	// * @param newZoom
	// * The new zoom level
	// */
	// public void setScale(double newZoom) {
	// if (scale == newZoom)
	// return;
	// scale = newZoom;
	// repaint();
	// }
	//
	// /**
	// * @see org.eclipse.draw2d.Figure#translateToParent(Translatable)
	// */
	// public void translateToParent(Translatable t) {
	// t.performScale(scale);
	// super.translateToParent(t);
	// }
	//
	// /**
	// * @see org.eclipse.draw2d.Figure#translateFromParent(Translatable)
	// */
	// public void translateFromParent(Translatable t) {
	// super.translateFromParent(t);
	// t.performScale(1 / scale);
	// }
	//
}
