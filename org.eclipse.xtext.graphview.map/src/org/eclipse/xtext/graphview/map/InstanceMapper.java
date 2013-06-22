/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map;

import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureNames;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class InstanceMapper implements IInstanceMapper {

	private static final Logger LOG = Logger.getLogger(InstanceMapper.class);

	@Inject
	private XbaseInterpreter xbaseInterpreter;

	@Inject
	private Provider<IEvaluationContext> contextProvider;

	private ClassLoader classLoader;

	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public Object map(AbstractExpressionMapping mapping, Object thisElement) {
		if (mapping.getUnlessCondition() != null) {
			Object unless = evaluate(mapping.getUnlessCondition(), thisElement);
			if (unless instanceof Boolean && ((Boolean) unless).booleanValue()) {
				return null;
			}
		}
		Object value = evaluate(mapping.getExpression(), thisElement);
		if (mapping.isMulti()) {
			if (value == null) {
				return Collections.EMPTY_LIST;
			} else if (value.getClass().isArray()) {
				return Lists.newArrayList((Object[]) value);
			} else if (!(value instanceof Iterable<?>)) {
				return Collections.singletonList(value);
			}
		}
		return value;
	}

	protected Object evaluate(XExpression expression, Object thisElement) {
		xbaseInterpreter.setClassLoader(classLoader);
		IEvaluationContext evaluationContext = contextProvider.get();
		evaluationContext.newValue(IFeatureNames.THIS, thisElement);
		IEvaluationResult result = xbaseInterpreter.evaluate(expression, evaluationContext, CancelIndicator.NullImpl);
		if (result.getException() != null) {
			LOG.error("Error applying mapping", result.getException());
			return null;
		}
		Object value = result.getResult();
		return value;
	}
}
