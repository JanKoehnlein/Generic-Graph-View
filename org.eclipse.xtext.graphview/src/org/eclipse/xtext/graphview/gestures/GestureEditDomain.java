package org.eclipse.xtext.graphview.gestures;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Tool;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.ui.IEditorPart;

public class GestureEditDomain extends DefaultEditDomain implements IViewerGestureListener  {

	public GestureEditDomain(IEditorPart editorPart) {
		super(editorPart);
	}

	public void gesture(GestureEvent event, EditPartViewer viewer) {
		Tool tool = getActiveTool();
		if (tool instanceof IViewerGestureListener)
			((IViewerGestureListener) tool).gesture(event, viewer);
	}
	
	// super.defaultTool is private
	private Tool defaultTool;

	@Override
	public Tool getDefaultTool() {
		if(defaultTool == null) {
			defaultTool = new GestureSelectionTool();
			super.setDefaultTool(defaultTool);
		}
		return defaultTool;
	}
}
