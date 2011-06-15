package org.eclipse.xtext.graphview.view.selection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

public interface IElementSelectionStrategy {

	boolean isStrategyFor(IEditorPart editor);
	
	Object getSelectedElement(IEditorPart editor, ISelection selection);
	
	ISelection setSelection(IEditorPart editor, Object selectedElement);
}
