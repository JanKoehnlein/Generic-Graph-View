/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style;

import org.eclipse.xtext.graphview.style.interpreter.GraphViewStyleInterpreter;
import org.eclipse.xtext.graphview.style.type.GVSStaticMethodsFeatureForTypeProvider;
import org.eclipse.xtext.graphview.style.type.GraphViewStyleTypeProvider;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class GraphViewStyleRuntimeModule extends org.eclipse.xtext.graphview.style.AbstractGraphViewStyleRuntimeModule {
	
	@Override
	public Class<? extends ITypeProvider> bindITypeProvider() {
		return GraphViewStyleTypeProvider.class;
	}
	
	public Class<? extends StaticMethodsFeatureForTypeProvider> bindStaticMethodsFeatureForTypeProvider() {
		return GVSStaticMethodsFeatureForTypeProvider.class;
	}
	
	public Class<? extends XbaseInterpreter> bindXbaseInterpreter() {
		return GraphViewStyleInterpreter.class;
	}
}
