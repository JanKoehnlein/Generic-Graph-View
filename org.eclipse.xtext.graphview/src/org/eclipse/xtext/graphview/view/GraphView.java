package org.eclipse.xtext.graphview.view;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.graphview.editpart.GraphViewEditPartFactory;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider.Listener;
import org.eclipse.xtext.graphview.model.ModelInstantiator;
import org.eclipse.xtext.graphview.view.selection.ElementSelectionConverter;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class GraphView extends ViewPart {

	@Inject
	private GraphViewEditPartFactory editPartFactory;

	@Inject
	private IGraphViewDefinitionProvider graphViewDefinitionProvider;

	@Inject
	private ModelInstantiator modelInstantiator;

	@Inject
	private RefreshAction refreshAction;
	
	@Inject
	private ExportToFileAction exportToFileAction;
	
	@Inject
	private ElementSelectionConverter selectionConverter;

	private DefaultEditDomain editDomain;

	private GraphicalViewer graphicalViewer;

	private Object currentContents;


	@Override
	public void createPartControl(Composite parent) {
		graphicalViewer = createGraphicalViewer(parent);
		graphicalViewer.setEditDomain(getEditDomain());
		graphViewDefinitionProvider.addModelChangedListener(new Listener() {
			@Override
			public void graphViewDefinitionChanged() {
				getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						setViewerContents(currentContents, false);
					}
				});
			}
		});
		getSite().getWorkbenchWindow().getSelectionService()
				.addPostSelectionListener(selectionConverter);
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		toolBarManager.add(refreshAction);
		toolBarManager.add(exportToFileAction);
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
		currentContents = null;
		super.dispose();
	}

	public void refresh() {
		Object contents = currentContents;
		setViewerContents(null, true);
		setViewerContents(contents, false);
	}
	
	public boolean setViewerContents(Object contents, boolean force) {
		boolean hasContent = false;
		if(contents == null) {
			if(force) {
				currentContents = null;
				graphicalViewer.setContents(null);
			}
		} else {
			if (force || contents != currentContents) {
				DiagramInstance instanceModel = modelInstantiator.createInstance(
					graphViewDefinitionProvider.getDiagramMapping(),
					contents);
				if(instanceModel != null) {
					currentContents = contents;
					graphicalViewer.setContents(instanceModel);
					hasContent = true;
				}
			}
		}
		exportToFileAction.setEnabled(currentContents != null);
		refreshAction.setEnabled(currentContents != null);
		return hasContent;
	}

	protected DefaultEditDomain getEditDomain() {
		if(editDomain == null)
			editDomain = new DefaultEditDomain(null);
		return this.editDomain;
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
