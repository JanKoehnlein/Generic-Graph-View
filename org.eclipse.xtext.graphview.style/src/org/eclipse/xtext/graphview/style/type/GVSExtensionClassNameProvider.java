/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.type;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider.ExtensionClassNameProvider;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

@SuppressWarnings("restriction")
public class GVSExtensionClassNameProvider extends
		ExtensionClassNameProvider {
	@Override
	protected Map<String, Collection<String>> computeExtensionClassNames() {
		return ImmutableMap
				.<String, Collection<String>> builder()
				.putAll(super.computeExtensionClassNames())
				.put("org.eclipse.draw2d.IFigure",
						Collections
								.singletonList("org.eclipse.xtext.graphview.shape.FigureExtensions"))
				.build();
	}

	@Override
	protected Collection<String> computeLiteralClassNames() {
		return ImmutableSet.<String>builder()
				.addAll(super.computeLiteralClassNames())
				.add("org.eclipse.xtext.graphview.shape.ColorLiterals")
				.add("org.eclipse.xtext.graphview.shape.FontLiterals")
				.build();
	}
}