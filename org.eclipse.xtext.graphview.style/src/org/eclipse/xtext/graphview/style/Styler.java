package org.eclipse.xtext.graphview.style;

import org.apache.log4j.Logger;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.style.scoping.GraphViewStyleScopeProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class Styler implements IStyler {

	private static final Logger LOG = Logger.getLogger(Styler.class);

	@Inject
	protected XbaseInterpreter xbaseInterpreter;

	@Inject
	private Provider<IEvaluationContext> contextProvider;

	public void setClassLoader(ClassLoader classLoader) {
		xbaseInterpreter.setClassLoader(classLoader);
	}

	public boolean style(Object figure, Object semanticElement, Style style) {
		if(style.getExpression() == null) 
			return true;
		try {
			JvmParameterizedTypeReference javaClass = style.getJavaClass();
			String styleClassName = javaClass.getIdentifier();
			if (Strings.equal(styleClassName, figure.getClass().getCanonicalName())) {
				IEvaluationContext context = contextProvider.get();
				context.newValue(XbaseScopeProvider.THIS, figure);
				context.newValue(GraphViewStyleScopeProvider.SEMANTIC_ELEMENT, semanticElement);
				xbaseInterpreter.evaluate(style.getExpression(), context,
						CancelIndicator.NullImpl);
				return true;
			}
		} catch (Exception e) {
			LOG.error("Error styling " + Strings.notNull(figure), e);
		}
		return false;
	}

}
