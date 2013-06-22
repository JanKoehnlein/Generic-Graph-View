/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.imports;

import java.util.Set;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.imports.DefaultImportsConfiguration;

public class GVSImportsConfiguration extends DefaultImportsConfiguration {

	@Override
	public int getImportSectionOffset(XtextResource resource) {
		return 0;
	}
	
	@Override
	public Set<String> getImplicitlyImportedPackages(XtextResource resource) {
		Set<String> implicitlyImportedPackages = super.getImplicitlyImportedPackages(resource);
		implicitlyImportedPackages.add("org.eclipse.xtext.graphview.lib.shape");
		implicitlyImportedPackages.add("org.eclipse.xtext.graphview.lib.layout");
		return implicitlyImportedPackages;
	}
}
