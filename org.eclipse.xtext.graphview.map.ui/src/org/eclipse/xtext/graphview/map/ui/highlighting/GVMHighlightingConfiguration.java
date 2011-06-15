package org.eclipse.xtext.graphview.map.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class GVMHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String MAPPING_NAME_ID = "mapping name";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(MAPPING_NAME_ID, "Mapping Name", mappingTextStyle());
	}
	
	public TextStyle mappingTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
