/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style;

import org.eclipse.xtext.graphview.style.imports.GVSImportsConfiguration;
import org.eclipse.xtext.graphview.style.interpreter.GraphViewStyleInterpreter;
import org.eclipse.xtext.graphview.style.names.GVSIdentifiableSimpleNameProvider;
import org.eclipse.xtext.graphview.style.type.GVSDefaultTypeResolver;
import org.eclipse.xtext.graphview.style.type.GVSImplicitlyImportedFeatures;
import org.eclipse.xtext.graphview.style.type.GVSTypeComputer;
import org.eclipse.xtext.graphview.style.type.GVSTypeResolver;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.imports.IImportsConfiguration;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class GraphViewStyleRuntimeModule extends org.eclipse.xtext.graphview.style.AbstractGraphViewStyleRuntimeModule {

	public Class<? extends XbaseInterpreter> bindXbaseInterpreter() {
		return GraphViewStyleInterpreter.class;
	}
	
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return GVSIdentifiableSimpleNameProvider.class;
	}
	
	public Class<? extends DefaultReentrantTypeResolver> bindDefaultReentrantTypeResolver() {
		return GVSTypeResolver.class;
	}
	
	public Class<? extends ITypeComputer> bindITypeComputer() {
		return GVSTypeComputer.class;
	}
	
	public Class<? extends ImplicitlyImportedFeatures> bindImplicitlyImportedFeatures() {
		return GVSImplicitlyImportedFeatures.class;
	}
	
	public Class<? extends IImportsConfiguration> bindIImportsConfiguration() {
		return GVSImportsConfiguration.class;
	}
	
	public Class<? extends DefaultBatchTypeResolver> bindDefaultBatchTypeResolver() {
		return GVSDefaultTypeResolver.class;
	}
}
