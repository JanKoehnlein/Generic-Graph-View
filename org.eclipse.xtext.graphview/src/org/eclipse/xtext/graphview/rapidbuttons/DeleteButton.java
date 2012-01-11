package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.draw2d.RelativeLocator;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gef.tools.SimpleDragTracker;

import com.google.common.collect.Lists;

public class DeleteButton extends AbstractRapidButton {

	@Override
	public void init(RapidButtonEditPolicy editPolicy, int position) {
		super.init(editPolicy, position);
		RelativeLocator locator = new RelativeLocator(editPolicy.getHost().getFigure(), position);
		setLocator(locator);
	}
	
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
				GroupRequest deleteRequest = new GroupRequest();
				deleteRequest.setType(RequestConstants.REQ_DELETE);
				List<EditPart> editParts = Lists.newArrayList();
				editParts.add(getEditPolicy().getHost());
				editParts.addAll(getEditPolicy().getHost().getSourceConnections());
				editParts.addAll(getEditPolicy().getHost().getTargetConnections());
				deleteRequest.setEditParts(editParts);
				return deleteRequest;
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
