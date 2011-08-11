/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.providers;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.graphview.view.GraphView;
import org.eclipse.xtext.graphview.view.selection.StructuredElementSelectionStrategy;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.Strings;

@SuppressWarnings("restriction")
public class JavaEditorSelectionStrategy extends StructuredElementSelectionStrategy {

	private static Logger LOG = Logger.getLogger(JavaEditorSelectionStrategy.class);
	
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

	
	@Override
	public ISelection viewSelectionChanged(IEditorPart editor,
			Object selectedElement, GraphView graphView) {
		if(selectedElement instanceof IJavaElement) {
			IResource resource = ((IJavaElement) selectedElement).getResource();
			if(resource instanceof IFile) {
				String editorID = null;
				if(Strings.equal(resource.getFileExtension(), "java")) {
					editorID = "org.eclipse.jdt.ui.CompilationUnitEditor";
				} else if(Strings.equal(resource.getFileExtension(), "class")) {
					editorID = "org.eclipse.jdt.ui.ClassFileEditor";
				}
				if(editorID != null) {
					try {
						editor.getEditorSite().getPage().openEditor(new FileEditorInput((IFile) resource), editorID);
					} catch (PartInitException e) {
						LOG.error("Error opening editor", e);
					}
				}
			}
		}
		return super.viewSelectionChanged(editor, selectedElement, graphView);
	}
}
