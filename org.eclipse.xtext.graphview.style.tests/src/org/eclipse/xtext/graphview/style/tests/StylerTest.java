package org.eclipse.xtext.graphview.style.tests;

import javax.swing.JButton;

import org.eclipse.xtext.graphview.style.GraphViewStyleInjectorProvider;
import org.eclipse.xtext.graphview.style.Styler;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(GraphViewStyleInjectorProvider.class)
public class StylerTest {

	@Inject
	private ParseHelper<StyleSheet> parseHelper;
	
	@Inject
	private Styler styler;
	
	@Test
	public void testStylerSimple() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("myStyle javax.swing.JButton { text : 'hugo' }");
		styler.setStyleSheet(styleSheet);
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, "myStyle"));
		Assert.assertEquals("hugo", jButton.getText());
	}
	
	@Test
	public void testStylerExpression() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("myStyle javax.swing.JButton { text : ('hugo' + 'egon').toFirstUpper }");
		styler.setStyleSheet(styleSheet);
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, "myStyle"));
		Assert.assertEquals("Hugoegon", jButton.getText());
	}

	@Test
	public void testStylerWrongName() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("myStyle javax.swing.JButton { text : 'hugo' }");
		styler.setStyleSheet(styleSheet);
		JButton jButton = new JButton();
		Assert.assertFalse(styler.style(jButton, "yourStyle"));
		Assert.assertEquals("", jButton.getText());
	}

	@Test
	public void testStylerWrongType() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("myStyle java.lang.Object { text : 'hugo' }");
		styler.setStyleSheet(styleSheet);
		JButton jButton = new JButton();
		Assert.assertFalse(styler.style(jButton, "myStyle"));
		Assert.assertEquals("", jButton.getText());
	}

	@Test
	public void testStylerImport() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("import javax.swing.JButton myStyle JButton { text : 'hugo' }");
		styler.setStyleSheet(styleSheet);
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, "myStyle"));
		Assert.assertEquals("hugo", jButton.getText());
	}

	@Test
	public void testStylerWildcardImport() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("import javax.swing.* myStyle JButton { text : 'hugo' }");
		styler.setStyleSheet(styleSheet);
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, "myStyle"));
		Assert.assertEquals("hugo", jButton.getText());
	}

}
