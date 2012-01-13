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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.graphview.view.GraphView;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

@Singleton
public class ElementSelectionConverter implements ISelectionListener {

	private static final Logger LOG = Logger.getLogger(ElementSelectionConverter.class);

	@Inject
	private GraphView graphView;

	@Inject
	private IExtensionRegistry extensionRegistry;

	private IEditorPart myEditor;

	private ISelection mySelection = null;

	private IElementSelectionStrategy myStrategy;

	private List<IElementSelectionStrategy> contributions;

	@Inject
	protected void initialize(Injector injector) {
		contributions = Lists.newArrayList();
		for (IConfigurationElement configurationElement : extensionRegistry
				.getConfigurationElementsFor("org.eclipse.xtext.graphview.selectionStrategy")) {
			try {
				contributions.add((IElementSelectionStrategy) configurationElement.createExecutableExtension("class"));
			} catch (CoreException e) {
				LOG.error("Error instantiating selection strategy", e);
			}
		}
	}

	protected IElementSelectionStrategy findElementSelectionStrategy(IEditorPart editor) {
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
				if (elementSelectionStrategy != null) {
					if (myEditor != editor) {
						if (myStrategy != null) {
							myStrategy.deregister(myEditor, graphView);
						}
						this.myEditor = editor;
						myStrategy = elementSelectionStrategy;
						elementSelectionStrategy.register(editor, graphView);
					}
					elementSelectionStrategy.editorSelectionChanged(selection, false);
				}
			}
		} catch (Exception e) {
			mySelection = null;
			LOG.error("Error getting selected element", e);
		}
	}

	public void select(Object selectedElement) {
		try {
			if (myEditor != null) {
				myEditor.getEditorSite().getPage().bringToTop(myEditor);
				IElementSelectionStrategy elementSelectionStrategy = findElementSelectionStrategy(myEditor);
				ISelection selection = elementSelectionStrategy.viewSelectionChanged(selectedElement);
				if (selection != null) {
					mySelection = selection;
				}
			}
		} catch (Exception e) {
			LOG.error("Error selecting element", e);
		}
	}

}
