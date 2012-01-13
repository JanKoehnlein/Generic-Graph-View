/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.selection;

import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.GraphView;

public abstract class AbstractElementSelectionStrategy implements IElementSelectionStrategy {

	private IEditorPart editor;

	private GraphView graphView;

	protected ClassLoader getClassLoader() {
		return getClass().getClassLoader();
	}

	public void register(IEditorPart editor, GraphView graphView) {
		this.editor = editor;
		this.graphView = graphView;
	}

	public void deregister(IEditorPart editor, GraphView graphView) {
		this.editor = null;
		this.graphView = null;
	}

	protected IEditorPart getEditor() {
		return editor;
	}

	protected GraphView getGraphView() {
		return graphView;
	}

	protected Object refreshView() {
		return editorSelectionChanged(editor.getSite().getSelectionProvider().getSelection(), true);
	}
}