/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.buttons;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RelativeLocator;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class RapidButtonLocator extends RelativeLocator {

	public static final int OFFSET = 10;

	private boolean isOutside;

	public RapidButtonLocator(IFigure reference, int direction, boolean isOutside) {
		super(reference, direction);
		this.isOutside = isOutside;
	}

	@Override
	protected Rectangle getReferenceBox() {
		Rectangle box = super.getReferenceBox().getCopy();
		Dimension dimension;
		if(isOutside)
			dimension = new Dimension(OFFSET, OFFSET +  2);
		else if(getReferenceFigure() instanceof Shape) {
			Shape shape = (Shape)getReferenceFigure();
			int lineWidth = shape.getLineWidth();
			dimension = new Dimension(OFFSET + lineWidth, OFFSET + lineWidth - 1);
		} else 
			dimension = new Dimension(OFFSET, OFFSET);
		getReferenceFigure().translateToRelative(dimension);
		Insets insets = new Insets(dimension.width, dimension.width, dimension.height, dimension.height);
		if (isOutside)
			box.expand(insets);
		else
			box.shrink(insets);
		return box;
	}

}
