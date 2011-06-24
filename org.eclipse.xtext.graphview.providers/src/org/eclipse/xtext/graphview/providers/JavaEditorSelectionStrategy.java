/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.providers;

import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.GraphView;
import org.eclipse.xtext.graphview.view.selection.StructuredElementSelectionStrategy;
import org.eclipse.xtext.util.PolymorphicDispatcher;

@SuppressWarnings("restriction")
public class JavaEditorSelectionStrategy extends StructuredElementSelectionStrategy {

	@Override
	public boolean isStrategyFor(IEditorPart editor) {
		return editor instanceof JavaEditor;
	}

	@Override
	public Object editorSelectionChanged(IEditorPart editor, ISelection selection, GraphView graphView) {
		if(selection instanceof ITextSelection) {
			Object element = PolymorphicDispatcher.createForSingleTarget("getElementAt", 1, 1, editor).invoke(((ITextSelection)selection).getOffset());
			graphView.setViewerContents(element, getClassLoader(), false);
			return element;
		}
		return super.editorSelectionChanged(editor, selection, graphView);
	}

}
