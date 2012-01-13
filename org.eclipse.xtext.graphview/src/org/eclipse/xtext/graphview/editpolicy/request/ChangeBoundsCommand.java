/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpolicy.request;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;

public class ChangeBoundsCommand extends Command {
	private ChangeBoundsRequest request;

	private Rectangle originalBounds;

	private GraphicalEditPart child;

	public ChangeBoundsCommand(ChangeBoundsRequest request, GraphicalEditPart child) {
		this.request = request;
		this.child = child;
	}

	@Override
	public void execute() {
		IFigure figure = child.getFigure();
		originalBounds = figure.getBounds();
		figure.setBounds(request.getTransformedRectangle(originalBounds));
		figure.validate();
	}

	@Override
	public void undo() {
		IFigure figure = child.getFigure();
		figure.setBounds(originalBounds);
		figure.validate();
	}
}