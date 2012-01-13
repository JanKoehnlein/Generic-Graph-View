/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.config;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SelectDiagramConfigurationAction extends Action {

	@Inject
	private Provider<SelectDiagramConfigurationDialog> configurationDialogProvider;

	public SelectDiagramConfigurationAction() {
		setText("Config");
		setToolTipText("Select diagram configuration");
	}

	@Inject
	protected void setImages(PluginImageHelper pluginImageHelper) {
		setImageDescriptor(ImageDescriptor.createFromImage(pluginImageHelper.getImage("elcl16/configure.gif")));
	}

	@Override
	public void run() {
		SelectDiagramConfigurationDialog configurationDialog = configurationDialogProvider.get();
		configurationDialog.open();
	}
}
