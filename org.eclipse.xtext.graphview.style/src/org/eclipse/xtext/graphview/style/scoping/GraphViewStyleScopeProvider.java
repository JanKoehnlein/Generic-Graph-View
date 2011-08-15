/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.scoping;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.inject.Inject;
import com.google.inject.internal.Lists;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
@SuppressWarnings("restriction")
public class GraphViewStyleScopeProvider extends XbaseScopeProvider {

	public static final QualifiedName SEMANTIC_ELEMENT = QualifiedName.create("element");
	
	@Inject
	private TypeReferences typeReferences;
	
	private ITypeProvider mappingTypeProvider;
	
	private TypeConformanceComputer mappingTypeConformanceComputer;

	@Inject
	protected void setMappingLanguageServices(IResourceServiceProvider.Registry registry) {
		IResourceServiceProvider mappingResourceServiceProvider = registry.getResourceServiceProvider(URI.createURI("dummy.gvmap"));
		mappingTypeProvider = mappingResourceServiceProvider.get(ITypeProvider.class);
		mappingTypeConformanceComputer = mappingResourceServiceProvider.get(TypeConformanceComputer.class);
	}

	@Override
	protected IScope createLocalVarScope(IScope parentScope,
			LocalVariableScopeContext scopeContext) {
		EObject context = scopeContext.getContext();
		if(context instanceof Style) {
			List<IEObjectDescription> localVars = Lists.newArrayList();
			JvmParameterizedTypeReference clazz = ((Style) context).getJavaClass();
			if(clazz != null && clazz.getType() != null) {
				localVars.add(EObjectDescription.create(XbaseScopeProvider.THIS, clazz.getType()));
			} else {
				JvmType figureType = typeReferences.findDeclaredType("org.eclipse.draw2d.IFigure", context);
				localVars.add(EObjectDescription.create(XbaseScopeProvider.THIS, figureType));
			}
			List<JvmTypeReference> mappingTypes = Lists.newArrayList();
			for(AbstractMapping mapping : ((Style) context).getMappings()) {
				JvmTypeReference mappingType = mappingTypeProvider.getTypeForIdentifiable(mapping);
				if(mappingType != null)
					mappingTypes.add(mappingType);
			}
			if(!mappingTypes.isEmpty()) { 
				JvmTypeReference commonSuperType = mappingTypeConformanceComputer.getCommonSuperType(mappingTypes);
				if(commonSuperType != null && commonSuperType.getType() != null) {
					localVars.add(EObjectDescription.create(SEMANTIC_ELEMENT, commonSuperType.getType()));
				}
			}	
			if(!localVars.isEmpty()) 
				return new SimpleScope(parentScope, localVars); 
		}
		return super.createLocalVarScope(parentScope, scopeContext);
	}
}
