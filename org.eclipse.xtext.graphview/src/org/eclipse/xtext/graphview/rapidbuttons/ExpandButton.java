package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.editpolicy.ExpandEditPolicy;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class ExpandButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;
	
	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/expandall.gif");
	}
	
	@Override
	protected DragTracker createDragTracker() {
		return new SimpleDragTracker() { 
			@Override
			protected String getCommandName() {
				return "Hide element";
			}
			
			@Override
			protected Request createSourceRequest() {
				Request expandRequest = new Request(ExpandEditPolicy.REQ_EXPAND);
				return expandRequest;
			}
			
			protected boolean handleButtonDown(int button) {
				stateTransition(STATE_INITIAL, STATE_DRAG_IN_PROGRESS);
				setCurrentCommand(getEditPolicy().getHost().getCommand(getSourceRequest()));
				return true;
			}

			protected boolean handleButtonUp(int button) {
				if (stateTransition(STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
					executeCurrentCommand();
				}
				return true;
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && getEditPolicy().getHost().hasHiddenChildren());
	}
}
