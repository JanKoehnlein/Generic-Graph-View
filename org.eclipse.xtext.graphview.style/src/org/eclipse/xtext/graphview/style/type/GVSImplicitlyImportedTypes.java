/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.type;

import java.util.List;

import org.eclipse.xtext.graphview.lib.extensions.FigureExtensions;
import org.eclipse.xtext.graphview.lib.literals.ColorLiterals;
import org.eclipse.xtext.graphview.lib.literals.FontLiterals;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;

public class GVSImplicitlyImportedTypes extends ImplicitlyImportedTypes {

	@Override
	protected List<Class<?>> getExtensionClasses() {
		List<Class<?>> extensionClasses = super.getExtensionClasses();
		extensionClasses.add(FigureExtensions.class);
		return extensionClasses;
	}

	@Override
	protected List<Class<?>> getStaticImportClasses() {
		List<Class<?>> staticImportClasses = super.getStaticImportClasses();
		staticImportClasses.add(ColorLiterals.class);
		staticImportClasses.add(FontLiterals.class);
		return staticImportClasses;
	}
}
