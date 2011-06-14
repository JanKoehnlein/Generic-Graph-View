package org.eclipse.xtext.graphview.style.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.xbase.ui.syntaxcoloring.XbaseTokenToAttributeIdMapper;

@SuppressWarnings("restriction")
public class GVSTokenToAttributeIdMapper extends XbaseTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if("RULE_COLOR".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
