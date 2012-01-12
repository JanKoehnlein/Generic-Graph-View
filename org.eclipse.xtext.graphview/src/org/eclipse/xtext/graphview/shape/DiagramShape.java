/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.graphview.layout.IAutoLayout;
import org.eclipse.xtext.graphview.layout.KielerAutoLayout;

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
}
