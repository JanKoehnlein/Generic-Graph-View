package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class OpenDiagramButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/opendiagram.gif");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getEditPolicy().getHost()) {
			@Override
			protected String getCommandName() {
				return "Hide element";
			}

			@Override
			protected Request createSourceRequest() {
				return new Request(RequestConstants.REQ_OPEN);
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && hasOpenDiagram());
	}

	protected boolean hasOpenDiagram() {
		for (AbstractInstance child : getEditPolicy().getHost().getModel().getChildren()) {
			if (child instanceof DiagramInstance && ((DiagramInstance) child).isOpenNewDiagram())
				return true;
		}
		return false;
	}
}
