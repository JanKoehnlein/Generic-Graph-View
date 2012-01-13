/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.scoping;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
@SuppressWarnings("restriction")
public class GraphViewMappingScopeProvider extends XbaseScopeProvider {

	@Override
	protected IScope createLocalVarScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
		EObject context = scopeContext.getContext();
		if (context instanceof DiagramMapping) {
			return new SimpleScope(parentScope, Collections.singleton(EObjectDescription.create(XbaseScopeProvider.THIS, context)));
		} else if (context instanceof AbstractExpressionMapping) {
			EObject parent = context.eContainer();
			return new SimpleScope(parentScope, Collections.singleton(EObjectDescription.create(XbaseScopeProvider.THIS, parent)));
		}
		return super.createLocalVarScope(parentScope, scopeContext);
	}

}
