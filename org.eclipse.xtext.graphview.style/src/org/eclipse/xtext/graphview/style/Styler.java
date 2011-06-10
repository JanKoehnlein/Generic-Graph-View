package org.eclipse.xtext.graphview.style;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class Styler implements IStyler {

	private static final Logger LOG = Logger.getLogger(Styler.class);
	
	@Inject
	protected XbaseInterpreter xbaseInterpreter;
	
	@Inject
	private Provider<IEvaluationContext> contextProvider;

	protected StyleSheet styleSheet;
	
	public void setStyleSheet(StyleSheet styleSheet) {
		if(styleSheet != null) {
			Resource resource = styleSheet.eResource();
			if(resource==null || resource.getErrors().isEmpty()) { 
				this.styleSheet = styleSheet;
				return;
			}
		}
		throw new IllegalArgumentException("Invalid stylesheet");
	}

	public boolean style(Object o, String styleName) {
		try {
			Style style = findStyle(styleName);
			JvmParameterizedTypeReference javaClass = style.getJavaClass();
			String styleClassName = javaClass.getIdentifier();
			if (Strings.equal(styleClassName, o.getClass().getCanonicalName())) {
				for (XAssignment setting : style.getSettings()) {
					IEvaluationContext context = contextProvider.get();
					context.newValue(XbaseScopeProvider.THIS, o);
					xbaseInterpreter.evaluate(setting, context, CancelIndicator.NullImpl);
				}
				return true;
			}
		} catch (Exception e) {
			LOG.error("Error styling " + Strings.notNull(o), e);
		}
		return false;
	}

	protected Style findStyle(final String styleName) {
		return Iterables.find(styleSheet.getStyles(), new Predicate<Style>() {
			@Override
			public boolean apply(Style style) {
				return Strings.equal(styleName, style.getName());
			}
		});
	}

}
