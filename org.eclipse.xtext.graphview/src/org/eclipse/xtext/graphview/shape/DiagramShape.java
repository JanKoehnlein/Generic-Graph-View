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
import org.eclipse.xtext.graphview.layout.GridAutoLayout;
import org.eclipse.xtext.graphview.layout.IAutoLayout;

public class DiagramShape extends FreeformLayer {

	private IAutoLayout autoLayoutManager;
	
	public DiagramShape() {
		setLayoutManager(new XYLayout());
		setFont(FontLiterals.font("Helvetica", 11, SWT.None));
		setAutoLayoutManager(new GridAutoLayout());
	}

	public IAutoLayout getAutoLayoutManager() {
		return autoLayoutManager;
	}

	public void setAutoLayoutManager(IAutoLayout autoLayoutManager) {
		this.autoLayoutManager = autoLayoutManager;
	}
}
