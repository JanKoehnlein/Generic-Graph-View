/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import org.eclipse.gef.DefaultEditDomain;

public class GraphViewEditDomain extends DefaultEditDomain {

	private ClassLoader classLoader;
	
	public GraphViewEditDomain() {
		super(null);
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}
	
	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}
	
}
