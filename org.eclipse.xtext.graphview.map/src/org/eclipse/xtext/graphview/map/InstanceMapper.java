package org.eclipse.xtext.graphview.map;

import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class InstanceMapper implements IInstanceMapper {

	private static final Logger LOG = Logger.getLogger(InstanceMapper.class);

	@Inject
	private XbaseInterpreter xbaseInterpreter;

	@Inject
	private Provider<IEvaluationContext> contextProvider;

	@Override
	public void setClassLoader(ClassLoader classLoader) {
		xbaseInterpreter.setClassLoader(classLoader);
	}
	
	@Override
	public Object map(AbstractExpressionMapping mapping, Object thisElement) {
		Object value = evaluate(mapping.getExpression(), thisElement);
		if (mapping.isMulti()) {
			if (value == null) {
				return Collections.EMPTY_LIST;
			} else if (!(value instanceof Iterable<?>)) {
				return Collections.singletonList(value);
			}
		}
		return value;
	}

	protected Object evaluate(XExpression expression, Object thisElement) {
		IEvaluationContext evaluationContext = contextProvider.get();
		evaluationContext.newValue(XbaseScopeProvider.THIS, thisElement);
		IEvaluationResult result = xbaseInterpreter.evaluate(expression,
				evaluationContext, CancelIndicator.NullImpl);
		if (result.getException() != null) {
			LOG.error("Error applying mapping", result.getException());
			return null;
		}
		Object value = result.getResult();
		return value;
	}
}
