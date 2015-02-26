/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.config;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.graphview.Activator;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.refactoring.impl.ProjectUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DefaultDiagramConfigurationProvider implements IDiagramConfigurationProvider {

	private static final String CURRENT_MAPPING_URI_PROPERTY = "currentMapping";

	private static final String CURRENT_STYLE_SHEET_URI_PROPERTY = "currentStyleSheet";

	private static final Logger LOG = Logger.getLogger(DefaultDiagramConfigurationProvider.class);

	@Inject
	private IResourceSetProvider resourceSetProvider;

	@Inject
	private ProjectUtil projectUtil;

	@Inject
	private IWorkspace workspace;

	@Inject
	private IJvmTypeProvider.Factory typeProviderFactory;

	private DiagramMapping diagramMapping;

	private StyleSheet styleSheet;

	private List<IFile> modelFiles = Lists.newArrayList();

	private IResourceChangeListener resourceChangeListener;

	private ListenerList listeners = new ListenerList();

	private IProject currentProject;

	private ResourceSet resourceSet;

	protected void setModels(IEObjectDescription mappingModel, IEObjectDescription styleSheetModel) {
		currentProject = null;
		styleSheet = (StyleSheet) load(styleSheetModel);
		if (styleSheet != null)
			EcoreUtil.resolveAll(styleSheet);
		diagramMapping = (DiagramMapping) load(mappingModel);
		if (resourceChangeListener != null) {
			workspace.removeResourceChangeListener(resourceChangeListener);
		}
		resourceChangeListener = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				for (IFile modelFile : modelFiles) {
					if (event.getDelta().findMember(modelFile.getFullPath()) != null) {
						for (Resource resource : resourceSet.getResources()) {
							try {
								resource.unload();
								resource.load(null);
							} catch (IOException e) {
								LOG.error("Error reloading resource ", e);
							}
						}
						if (diagramMapping != null)
							diagramMapping = (DiagramMapping) EcoreUtil.resolve(diagramMapping, resourceSet);
						if (styleSheet != null)
							styleSheet = (StyleSheet) EcoreUtil.resolve(styleSheet, resourceSet);
						fireModelChanged();
						return;
					}
				}
			}
		};
		workspace.addResourceChangeListener(resourceChangeListener);
		storePreference(CURRENT_MAPPING_URI_PROPERTY, diagramMapping);
		storePreference(CURRENT_STYLE_SHEET_URI_PROPERTY, styleSheet);
		fireModelChanged();
	}

	protected void storePreference(String property, EObject model) {
		getPreferenceStore().setValue(property, (model != null) ? EcoreUtil.getURI(model).toString() : "");
	}

	protected IPreferenceStore getPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	public DiagramMapping getDiagramMapping() {
		loadDefaultsIfNecessary();
		return diagramMapping;
	}

	public StyleSheet getStyleSheet() {
		loadDefaultsIfNecessary();
		return styleSheet;
	}

	protected void loadDefaultsIfNecessary() {
		if (styleSheet == null && diagramMapping == null) {
			styleSheet = (StyleSheet) load(CURRENT_STYLE_SHEET_URI_PROPERTY);
			if (styleSheet != null)
				EcoreUtil.resolveAll(styleSheet);
			diagramMapping = (DiagramMapping) load(CURRENT_MAPPING_URI_PROPERTY);
		}
	}

	protected void fireModelChanged() {
		for (Object listener : listeners.getListeners()) {
			((Listener) listener).graphViewDefinitionChanged();
		}
	}

	public void addConfigurationListener(Listener listener) {
		listeners.add(listener);
	}

	public void removeConfigurationListener(Listener listener) {
		listeners.remove(listener);
	}

	protected EObject load(IEObjectDescription eObjectDescription) {
		return (eObjectDescription == null) ? null : load(eObjectDescription.getEObjectURI());
	}

	protected EObject load(String uriProperty) {
		String uri = "";
		try {
			uri = getPreferenceStore().getString(uriProperty);
			return (!Strings.isEmpty(uri)) ? load(URI.createURI(uri)) : null;
		} catch (Exception exc) {
			LOG.error("Error loading model " + uri, exc);
		}
		return null;
	}

	protected EObject load(URI eObjectURI) {
		if (eObjectURI == null)
			return null;
		IProject project = projectUtil.getProject(eObjectURI);
		if (currentProject == null) {
			resourceSet = resourceSetProvider.get(project);
			currentProject = project;
			typeProviderFactory.createTypeProvider(resourceSet);
		} else if (!currentProject.equals(project)) {
			throw new IllegalArgumentException("GraphView diagram definition files must reside in the same project");
		}
		IFile modelFile = projectUtil.findFileStorage(eObjectURI, false);
		try {
			if(modelFile.findMaxProblemSeverity(null, true, IResource.DEPTH_INFINITE) == IMarker.SEVERITY_ERROR)
				return null;
		} catch(CoreException e) {
			LOG.error("Error getting markers", e);
			return null;
		}
		modelFiles.add(modelFile);
		EObject eObject = resourceSet.getEObject(eObjectURI, true);
		return eObject;
	}
}