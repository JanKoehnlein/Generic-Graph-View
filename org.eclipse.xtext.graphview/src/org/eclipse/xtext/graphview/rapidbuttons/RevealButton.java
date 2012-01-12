package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.editpolicy.request.RevealRequest;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class RevealButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/add_16.png");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getEditPolicy().getHost()) {

			@Override
			protected String getCommandName() {
				return "Add element";
			}

			@Override
			protected List<IInstanceModelEditPart> createOperationSet() {
				return Collections.singletonList(getHostEditPart());
			}

			@Override
			protected Request createSourceRequest() {
				AbstractInstance model = getHostEditPart().getModel();
				if (model instanceof NodeInstance) {
					NodeInstance node = (NodeInstance) model;
					List<AbstractInstance> toBeRevealed = Lists.newArrayList();
					for (EdgeInstance edge : node.getIncomingEdges()) {
						if (edge.getSource().getVisibility() == Visibility.HIDDEN) {
							toBeRevealed.add(edge);
							toBeRevealed.add(edge.getSource());
						}
					}
					for (EdgeInstance edge : node.getOutgoingEdges()) {
						if (edge.getTarget().getVisibility() == Visibility.HIDDEN) {
							toBeRevealed.add(edge);
							toBeRevealed.add(edge.getTarget());
						}
					}
					return new RevealRequest(toBeRevealed);
				} else {
					return null;
				}
			}

			protected boolean handleButtonDown(int button) {
				if (stateTransition(STATE_INITIAL, STATE_DRAG)) {
					((RevealRequest) getSourceRequest())
							.setRevealSingle(button != 1);
					return true;
				} else {
					return false;
				}
			}

			@Override
			protected boolean handleDrag() {
				return true;
			}

			@Override
			protected boolean stateTransition(int start, int end) {
				System.out.println(start + " -> " + end);
				return super.stateTransition(start, end);
			}

			@Override
			protected boolean handleDragInProgress() {
				stateTransition(STATE_DRAG, STATE_DRAG_IN_PROGRESS);
				Point mouseLocation = getCurrentInput().getMouseLocation();
				((RevealRequest) getSourceRequest())
						.setCurrentMouseLocation(mouseLocation);
				showSourceFeedback();
				return true;
			}

			protected boolean handleButtonUp(int button) {
				if (stateTransition(STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
					eraseSourceFeedback();
					setCurrentCommand(getHostEditPart().getCommand(
							getSourceRequest()));
					executeCurrentCommand();
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean handleGesture(GestureEvent gestureEvent) {
				System.out.println(gestureEvent.detail);
				return super.handleGesture(gestureEvent);
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && hasHiddenEdge());
	}

	protected boolean hasHiddenEdge() {
		AbstractInstance model = getEditPolicy().getHost().getModel();
		if (model instanceof NodeInstance) {
			NodeInstance node = (NodeInstance) model;
			return Iterables.any(
					Iterables.concat(node.getOutgoingEdges(),
							node.getIncomingEdges()),
					new Predicate<EdgeInstance>() {
						public boolean apply(EdgeInstance input) {
							return input.getVisibility() == Visibility.HIDDEN;
						}
					});
		} else {
			return false;
		}
	}
}
