package org.eclipse.xtext.graphview;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.graphview.editpart.GraphViewEditPartFactory;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider.Listener;
import org.eclipse.xtext.graphview.model.ModelInstantiator;

import com.google.inject.Inject;

public class GraphView extends ViewPart {

	@Inject
	private GraphViewEditPartFactory editPartFactory;

	@Inject
	private IGraphViewDefinitionProvider graphViewDefinitionProvider;

	@Inject
	private ModelInstantiator modelInstantiator;

	private DefaultEditDomain editDomain;

	private GraphicalViewer graphicalViewer;

	private Object currentContents;

	private SelectionConverter selectionConverter;

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
						setViewerContents(currentContents);
					}
				});
			}
		});
		selectionConverter = new SelectionConverter(this);
		getSite().getWorkbenchWindow().getSelectionService()
				.addPostSelectionListener(selectionConverter);
	}

	@Override
	public void dispose() {
		if (selectionConverter != null)
			getSite().getWorkbenchWindow().getSelectionService()
					.addPostSelectionListener(selectionConverter);
		super.dispose();
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

	public void setViewerContents(Object contents) {
		if (contents != null && contents != currentContents) {
			currentContents = contents;
			DiagramInstance instanceModel = modelInstantiator.createInstance(
					graphViewDefinitionProvider.getDiagramMapping(),
					currentContents);
			graphicalViewer.setContents(instanceModel);
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

	protected void setGraphicalViewer(GraphicalViewer viewer) {
		getEditDomain().addViewer(viewer);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				int foo=42;				
			}
		});
		getSite().setSelectionProvider(viewer);
		this.graphicalViewer = viewer;
	}

	protected Display getDisplay() {
		return Display.getDefault();
	}

}
