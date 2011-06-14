package org.eclipse.xtext.graphview;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.graphview.editpart.GraphViewEditPartFactory;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider.Listener;
import org.eclipse.xtext.graphview.model.ModelInstantiator;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class GraphView extends ViewPart {

	@Inject
	private GraphViewEditPartFactory editPartFactory;

	@Inject
	private IGraphViewDefinitionProvider graphViewDefinitionProvider;

	@Inject
	private ModelInstantiator modelInstantiator;

	@Inject
	private PluginImageHelper imageHelper;
	
	private DefaultEditDomain editDomain;

	private GraphicalViewer graphicalViewer;

	private Object currentContents;

	private SelectionConverter selectionConverter;

	protected class RefreshAction extends Action {
		public RefreshAction() {
			super();
			setText("Redraw");
			setToolTipText("Redraw this diagram");
			setImageDescriptor(ImageDescriptor.createFromImage(imageHelper.getImage("elcl16/refresh_nav.gif")));
			setDisabledImageDescriptor(ImageDescriptor.createFromImage(imageHelper.getImage("elcl16/refresh_nav.gif")));
		}
		
		@Override
		public void run() {
			refresh();
		}
	}
	
	
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
		selectionConverter = new SelectionConverter(this);
		getSite().getWorkbenchWindow().getSelectionService()
				.addPostSelectionListener(selectionConverter);
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		toolBarManager.add(new RefreshAction());
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
		super.dispose();
	}

	public void refresh() {
		Object contents = currentContents;
		setViewerContents(null, true);
		setViewerContents(contents, false);
	}
	
	public void setViewerContents(Object contents, boolean force) {
		if(contents == null) {
			if(force) {
				currentContents = null;
				graphicalViewer.setContents(null);
			}
		} else {
			if (force || contents != currentContents) {
				currentContents = contents;
				DiagramInstance instanceModel = modelInstantiator.createInstance(
					graphViewDefinitionProvider.getDiagramMapping(),
					currentContents);
				graphicalViewer.setContents(instanceModel);
			}
		}
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
