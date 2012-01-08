package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.xtext.graphview.editpolicy.request.HideRequest;

import com.google.common.collect.Lists;

public class HideButton extends AbstractRapidButton {

	@Override
	protected DragTracker createDragTracker() {
		return new SimpleDragTracker() { 
			@Override
			protected String getCommandName() {
				return "Hide element";
			}
			
			@SuppressWarnings("unchecked")
			@Override
			protected Request createSourceRequest() {
				HideRequest hideRequest = new HideRequest();
				List<EditPart> editParts = Lists.newArrayList();
				editParts.add(getEditPolicy().getHost());
				editParts.addAll(getEditPolicy().getHost().getSourceConnections());
				editParts.addAll(getEditPolicy().getHost().getTargetConnections());
				hideRequest.setEditParts(editParts);
				return hideRequest;
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
	protected String getImagePath() {
		return "elcl16/close_16.png";
	}
	

}
