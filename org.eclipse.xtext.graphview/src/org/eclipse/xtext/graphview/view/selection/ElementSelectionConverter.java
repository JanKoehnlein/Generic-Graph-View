/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.selection;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.graphview.view.GraphView;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

@Singleton
public class ElementSelectionConverter implements ISelectionListener {

	private static final Logger LOG = Logger
			.getLogger(ElementSelectionConverter.class);

	@Inject
	private GraphView graphView;

	@Inject
	private IWorkbench workbench;
	
	@Inject
	private IExtensionRegistry extensionRegistry;

	private IEditorInput editorInput;

	private String editorId;

	private List<IElementSelectionStrategy> contributions;

	private ISelection mySelection = null;

	private IElementSelectionStrategy defaultElementSelectionStrategy = new StructuredElementSelectionStrategy() {
		public boolean isStrategyFor(IEditorPart editor) {
			return true;
		}
	};

	@Inject
	protected void initialize(Injector injector) {
		contributions = Lists.newArrayList();
		for(IConfigurationElement configurationElement : extensionRegistry.getConfigurationElementsFor("org.eclipse.xtext.graphview.selectionStrategy")) {
			try {
				contributions.add((IElementSelectionStrategy) configurationElement.createExecutableExtension("class"));
			} catch (CoreException e) {
				LOG.error("Error instantiating selection strategy", e);
			}
		}
		contributions.add(defaultElementSelectionStrategy);
	}

	protected IElementSelectionStrategy findElementSelectionStrategy(
			IEditorPart editor) {
		for (IElementSelectionStrategy elementSelectionStrategy : contributions) {
			if (elementSelectionStrategy.isStrategyFor(editor))
				return elementSelectionStrategy;
		}
		return null;
	}

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		try {
			if (selection == mySelection) {
				return;
			}
			if (part instanceof IEditorPart && !selection.isEmpty()) {
				IEditorPart editor = (IEditorPart) part;
				IElementSelectionStrategy elementSelectionStrategy = findElementSelectionStrategy((IEditorPart) editor);
				Object semanticElement = elementSelectionStrategy
						.editorSelectionChanged(editor, selection, graphView);
				if (semanticElement != null) {
						this.editorInput = ((IEditorPart) part)
								.getEditorInput();
						this.editorId = ((IEditorPart) part).getEditorSite()
								.getId();
				}
			}
		} catch (Exception e) {
			LOG.error("Error getting selected element", e);
		} finally {
			mySelection = null;
		}
	}

	public void select(Object selectedElement) {
		try {
			IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow()
					.getActivePage();
			IEditorPart editor = activePage.openEditor(editorInput, editorId);
			if (editor != null) {
				activePage.bringToTop(editor);
				IElementSelectionStrategy elementSelectionStrategy = findElementSelectionStrategy((IEditorPart) editor);
				ISelection selection = elementSelectionStrategy
						.viewSelectionChanged(editor, selectedElement, graphView);
				if (selection != null) {
					mySelection = selection;
				}
			}
		} catch (Exception e) {
			LOG.error("Error selecting element", e);
		}
	}

}
