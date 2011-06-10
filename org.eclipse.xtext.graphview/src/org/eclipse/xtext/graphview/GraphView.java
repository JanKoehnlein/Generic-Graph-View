package org.eclipse.xtext.graphview;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.graphview.editpart.GraphViewEditPartFactory;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider.Listener;
import org.eclipse.xtext.graphview.model.InstanceMapping;

import com.google.inject.Inject;

public class GraphView extends ViewPart {

	@Inject
	private GraphViewEditPartFactory editPartFactory;

	@Inject
	private IGraphViewDefinitionProvider graphViewDefinitionProvider;
	
	private DefaultEditDomain editDomain;

	private GraphicalViewer graphicalViewer;
	
	private Object currentContents = EcorePackage.eINSTANCE;//Lists.newArrayList(new Object(), new Object(), new Object());

	@Override
	public void createPartControl(Composite parent) {
		setEditDomain(new DefaultEditDomain(null));
		graphicalViewer = createGraphicalViewer(parent);
		setViewerContents();
		graphViewDefinitionProvider.addModelChangedListener(new Listener() {
			@Override
			public void graphViewDefinitionChanged() {
				getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						setViewerContents();						
					}
				});
			}
		});
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
	
	protected void setViewerContents() {
		InstanceMapping viewerContents = new InstanceMapping(graphViewDefinitionProvider.getDiagramMapping(), currentContents);
		graphicalViewer.setContents(viewerContents);
	}
	
	protected DefaultEditDomain getEditDomain() {
		return this.editDomain;
	}

	protected GraphicalViewer getGraphicalViewer() {
		return this.graphicalViewer;
	}

	protected void setEditDomain(DefaultEditDomain anEditDomain) {
		this.editDomain = anEditDomain;
	}

	@Override
	public void setFocus() {
		getGraphicalViewer().getControl().setFocus();
	}

	protected void setGraphicalViewer(GraphicalViewer viewer) {
		getEditDomain().addViewer(viewer);
		this.graphicalViewer = viewer;
	}

	protected Display getDisplay() {
		return getSite().getWorkbenchWindow().getShell().getDisplay();
	}
	
}
