package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.xtext.graphview.editpolicy.request.RevealRequest;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.common.collect.Lists;

public class RevealButton extends AbstractRapidButton {

	@Override
	protected DragTracker createDragTracker() {
		return new SimpleDragTracker() { 
			@Override
			protected String getCommandName() {
				return "Add element";
			}
			
			@Override
			protected Request createSourceRequest() {
				AbstractInstance model = getEditPolicy().getHost().getModel();
				if (model instanceof NodeInstance) {
					NodeInstance node = (NodeInstance) model;
					List<AbstractInstance> toBeRevealed = Lists.newArrayList();
					toBeRevealed.add(node);
					for(EdgeInstance edge: node.getIncomingEdges()) {
						if(edge.getSource().getVisibility() == Visibility.HIDDEN) {
							toBeRevealed.add(edge);
							toBeRevealed.add(edge.getSource());
						}
					}
					for(EdgeInstance edge: node.getOutgoingEdges()) {
						if(edge.getTarget().getVisibility() == Visibility.HIDDEN) {
							toBeRevealed.add(edge);
							toBeRevealed.add(edge.getTarget());
						}
					}
					return new RevealRequest(toBeRevealed);
				}
				return null;
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
		return "elcl16/add_16.png";
	}

}
