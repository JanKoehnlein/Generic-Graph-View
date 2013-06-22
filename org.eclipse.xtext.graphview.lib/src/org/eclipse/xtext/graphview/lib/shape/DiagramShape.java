/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.graphview.lib.layout.IAutoLayout;
import org.eclipse.xtext.graphview.lib.layout.KielerAutoLayout;
import org.eclipse.xtext.graphview.lib.literals.FontLiterals;

public class DiagramShape extends FreeformLayer {

	private IAutoLayout autoLayoutManager;

	public DiagramShape() {
		setLayoutManager(new FreeformLayout());
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
	public Rectangle getFreeformExtent() {
		Rectangle freeformExtent = super.getFreeformExtent();
		Viewport parentViewport = FigureUtil.findParentOfType(this, Viewport.class);
		if (parentViewport != null ) {
			Dimension viewDimension = parentViewport.getBounds().getSize();
			parentViewport.translateToAbsolute(viewDimension);
			translateToRelative(viewDimension);
			viewDimension.shrink(freeformExtent.getSize());
			viewDimension.width = Math.max(0,  viewDimension.width);
			viewDimension.height = Math.max(0,  viewDimension.height);
			return freeformExtent.getExpanded(new Insets(viewDimension.height, viewDimension.width, viewDimension.height,
					viewDimension.width));
		}
		return freeformExtent;
	}
}
