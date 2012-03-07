/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style;

import org.eclipse.xtext.graphview.style.interpreter.GraphViewStyleInterpreter;
import org.eclipse.xtext.graphview.style.scoping.GraphViewStyleScopeProvider;
import org.eclipse.xtext.graphview.style.type.GVSExtensionClassNameProvider;
import org.eclipse.xtext.graphview.style.type.GraphViewStyleTypeProvider;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class GraphViewStyleRuntimeModule extends org.eclipse.xtext.graphview.style.AbstractGraphViewStyleRuntimeModule {

	public Class<? extends XbaseTypeProvider> bindXbaseTypeProvider() {
		return GraphViewStyleTypeProvider.class;
	}

	public Class<? extends StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider> bindExtensionClassNameProvider() {
		return GVSExtensionClassNameProvider.class;
	}

	public Class<? extends XbaseInterpreter> bindXbaseInterpreter() {
		return GraphViewStyleInterpreter.class;
	}

	public Class<? extends XbaseScopeProvider> bindXbaseScopeProvider() {
		return GraphViewStyleScopeProvider.class;
	}

}
