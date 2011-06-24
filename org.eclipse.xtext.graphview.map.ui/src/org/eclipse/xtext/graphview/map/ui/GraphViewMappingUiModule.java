/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.graphview.map.ui.highlighting.GVMHighlightingCalculator;
import org.eclipse.xtext.graphview.map.ui.highlighting.GVMHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GraphViewMappingUiModule extends org.eclipse.xtext.graphview.map.ui.AbstractGraphViewMappingUiModule {
	public GraphViewMappingUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return GVMHighlightingCalculator.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return GVMHighlightingConfiguration.class;
	}
}
