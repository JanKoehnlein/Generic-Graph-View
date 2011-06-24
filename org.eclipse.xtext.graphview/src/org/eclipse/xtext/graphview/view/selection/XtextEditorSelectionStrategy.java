/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.selection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.graphview.view.GraphView;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class XtextEditorSelectionStrategy implements IElementSelectionStrategy {

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
		return editor instanceof XtextEditor
				&& Strings.equal(editor.getSite().getId(), languageName);
	}

	public Object editorSelectionChanged(IEditorPart editor,
			final ISelection selection, final GraphView graphView) {
		if (selection instanceof ITextSelection) {
			return ((XtextEditor) editor).getDocument().readOnly(
					new IUnitOfWork<URI, XtextResource>() {
						public URI exec(XtextResource state) throws Exception {
							EObject selectedElement = eObjectAtOffsetHelper
									.resolveElementAt(state,
											((ITextSelection) selection)
													.getOffset());
							if (selectedElement != null) {
								graphView.setViewerContents(selectedElement,
										getClassLoader(), false);
								return EcoreUtil.getURI(selectedElement);
							}
							return null;
						}
					});
		}
		return null;
	}

	public ISelection viewSelectionChanged(final IEditorPart editor,
			final Object selectedElement, GraphView graphView) {
		if (selectedElement instanceof EObject) {
			return ((XtextEditor) editor).getDocument().readOnly(
					new IUnitOfWork<ITextSelection, XtextResource>() {
						public ITextSelection exec(XtextResource state)
								throws Exception {
							ITextRegion textRegion = locationInFileProvider
									.getSignificantTextRegion((EObject) selectedElement);
							((XtextEditor) editor).selectAndReveal(
									textRegion.getOffset(),
									textRegion.getLength());
							return new TextSelection(textRegion.getOffset(),
									textRegion.getLength());
						}
					});
		}
		return StructuredSelection.EMPTY;
	}

	protected ClassLoader getClassLoader() {
		return plugin.getClass().getClassLoader();
	}
}
