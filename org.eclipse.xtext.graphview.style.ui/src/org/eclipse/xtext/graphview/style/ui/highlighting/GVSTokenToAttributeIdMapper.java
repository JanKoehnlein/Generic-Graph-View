/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.xbase.ui.syntaxcoloring.XbaseTokenToAttributeIdMapper;

@SuppressWarnings("restriction")
public class GVSTokenToAttributeIdMapper extends XbaseTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_COLOR".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
