/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.tests;

import org.eclipse.xtext.graphview.style.GraphViewStyleInjectorProvider;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GraphViewStyleInjectorProvider.class)
public class StylerTest {

	/*
	@Inject
	private ParseHelper<StyleSheet> parseHelper;
	
	@Inject
	private Styler styler;
	
	@Test
	public void testStylerSimple() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("stylesheet s style myStyle as javax.swing.JButton { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("hugo", jButton.getText());
	}
	
	@Test
	public void testStylerExpression() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("stylesheet s style myStyle as javax.swing.JButton { text = ('hugo' + 'egon').toFirstUpper }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("Hugoegon", jButton.getText());
	}

	@Test
	public void testStylerWrongType() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("stylesheet s style myStyle as java.lang.Object { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertFalse(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("", jButton.getText());
	}

	@Test
	public void testStylerImport() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("import javax.swing.JButton stylesheet s style myStyle as JButton { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("hugo", jButton.getText());
	}

	@Test
	public void testStylerWildcardImport() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("import javax.swing.* stylesheet s style myStyle as JButton { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("hugo", jButton.getText());
	}
    */
}
