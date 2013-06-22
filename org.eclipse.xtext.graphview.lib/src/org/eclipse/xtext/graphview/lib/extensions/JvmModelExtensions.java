/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.extensions;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmCompoundTypeReference;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.AbstractTypeReferenceVisitor;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

@SuppressWarnings("restriction")
public class JvmModelExtensions {

	private static IResourceServiceProvider.Registry registry = IResourceServiceProvider.Registry.INSTANCE;

	public static <T extends JvmIdentifiableElement> T jvmElement(EObject sourceElement, Class<T> type) {
		IJvmModelAssociations associations = getLanguageService(sourceElement, IJvmModelAssociations.class);
		if (associations != null) {
			Set<EObject> jvmElements = associations.getJvmElements(sourceElement);
			Iterator<T> matchingElements = Iterables.filter(jvmElements, type).iterator();
			if (matchingElements.hasNext())
				return matchingElements.next();
		}
		return null;
	}

	public static <T extends EObject> T sourceElement(EObject jvmElement, Class<T> type) {
		IJvmModelAssociations associations = getLanguageService(jvmElement, IJvmModelAssociations.class);
		if (associations != null) {
			Set<EObject> sourceElements = associations.getSourceElements(jvmElement);
			Iterator<T> matchingElements = Iterables.filter(sourceElements, type).iterator();
			if (matchingElements.hasNext())
				return matchingElements.next();
		}
		return null;
	}

	public static Iterable<JvmTypeReference> allRawTypes(JvmTypeReference typeReference) {
		final TypeReferences typeReferences = getLanguageService(typeReference, TypeReferences.class);
		final Set<JvmTypeReference> result = Sets.newLinkedHashSet();
		typeReference.accept(new AbstractTypeReferenceVisitor.InheritanceAware<Boolean>() {
			@Override
			public Boolean doVisitGenericArrayTypeReference(JvmGenericArrayTypeReference reference) {
				return result.add(reference.getComponentType());
			}

			@Override
			public Boolean doVisitCompoundTypeReference(JvmCompoundTypeReference reference) {
				for (JvmTypeReference containedReference : reference.getReferences())
					visit(containedReference);
				return true;
			}

			@Override
			public Boolean doVisitParameterizedTypeReference(JvmParameterizedTypeReference reference) {
				result.add(typeReferences.createTypeRef(reference.getType()));
				for (JvmTypeReference argument : reference.getArguments())
					visit(argument);
				return true;
			}
		});
		return result;
	}

	public static boolean isPrimitive(JvmTypeReference typeReference, EObject context) {
		final Primitives primitives = getLanguageService(context, Primitives.class);
		return primitives.isPrimitive(typeReference) || "java.lang.String".equals(typeReference.getIdentifier());
	}

	public static boolean isIterable(JvmTypeReference typeReference, EObject context) {
		JvmType type = typeReference.getType();
		if("java.lang.Iterable".equals(type.getIdentifier()))
			return true;
		if(type instanceof JvmGenericType) {
			for(JvmTypeReference superType: ((JvmGenericType) type).getSuperTypes()) {
				if(isIterable(superType, context)) 
					return true;
			}
		}
		return false;
	}

	protected static <T> T getLanguageService(EObject element, Class<T> type) {
		if (element != null && element.eResource() != null) {
			URI uri = element.eResource().getURI();
			IResourceServiceProvider resourceServiceProvider = registry.getResourceServiceProvider(uri);
			if (resourceServiceProvider != null)
				return resourceServiceProvider.get(type);
		}
		return null;
	}

}
