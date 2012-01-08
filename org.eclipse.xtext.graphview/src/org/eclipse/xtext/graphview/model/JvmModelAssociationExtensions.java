package org.eclipse.xtext.graphview.model;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.common.collect.Iterables;

@SuppressWarnings("restriction")
public class JvmModelAssociationExtensions {

	private static IResourceServiceProvider.Registry registry = IResourceServiceProvider.Registry.INSTANCE;

	public static <T extends JvmIdentifiableElement> T jvmElement(
			EObject sourceElement, Class<T> type) {
		IJvmModelAssociations associations = getAssociations(sourceElement);
		if (associations != null) {
			Set<EObject> jvmElements = associations
					.getJvmElements(sourceElement);
			Iterator<T> matchingElements = Iterables.filter(jvmElements, type)
					.iterator();
			if (matchingElements.hasNext())
				return matchingElements.next();
		}
		return null;
	}

	public static <T extends EObject> T sourceElement(
			EObject jvmElement, Class<T> type) {
		IJvmModelAssociations associations = getAssociations(jvmElement);
		if (associations != null) {
			Set<EObject> sourceElements = associations
					.getSourceElements(jvmElement);
			Iterator<T> matchingElements = Iterables.filter(sourceElements,
					type).iterator();
			if (matchingElements.hasNext())
				return matchingElements.next();
		}
		return null;
	}
	
	protected static IJvmModelAssociations getAssociations(EObject element) {
		URI uri = element.eResource().getURI();
		IResourceServiceProvider resourceServiceProvider = registry
				.getResourceServiceProvider(uri);
		if (resourceServiceProvider != null)
			return resourceServiceProvider.get(IJvmModelAssociations.class);
		else
			return null;
	}
}
