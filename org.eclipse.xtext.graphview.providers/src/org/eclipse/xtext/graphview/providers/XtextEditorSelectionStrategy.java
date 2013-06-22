/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.providers;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.graphview.view.GraphView;
import org.eclipse.xtext.graphview.view.selection.AbstractElementSelectionStrategy;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class XtextEditorSelectionStrategy extends AbstractElementSelectionStrategy implements IXtextModelListener {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private ILocationInFileProvider locationInFileProvider;

	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String languageName;

	@Inject
	private AbstractUIPlugin plugin;

	public boolean isStrategyFor(IEditorPart editor) {
		return editor instanceof XtextEditor && Strings.equal(editor.getSite().getId(), languageName);
	}

	public Object editorSelectionChanged(final ISelection selection, final boolean force) {
		if (selection instanceof ITextSelection) {
			return ((XtextEditor) getEditor()).getDocument().readOnly(new IUnitOfWork<URI, XtextResource>() {
				public URI exec(XtextResource state) throws Exception {
					EObject selectedElement = eObjectAtOffsetHelper.resolveElementAt(state, ((ITextSelection) selection).getOffset());
					if (selectedElement != null) {
						getGraphView().setViewerContents(selectedElement, getClassLoader(), force);
						return EcoreUtil.getURI(selectedElement);
					}
					return null;
				}
			});
		}
		return null;
	}

	public ISelection viewSelectionChanged(final Object selectedElement) {
		if (selectedElement instanceof EObject) {
			return ((XtextEditor) getEditor()).getDocument().readOnly(new IUnitOfWork<ITextSelection, XtextResource>() {
				public ITextSelection exec(XtextResource state) throws Exception {
					ITextRegion textRegion = locationInFileProvider.getSignificantTextRegion((EObject) selectedElement);
					((XtextEditor) getEditor()).selectAndReveal(textRegion.getOffset(), textRegion.getLength());
					return new TextSelection(textRegion.getOffset(), textRegion.getLength());
				}
			});
		}
		return StructuredSelection.EMPTY;
	}

	protected ClassLoader getClassLoader() {
		return plugin.getClass().getClassLoader();
	}

	public void register(IEditorPart editor, GraphView graphView) {
		super.register(editor, graphView);
		IXtextDocument document = ((XtextEditor) editor).getDocument();
		if (document != null)
			document.addModelListener(this);
	}

	public void deregister(IEditorPart editor, GraphView graphView) {
		IXtextDocument document = ((XtextEditor) editor).getDocument();
		if (document != null)
			document.removeModelListener(this);
		super.deregister(editor, graphView);
	}

	public void modelChanged(XtextResource resource) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				refreshView();
			}
		});
	}
}
