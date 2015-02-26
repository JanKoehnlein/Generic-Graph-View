/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.providers;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.selection.AbstractElementSelectionStrategy;
import org.eclipse.xtext.util.PolymorphicDispatcher;

public class JavaEditorSelectionStrategy extends AbstractElementSelectionStrategy {

	private static Logger LOG = Logger.getLogger(JavaEditorSelectionStrategy.class);

	public boolean isStrategyFor(IEditorPart editor) {
		return editor instanceof JavaEditor;
	}

	public Object editorSelectionChanged(ISelection selection, boolean force) {
		if (selection instanceof ITextSelection) {
			Object element = PolymorphicDispatcher.createForSingleTarget("getElementAt", 1, 1, getEditor()).invoke(
					((ITextSelection) selection).getOffset());
			getGraphView().setViewerContents(element, getClassLoader(), force);
			return element;
		}
		return null;
	}

	public ISelection viewSelectionChanged(Object selectedElement) {
		if (selectedElement instanceof IJavaElement) {
			try {
				JavaUI.openInEditor((IJavaElement) selectedElement);
				return new StructuredSelection(selectedElement);
			} catch (Exception e) {
				LOG.error("Error opening editor", e);
			}
		}
		return null;
	}
}
