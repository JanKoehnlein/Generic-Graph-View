package org.eclipse.xtext.graphview.view.config;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.refactoring.impl.ProjectUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class DefaultDiagramConfigurationProvider implements
		IDiagramConfigurationProvider {

	private static final Logger LOG = Logger
			.getLogger(DefaultDiagramConfigurationProvider.class);

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

	public DefaultDiagramConfigurationProvider() {
	}

	protected void setModels(IEObjectDescription mappingModel,
			IEObjectDescription styleSheetModel) {
		currentProject = null;
		styleSheet = (StyleSheet) load(styleSheetModel);
		if(styleSheet != null) 
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
						if(diagramMapping != null)
							diagramMapping = (DiagramMapping) EcoreUtil.resolve(
								diagramMapping, resourceSet);
						if(styleSheet != null) 
							styleSheet = (StyleSheet) EcoreUtil.resolve(styleSheet,
								resourceSet);
						fireModelChanged();
						return;
					}
				}
			}
		};
		workspace.addResourceChangeListener(resourceChangeListener);
		fireModelChanged();
	}

	public DiagramMapping getDiagramMapping() {
		return diagramMapping;
	}

	public StyleSheet getStyleSheet() {
		return styleSheet;
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
		if (eObjectDescription == null)
			return null;
		IProject project = projectUtil.getProject(eObjectDescription
				.getEObjectURI());
		if (currentProject == null) {
			resourceSet = resourceSetProvider.get(project);
			currentProject = project;
			typeProviderFactory.createTypeProvider(resourceSet);
		} else if (!currentProject.equals(project)) {
			throw new IllegalArgumentException(
					"GraphView diagram definition files must reside in the same project");
		}
		modelFiles.add(projectUtil.findFileStorage(
				eObjectDescription.getEObjectURI(), false));
		return resourceSet.getEObject(eObjectDescription.getEObjectURI(), true);
	}
}