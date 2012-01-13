/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.config;

import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultDiagramConfigurationProvider.class)
public interface IDiagramConfigurationProvider {

	interface Listener {
		public void graphViewDefinitionChanged();
	}

	DiagramMapping getDiagramMapping();

	StyleSheet getStyleSheet();

	public void addConfigurationListener(Listener listener);

	public void removeConfigurationListener(Listener listener);
}
