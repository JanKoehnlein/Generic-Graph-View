/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map;

import org.eclipse.xtext.graphview.map.scoping.GraphViewMappingIdentifiableSimpleNameProvider;
import org.eclipse.xtext.graphview.map.scoping.GraphViewMappingScopeProvider;
import org.eclipse.xtext.graphview.map.types.GVMExtensionClassNameProvider;
import org.eclipse.xtext.graphview.map.types.GraphViewMappingTypeProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class GraphViewMappingRuntimeModule extends org.eclipse.xtext.graphview.map.AbstractGraphViewMappingRuntimeModule {

	@Override
	public Class<? extends ITypeProvider> bindITypeProvider() {
		return GraphViewMappingTypeProvider.class;
	}
	
	@Override
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return GraphViewMappingIdentifiableSimpleNameProvider.class;
	}
	
	public Class<? extends XbaseScopeProvider> bindXbaseScopeProvider() {
		return GraphViewMappingScopeProvider.class;
	}
	
	public Class<? extends StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider> bindExtensionClassNameProvider() {
		return GVMExtensionClassNameProvider.class;
	}
}
