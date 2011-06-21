package org.eclipse.xtext.graphview.view.selection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.GraphView;

public class StructuredElementSelectionStrategy implements
		IElementSelectionStrategy {
	
	public boolean isStrategyFor(IEditorPart editor) {
		return false;
	}

	public ISelection viewSelectionChanged(IEditorPart editor, Object selectedElement, GraphView graphView) {
		StructuredSelection structuredSelection = new StructuredSelection(selectedElement);
		editor.getEditorSite().getSelectionProvider().setSelection(structuredSelection);
		return structuredSelection;
	}

	public Object editorSelectionChanged(IEditorPart editor, ISelection selection, GraphView graphView) {
		if (selection instanceof IStructuredSelection) {
			Object selectedElement = ((IStructuredSelection) selection).getFirstElement();
			graphView.setViewerContents(selectedElement, getClassLoader(), false);
			return selectedElement;
		} else
			return null;
	}
	
	protected ClassLoader getClassLoader() {
		return getClass().getClassLoader();
	}
}