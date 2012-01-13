/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.draw2d.Graphics;
import org.eclipse.gef.handles.AbstractHandle;
import org.eclipse.swt.graphics.Image;

public abstract class AbstractRapidButton extends AbstractHandle {

	private Image image;

	private RapidButtonEditPolicy editPolicy;

	public void init(RapidButtonEditPolicy editPolicy, int position, boolean isOutside) {
		this.editPolicy = editPolicy;
		setPreferredSize(getImage().getBounds().width, getImage().getBounds().height);
		setOwner(editPolicy.getHost());
		setLocator(new RapidButtonLocator(editPolicy.getHost().getFigure(), position, isOutside));
	}

	protected abstract Image createImage();

	protected Image getImage() {
		if (image == null)
			image = createImage();
		return image;
	}

	@Override
	public void paintFigure(Graphics g) {
		g.drawImage(getImage(), getBounds().getLocation());
	}

	protected RapidButtonEditPolicy getEditPolicy() {
		return editPolicy;
	}

}
