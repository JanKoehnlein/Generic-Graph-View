/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class DefaultNodeLayout extends ToolbarLayout {

	public DefaultNodeLayout() {
		super(false);
	}

	@Override
	public void layout(IFigure parent) {
		super.layout(parent);
		Rectangle bounds = null;
		for (Object child : parent.getChildren()) {
			if (child instanceof IFigure) {
				if (bounds == null)
					bounds = ((IFigure) child).getBounds().getCopy();
				else
					bounds.union(((IFigure) child).getBounds());
			}
		}
		if (bounds == null)
			return;
		Insets insets = parent.getInsets();
		if (insets != null)
			bounds.expand(insets);
		preferredSize = bounds.getSize();
		parent.setSize(preferredSize);
		parent.setMinimumSize(preferredSize);
		parent.setPreferredSize(preferredSize);
	}
	
	@Override
	protected Dimension calculateMinimumSize(IFigure container, int wHint, int hHint) {
		return calculatePreferredSize(container, -1, -1);
	}
}
