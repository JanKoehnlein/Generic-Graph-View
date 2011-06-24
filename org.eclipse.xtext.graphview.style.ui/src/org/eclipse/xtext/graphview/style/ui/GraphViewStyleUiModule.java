/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.graphview.style.ui.highlighting.GVSHighlightingCalculator;
import org.eclipse.xtext.graphview.style.ui.highlighting.GVSHighlightingConfiguration;
import org.eclipse.xtext.graphview.style.ui.highlighting.GVSTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GraphViewStyleUiModule extends org.eclipse.xtext.graphview.style.ui.AbstractGraphViewStyleUiModule {
	public GraphViewStyleUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return GVSTokenToAttributeIdMapper.class;
	}
	
	@Override
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return GVSHighlightingCalculator.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return GVSHighlightingConfiguration.class;
	}
}
