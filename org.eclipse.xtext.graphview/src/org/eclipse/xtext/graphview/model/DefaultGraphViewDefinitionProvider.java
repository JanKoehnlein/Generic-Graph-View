package org.eclipse.xtext.graphview.model;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.refactoring.impl.ProjectUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class DefaultGraphViewDefinitionProvider implements
		IGraphViewDefinitionProvider {

	@Inject
	private IResourceDescriptions resourceDescriptions;

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

	public DefaultGraphViewDefinitionProvider() {
	}

	protected void loadModels() {
		diagramMapping = (DiagramMapping) load(GraphViewMappingPackage.Literals.DIAGRAM_MAPPING);
		styleSheet = (StyleSheet) load(GraphViewStylePackage.Literals.STYLE_SHEET);
		if (resourceChangeListener == null) {
			resourceChangeListener = new IResourceChangeListener() {
				@Override
				public void resourceChanged(IResourceChangeEvent event) {
					for (IFile modelFile : modelFiles) {
						if (event.getDelta()
								.findMember(modelFile.getFullPath()) != null) {
							loadModels();
							fireModelChanged();
							return;
						}
					}
				}
			};
			workspace.addResourceChangeListener(resourceChangeListener);
		}
	}

	@Override
	public DiagramMapping getDiagramMapping() {
		if (diagramMapping == null)
			loadModels();
		return diagramMapping;
	}

	@Override
	public StyleSheet getStyleSheet() {
		if (styleSheet == null)
			loadModels();
		return styleSheet;
	}

	protected void fireModelChanged() {
		for (Object listener : listeners.getListeners()) {
			((Listener) listener).graphViewDefinitionChanged();
		}
	}

	@Override
	public void addModelChangedListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeModelChangedListener(Listener listener) {
		listeners.remove(listener);
	}

	protected EObject load(EClass eClass) {
		Iterator<IEObjectDescription> descriptions = resourceDescriptions
				.getExportedObjectsByType(eClass).iterator();
		return (descriptions.hasNext()) ? load(descriptions.next()) : null;
	}

	protected EObject load(IEObjectDescription eObjectDescription) {
		IProject project = projectUtil.getProject(eObjectDescription
				.getEObjectURI());
		modelFiles.add(projectUtil.findFileStorage(
				eObjectDescription.getEObjectURI(), false));
		ResourceSet resourceSet = resourceSetProvider.get(project);
		typeProviderFactory.createTypeProvider(resourceSet);
		return resourceSet.getEObject(eObjectDescription.getEObjectURI(), true);
	}

}
