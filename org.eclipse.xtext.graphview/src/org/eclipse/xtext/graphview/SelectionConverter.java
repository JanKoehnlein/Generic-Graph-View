package org.eclipse.xtext.graphview;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

public class SelectionConverter implements ISelectionListener {

	private GraphView graphView;

	public SelectionConverter(GraphView graphView) {
		this.graphView = graphView;
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if(part instanceof IEditorPart) {
			if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
				Object firstElement = ((IStructuredSelection) selection).getFirstElement();
				graphView.setViewerContents(firstElement, false);
			}
		}
	}

}
