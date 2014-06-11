/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.type;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.lib.shape.ConnectionShape;
import org.eclipse.xtext.graphview.lib.shape.DiagramShape;
import org.eclipse.xtext.graphview.lib.shape.LabelShape;
import org.eclipse.xtext.graphview.lib.shape.RoundedRectangleShape;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureNames;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.OwnedConverter;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class GVSTypeResolver extends DefaultReentrantTypeResolver {

	public static final QualifiedName SEMANTIC_ELEMENT = QualifiedName.create("element");

	@Inject
	private IResourceServiceProvider.Registry resourceServiceProviderRegistry;

	@Override
	protected void computeTypes(ResolvedTypes resolvedTypes, IFeatureScopeSession session, EObject element) {
		if (element instanceof StyleSheet) {
			for (Style style : ((StyleSheet) element).getStyles())
				computeTypes(resolvedTypes, session, style);
		}
		if (element instanceof Style) {
			Style style = (Style) element;
			LightweightTypeReference figureType = getFigureType(style, resolvedTypes.getReferenceOwner());
			resolvedTypes.setType(style, figureType);
			ImmutableMap.Builder<QualifiedName, JvmIdentifiableElement> localVarsBuilder = ImmutableMap
					.<QualifiedName, JvmIdentifiableElement> builder().put(IFeatureNames.THIS, style);
			if (!style.getMappings().isEmpty()) {
				for (AbstractMapping mapping : style.getMappings()) {
					LightweightTypeReference mappingType = getMappingType(mapping);
					resolvedTypes.reassignType(mapping, mappingType);
				}
				// TODO: take some other identifiable element
				localVarsBuilder.put(SEMANTIC_ELEMENT, style.getMappings().get(0));
			}
			IFeatureScopeSession childSession = session.addLocalElements(localVarsBuilder.build(), resolvedTypes.getReferenceOwner());
			computeTypes(resolvedTypes, childSession, style.getExpression());
		} else if (element instanceof XExpression)
			super.computeTypes(resolvedTypes, session, element);
	}

	public LightweightTypeReference getFigureType(Style style, ITypeReferenceOwner owner) {
		OwnedConverter ownedConverter = new OwnedConverter(owner);
		if (style.getJavaClass() != null)
			return ownedConverter.apply(style.getJavaClass());
		List<LightweightTypeReference> types = Lists.newArrayList();
		for (AbstractMapping mapping : style.getMappings()) {
			if (mapping instanceof DiagramMapping) {
				types.add(ownedConverter.apply(getServices().getTypeReferences().getTypeForName(DiagramShape.class, style)));
			} else if (mapping instanceof NodeMapping) {
				types.add(ownedConverter.apply(getServices().getTypeReferences().getTypeForName(RoundedRectangleShape.class, style)));
			} else if (mapping instanceof LabelMapping) {
				types.add(ownedConverter.apply(getServices().getTypeReferences().getTypeForName(LabelShape.class, style)));
			} else if (mapping instanceof EdgeMapping) {
				types.add(ownedConverter.apply(getServices().getTypeReferences().getTypeForName(ConnectionShape.class, style)));
			}
		}
		if (types.isEmpty())
			return ownedConverter.apply(getServices().getTypeReferences().getTypeForName(IFigure.class, style));
		else
			return getServices().getTypeConformanceComputer().getCommonSuperType(types, owner);
	}

	private LightweightTypeReference getMappingType(AbstractMapping mapping) {
		IResourceServiceProvider resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(EcoreUtil
				.getURI(mapping));
		IBatchTypeResolver typeResolver = resourceServiceProvider.get(IBatchTypeResolver.class);
		IResolvedTypes resolvedTypes = typeResolver.resolveTypes(mapping);
		return resolvedTypes.getActualType(mapping);
	}
}
