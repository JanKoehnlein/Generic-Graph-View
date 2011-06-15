package org.eclipse.xtext.graphview.view.selection;

import java.util.Collections;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.Strings;

public class EcoreEditorElementSelectionStrategy implements
		IElementSelectionStrategy {

	@Override
	public boolean isStrategyFor(IEditorPart editor) {
		return Strings.equal("org.eclipse.emf.ecore.presentation.EcoreEditor",
				editor.getClass().getCanonicalName());
	}

	@Override
	public Object getSelectedElement(IEditorPart editor, ISelection selection) {
		if (selection instanceof IStructuredSelection)
			return ((IStructuredSelection) selection).getFirstElement();
		return null;
	}

	@Override
	public ISelection setSelection(IEditorPart editor, Object selectedElement) {
		PolymorphicDispatcher.createForSingleTarget("setSelectionToViewer", editor).invoke(Collections.singleton(selectedElement));
		return editor.getEditorSite().getSelectionProvider().getSelection();
	}
}
