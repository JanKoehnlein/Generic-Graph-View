/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.types;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;

import com.google.common.collect.ImmutableMap;

@SuppressWarnings("restriction")
public class GVMExtensionClassNameProvider extends ExtensionClassNameProvider {
	@Override
	protected Map<String, Collection<String>> computeExtensionClassNames() {
		return ImmutableMap
				.<String, Collection<String>> builder()
				.putAll(super.computeExtensionClassNames())
				.put("org.eclipse.emf.ecore.EObject",
						Collections.singletonList("org.eclipse.xtext.graphview.model.JvmModelAssociationExtensions")).build();
	}
}