package org.eclipse.xtext.graphview.view.selection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.GraphView;

public interface IElementSelectionStrategy {

	boolean isStrategyFor(IEditorPart editor);
	
	Object editorSelectionChanged(IEditorPart editor, ISelection selection, GraphView graphView);
	
	ISelection viewSelectionChanged(IEditorPart editor, Object selectedElement, GraphView graphView);
}
