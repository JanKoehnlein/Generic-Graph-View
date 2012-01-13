/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.providers;

import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.GraphView;
import org.eclipse.xtext.graphview.view.selection.AbstractElementSelectionStrategy;
import org.eclipse.xtext.util.PolymorphicDispatcher;

public class EMFEditorElementSelectionStrategy extends AbstractElementSelectionStrategy {

	private Adapter adapter;

	public boolean isStrategyFor(IEditorPart editor) {
		return editor instanceof IEditingDomainProvider;
	}

	public ISelection viewSelectionChanged(Object selectedElement) {
		PolymorphicDispatcher.createForSingleTarget("setSelectionToViewer", getEditor()).invoke(Collections.singleton(selectedElement));
		return getEditor().getEditorSite().getSelectionProvider().getSelection();
	}

	public Object editorSelectionChanged(ISelection selection, boolean force) {
		if (selection instanceof IStructuredSelection) {
			Object selectedElement = ((IStructuredSelection) selection).getFirstElement();
			getGraphView().setViewerContents(selectedElement, getClassLoader(), force);
			return selectedElement;
		} else
			return null;
	}

	@Override
	public void register(IEditorPart editor, GraphView graphView) {
		super.register(editor, graphView);
		adapter = new Adapter(this);
		EditingDomain editingDomain = ((IEditingDomainProvider) editor).getEditingDomain();
		editingDomain.getResourceSet().eAdapters().add(adapter);
	}

	@Override
	public void deregister(IEditorPart editor, GraphView graphView) {
		if (adapter != null) {
			adapter.getTarget().eAdapters().remove(adapter);
		}
		super.deregister(editor, graphView);
	}

	protected static class Adapter extends EContentAdapter {
		private final EMFEditorElementSelectionStrategy strategy;

		public Adapter(EMFEditorElementSelectionStrategy strategy) {
			this.strategy = strategy;
		}

		public void notifyChanged(Notification notification) {
			if (!notification.isTouch())
				strategy.refreshView();
		}
	}
}
