package org.eclipse.xtext.graphview.view;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.graphview.editpart.GraphViewEditDomain;
import org.eclipse.xtext.graphview.editpart.GraphViewEditPartFactory;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.model.ModelInstantiator;
import org.eclipse.xtext.graphview.view.config.IDiagramConfigurationProvider;
import org.eclipse.xtext.graphview.view.config.IDiagramConfigurationProvider.Listener;
import org.eclipse.xtext.graphview.view.config.SelectDiagramConfigurationAction;
import org.eclipse.xtext.graphview.view.selection.ElementSelectionConverter;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class GraphView extends ViewPart {

	@Inject
	private GraphViewEditPartFactory editPartFactory;

	@Inject
	private IDiagramConfigurationProvider diagramConfigurationProvider;

	@Inject
	private ModelInstantiator modelInstantiator;

	@Inject
	private RefreshAction refreshAction;

	@Inject
	private ExportToFileAction exportToFileAction;

	@Inject
	private SelectDiagramConfigurationAction selectDiagramConfigurationAction;

	@Inject
	private ElementSelectionConverter selectionConverter;

	@Inject
	private GraphViewEditDomain editDomain;

	private GraphicalViewer graphicalViewer;

	private Object currentContents;

	private Listener configurationListener;

	@Override
	public void createPartControl(Composite parent) {
		graphicalViewer = createGraphicalViewer(parent);
		graphicalViewer.setEditDomain(editDomain);
		configurationListener = new Listener() {
			public void graphViewDefinitionChanged() {
				getDisplay().asyncExec(new Runnable() {
					public void run() {
						refresh();
					}
				});
			}
		};
		diagramConfigurationProvider
				.addConfigurationListener(configurationListener);
		getSite().getWorkbenchWindow().getSelectionService()
				.addPostSelectionListener(selectionConverter);
		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();
		toolBarManager.add(refreshAction);
		toolBarManager.add(exportToFileAction);
		toolBarManager.add(selectDiagramConfigurationAction);
		refreshAction.setEnabled(false);
		exportToFileAction.setEnabled(false);
	}

	protected GraphicalViewer createGraphicalViewer(Composite parent) {
		GraphicalViewer graphicalViewer = new ScrollingGraphicalViewer();
		graphicalViewer.createControl(parent);
		graphicalViewer.setRootEditPart(new FreeformGraphicalRootEditPart());
		graphicalViewer.setEditPartFactory(editPartFactory);
		graphicalViewer.getControl().setBackground(
				ColorConstants.listBackground);
		return graphicalViewer;
	}

	@Override
	public void dispose() {
		if (selectionConverter != null)
			getSite().getWorkbenchWindow().getSelectionService()
					.addPostSelectionListener(selectionConverter);
		diagramConfigurationProvider
				.removeConfigurationListener(configurationListener);
		currentContents = null;
		super.dispose();
	}

	public void refresh() {
		Object contents = currentContents;
		setViewerContents(null, null, true);
		setViewerContents(contents, editDomain.getClassLoader(), false);
	}

	public boolean setViewerContents(Object contents, ClassLoader classLoader,
			boolean force) {
		boolean hasContent = false;
		if (contents == null) {
			if (force) {
				currentContents = null;
				graphicalViewer.setContents(null);
			}
		} else {
			if ((force || contents != currentContents)
					&& diagramConfigurationProvider.getDiagramMapping() != null) {
				DiagramInstance instanceModel = modelInstantiator
						.createInstance(diagramConfigurationProvider
								.getDiagramMapping(), contents, classLoader);
				if (instanceModel != null) {
					currentContents = contents;
					editDomain.setClassLoader(classLoader);
					graphicalViewer.setContents(instanceModel);
					hasContent = true;
				}
			}
		}
		exportToFileAction.setEnabled(currentContents != null);
		refreshAction.setEnabled(currentContents != null);
		return hasContent;
	}

	protected GraphicalViewer getGraphicalViewer() {
		return this.graphicalViewer;
	}

	@Override
	public void setFocus() {
		getGraphicalViewer().getControl().setFocus();
	}

	protected Display getDisplay() {
		return Display.getDefault();
	}

}
