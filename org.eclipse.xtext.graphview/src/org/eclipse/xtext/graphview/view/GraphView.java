/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view;

import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.DeleteAction;
import org.eclipse.gef.ui.actions.RedoAction;
import org.eclipse.gef.ui.actions.SelectAllAction;
import org.eclipse.gef.ui.actions.UndoAction;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.graphview.editpart.DiagramEditPart;
import org.eclipse.xtext.graphview.editpart.GraphViewEditDomain;
import org.eclipse.xtext.graphview.editpart.GraphViewEditPartFactory;
import org.eclipse.xtext.graphview.gestures.GestureGraphicalViewer;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.model.ModelInstantiator;
import org.eclipse.xtext.graphview.view.config.IDiagramConfigurationProvider;
import org.eclipse.xtext.graphview.view.config.IDiagramConfigurationProvider.Listener;
import org.eclipse.xtext.graphview.view.config.SelectDiagramConfigurationAction;
import org.eclipse.xtext.graphview.view.selection.ElementSelectionConverter;

import com.google.common.collect.Lists;
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
	private ResetAction resetAction;

	@Inject
	private RelayoutAction relayoutAction;

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

	private static final String[] ZOOM_LEVELS = new String[] { ZoomManager.FIT_ALL, ZoomManager.FIT_HEIGHT, ZoomManager.FIT_WIDTH };

	private ZoomComboContributionItem zoomContributionItem;

	private ZoomManager zoomManager;

	private ActionRegistry actionRegistry;

	private ISelectionChangedListener actionUpdater;

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
		diagramConfigurationProvider.addConfigurationListener(configurationListener);
		getSite().getWorkbenchWindow().getSelectionService().addPostSelectionListener(selectionConverter);
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		toolBarManager.add(resetAction);
		toolBarManager.add(relayoutAction);
		toolBarManager.add(exportToFileAction);
		toolBarManager.add(selectDiagramConfigurationAction);
		actionRegistry = createActionRegistry();
		zoomContributionItem = new ZoomComboContributionItem(getSite().getPage(), ZOOM_LEVELS) {
			@Override
			public void setZoomManager(ZoomManager zm) {
				if (zm == null)
					return;
				super.setZoomManager(zm);
			}
		};
		zoomContributionItem.setZoomManager(zoomManager);
		toolBarManager.add(zoomContributionItem);
		resetAction.setEnabled(false);
		relayoutAction.setEnabled(false);
		exportToFileAction.setEnabled(false);
		actionUpdater = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				for (Iterator<?> i = actionRegistry.getActions(); i.hasNext();) {
					Object action = i.next();
					if (action instanceof UpdateAction) {
						((UpdateAction) action).update();
					}
				}
			}
		};
		getGraphicalViewer().addSelectionChangedListener(actionUpdater);
		graphicalViewer.setKeyHandler(new GraphicalViewerKeyHandler(graphicalViewer).setParent(createActionKeyHandler()));
	}

	protected ActionRegistry createActionRegistry() {
		ActionRegistry registry = new ActionRegistry();
		UndoAction undoAction = new UndoAction(this);
		registry.registerAction(undoAction);
		RedoAction redoAction = new RedoAction(this);
		registry.registerAction(redoAction);
		SelectAllAction selectAllAction = new SelectAllAction(this);
		registry.registerAction(selectAllAction);
		DeleteAction deleteAction = new DeleteAction((IWorkbenchPart) this);
		deleteAction.setSelectionProvider(graphicalViewer);
		registry.registerAction(deleteAction);
		return registry;
	}

	protected KeyHandler createActionKeyHandler() {
		KeyHandler actionKeyHandler = new KeyHandler();
		actionKeyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0), actionRegistry.getAction(ActionFactory.DELETE.getId()));
		actionKeyHandler.put(KeyStroke.getPressed(SWT.BS, 0x8, 0), actionRegistry.getAction(ActionFactory.DELETE.getId()));
		actionKeyHandler.put(KeyStroke.getPressed('z', 0x7a, SWT.COMMAND), actionRegistry.getAction(ActionFactory.UNDO.getId()));
		actionKeyHandler
				.put(KeyStroke.getPressed('z', 0x7a, SWT.COMMAND | SWT.SHIFT), actionRegistry.getAction(ActionFactory.REDO.getId()));
		actionKeyHandler.put(KeyStroke.getPressed('a', 0x61, SWT.COMMAND), actionRegistry.getAction(ActionFactory.SELECT_ALL.getId()));
		actionKeyHandler.put(KeyStroke.getPressed('z', 0x7a, SWT.CTRL), actionRegistry.getAction(ActionFactory.UNDO.getId()));
		actionKeyHandler.put(KeyStroke.getPressed('z', 0x7a, SWT.CTRL | SWT.SHIFT), actionRegistry.getAction(ActionFactory.REDO.getId()));
		actionKeyHandler.put(KeyStroke.getPressed('a', 0x61, SWT.CTRL), actionRegistry.getAction(ActionFactory.SELECT_ALL.getId()));
		return actionKeyHandler;
	}

	protected GraphicalViewer createGraphicalViewer(Composite parent) {
		GraphicalViewer graphicalViewer = new GestureGraphicalViewer();
		graphicalViewer.createControl(parent);
		ScalableFreeformRootEditPart rootEditPart = editPartFactory.createRoot();
		zoomManager = rootEditPart.getZoomManager();
		zoomManager.setZoomLevelContributions(Lists.newArrayList(ZOOM_LEVELS));
		graphicalViewer.setRootEditPart(rootEditPart);
		graphicalViewer.setEditPartFactory(editPartFactory);
		graphicalViewer.getControl().setBackground(ColorConstants.listBackground);
		return graphicalViewer;
	}

	@Override
	public void dispose() {
		if (actionRegistry != null)
			actionRegistry.dispose();
		if (actionUpdater != null)
			graphicalViewer.removeSelectionChangedListener(actionUpdater);
		if (selectionConverter != null)
			getSite().getWorkbenchWindow().getSelectionService().addPostSelectionListener(selectionConverter);
		diagramConfigurationProvider.removeConfigurationListener(configurationListener);
		currentContents = null;
		super.dispose();
	}

	public void refresh() {
		Object contents = currentContents;
		setViewerContents(null, null, true);
		setViewerContents(contents, editDomain.getClassLoader(), false);
	}

	public boolean setViewerContents(Object contents, ClassLoader classLoader, boolean force) {
		boolean hasContent = false;
		if (contents == null) {
			if (force) {
				currentContents = null;
				graphicalViewer.setContents(null);
			}
		} else {
			if ((force || contents != currentContents) && diagramConfigurationProvider.getDiagramMapping() != null) {
				DiagramInstance instanceModel = modelInstantiator.createInstance(diagramConfigurationProvider.getDiagramMapping(),
						contents, classLoader);
				if (instanceModel != null) {
					currentContents = contents;
					editDomain.setClassLoader(classLoader);
					graphicalViewer.setContents(instanceModel);
					hasContent = true;
				}
			}
		}
		resetViewport();
		exportToFileAction.setEnabled(currentContents != null);
		resetAction.setEnabled(currentContents != null);
		relayoutAction.setEnabled(currentContents != null);
		zoomContributionItem.setZoomManager(zoomManager);
		return hasContent;
	}

	private void resetViewport() {
		IFigure rootFigure = ((GraphicalEditPart) graphicalViewer.getRootEditPart()).getFigure();
		if (rootFigure instanceof Viewport) {
			((Viewport) rootFigure).setViewLocation(0, 0);
		}
	}

	public void gotoDiagram(DiagramInstance diagram) {
		if (diagram != null && currentContents != null) {
			graphicalViewer.setContents(diagram);
			resetViewport();
		}
	}

	public void relayout() {
		if (graphicalViewer.getContents() != null) {
			Object diagramEditPart = graphicalViewer.getEditPartRegistry().get(graphicalViewer.getContents().getModel());
			if (diagramEditPart instanceof DiagramEditPart) {
				((DiagramEditPart) diagramEditPart).performAutoLayout();
			}
		}
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

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == CommandStack.class) {
			return getGraphicalViewer().getEditDomain().getCommandStack();
		} else if (adapter == GraphicalViewer.class) {
			return graphicalViewer;
		}
		return super.getAdapter(adapter);
	}
}
