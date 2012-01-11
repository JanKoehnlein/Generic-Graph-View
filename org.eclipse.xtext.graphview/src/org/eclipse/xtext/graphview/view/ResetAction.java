/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class ResetAction extends Action {

	@Inject
	private GraphView graphView;

	public ResetAction() {
		super();
		setText("Reset");
		setToolTipText("Reset this diagram");
	}
	
	@Inject 
	protected void setImages(PluginImageHelper imageHelper) {
		setImageDescriptor(ImageDescriptor.createFromImage(imageHelper
				.getImage("elcl16/refresh_nav.gif")));
		setDisabledImageDescriptor(ImageDescriptor.createFromImage(imageHelper
				.getImage("dlcl16/refresh_nav.gif")));
	}

	@Override
	public void run() {
		graphView.refresh();
	}
}