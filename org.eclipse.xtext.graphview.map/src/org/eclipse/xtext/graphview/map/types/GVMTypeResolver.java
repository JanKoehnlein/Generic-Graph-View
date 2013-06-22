/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureNames;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.ExpressionBasedRootTypeComputationState;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.OwnedConverter;

public class GVMTypeResolver extends DefaultReentrantTypeResolver {

	@Override
	protected void computeTypes(ResolvedTypes resolvedTypes, IFeatureScopeSession session, EObject element) {
		IFeatureScopeSession childSession = session;
		if (element instanceof DiagramMapping) {
			DiagramMapping diagramMapping = (DiagramMapping) element;
			LightweightTypeReference type = new OwnedConverter(resolvedTypes.getReferenceOwner()).apply(diagramMapping.getTypeGuard());
			resolvedTypes.setType(diagramMapping, type);
			childSession = addThis(session, diagramMapping, resolvedTypes.getReferenceOwner());
		}
		if(element instanceof AbstractMapping) {
			AbstractMapping mapping = (AbstractMapping) element;
			XExpression unlessCondition = mapping.getUnlessCondition();
			if (unlessCondition != null) {
				LightweightTypeReference booleanType = new OwnedConverter(resolvedTypes.getReferenceOwner()).apply(getServices()
						.getTypeReferences().getTypeForName(Boolean.TYPE, mapping));
				ExpressionBasedRootTypeComputationState state = new ExpressionBasedRootTypeComputationState(resolvedTypes, childSession,
						unlessCondition, booleanType);
				state.computeTypes();
			}
		}
		if(element instanceof AbstractExpressionMapping) {
			AbstractExpressionMapping mapping = (AbstractExpressionMapping) element;
			computeTypes(resolvedTypes, childSession, mapping.getExpression());
			LightweightTypeReference actualType = resolvedTypes.getActualType(mapping.getExpression());
			if (mapping.isMulti()) {
				if (!actualType.getTypeArguments().isEmpty() & actualType.getRawTypeReference().isSubtypeOf(Iterable.class)) {
					actualType = actualType.getTypeArguments().get(0);
				} else if(actualType.isArray()) {
					actualType = actualType.getComponentType();
				}
			}
			resolvedTypes.setType(mapping, actualType);
			childSession = addThis(childSession, mapping, resolvedTypes.getReferenceOwner());
		}
		if (element instanceof AbstractMappingDefinition) {
			AbstractMappingDefinition mapping = (AbstractMappingDefinition) element;
			for (AbstractExpressionMapping childMapping : mapping.getMappings()) {
				computeTypes(resolvedTypes, childSession, childMapping);
			}
		}
		if(element instanceof EdgeMapping) {
			EdgeMapping edgeMapping = (EdgeMapping) element;
			computeTypes(resolvedTypes, childSession, edgeMapping.getSourceMapping());
			computeTypes(resolvedTypes, childSession, edgeMapping.getTargetMapping());
		}
		if (element instanceof XExpression)
			super.computeTypes(resolvedTypes, session, element);
	}

	protected IFeatureScopeSession addThis(IFeatureScopeSession session, JvmIdentifiableElement element, ITypeReferenceOwner owner) {
		return session.addLocalElement(IFeatureNames.THIS, element, owner);
	}

}
