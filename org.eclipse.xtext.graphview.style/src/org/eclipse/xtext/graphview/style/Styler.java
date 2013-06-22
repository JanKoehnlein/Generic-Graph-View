/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style;

import org.apache.log4j.Logger;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.style.type.GVSTypeResolver;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureNames;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Styler implements IStyler {

	private static final Logger LOG = Logger.getLogger(Styler.class);

	@Inject
	protected XbaseInterpreter xbaseInterpreter;

	@Inject
	private Provider<IEvaluationContext> contextProvider;

	private ClassLoader classLoader;

	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public boolean style(Object figure, Object semanticElement, Style style) {
		if (style.getExpression() == null)
			return true;
		try {
			JvmTypeReference javaClass = style.getJavaClass();
			if (javaClass == null || Strings.equal(javaClass.getIdentifier(), figure.getClass().getCanonicalName())) {
				xbaseInterpreter.setClassLoader(classLoader);
				IEvaluationContext context = contextProvider.get();
				context.newValue(IFeatureNames.THIS, figure);
				context.newValue(GVSTypeResolver.SEMANTIC_ELEMENT, semanticElement);
				xbaseInterpreter.evaluate(style.getExpression(), context, CancelIndicator.NullImpl);
				return true;
			}
		} catch (Exception e) {
			LOG.error("Error styling " + Strings.notNull(figure), e);
		}
		return false;
	}

}
