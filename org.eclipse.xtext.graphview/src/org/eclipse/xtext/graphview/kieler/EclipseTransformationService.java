package org.eclipse.xtext.graphview.kieler;

/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.graphview.Activator;

import de.cau.cs.kieler.kiml.service.TransformationService;

/**
 * Copied and adapted from KIELER project. Their EclipseTransformationService is
 * located in a plug-in that registers a lot of noisy stuff in the UI.
 */
public final class EclipseTransformationService extends TransformationService {

	/**
	 * Hidden constructor to avoid instantiation from outside this class.
	 */
	private EclipseTransformationService() {
		super();
	}

	/**
	 * Create the transformation service and load extension points.
	 */
	public static synchronized void create() {
		// creating an instance stores this instance as the singleton instance
		EclipseTransformationService instance = new EclipseTransformationService();
		instance.loadGraphTransExtensions();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void reportError(final String extensionPoint, final IConfigurationElement element,
			final String attribute, final Throwable exception) {
		String message;
		if (element != null && attribute != null) {
			message = "Extension point " + extensionPoint + ": Invalid entry in attribute '" + attribute
					+ "' of element " + element.getName() + ", contributed by " + element.getContributor().getName();
		} else {
			message = "Extension point " + extensionPoint + ": An error occured while loading extensions.";
		}
		IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, 0, message, exception);
		StatusManager.getManager().handle(status);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void reportError(final CoreException exception) {
		StatusManager.getManager().handle(exception, Activator.PLUGIN_ID);
	}

}
