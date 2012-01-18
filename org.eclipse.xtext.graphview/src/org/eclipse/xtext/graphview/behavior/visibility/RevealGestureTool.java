/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.graphview.behavior.gestures.IGestureHandler;
import org.eclipse.xtext.graphview.behavior.gestures.IViewerGestureListener;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;

public class RevealGestureTool extends AbstractTool implements IGestureHandler, IViewerGestureListener {

	private RevealRequest sourceRequest;

	private IInstanceModelEditPart hostEditPart;

	private double initialDistance;

	private double initialAngle;

	private SwipeAnimationJob swipeAnimationJob;

	public RevealGestureTool(RevealDragTracker initiator) {
		hostEditPart = initiator.getHostEditPart();
		sourceRequest = initiator.getSourceRequest();
		initialDistance = sourceRequest.getMouseDistance();
		initialAngle = sourceRequest.getMouseAngle();
		swipeAnimationJob = new SwipeAnimationJob();
	}

	@Override
	public void activate() {
		super.activate();
		showSourceFeedback();
	}

	@Override
	public void deactivate() {
		if (swipeAnimationJob != null)
			swipeAnimationJob.stop();
		eraseSourceFeedback();
		super.deactivate();
	}

	protected RevealRequest getSourceRequest() {
		return sourceRequest;
	}

	@Override
	protected String getCommandName() {
		return "Add element";
	}

	@Override
	protected boolean handleKeyDown(KeyEvent e) {
		swipeAnimationJob.stop();
		if (e.character == SWT.ESC)
			eraseSourceFeedback();
		return super.handleKeyDown(e);
	}

	@Override
	public void mouseWheelScrolled(Event event, EditPartViewer viewer) {
		// poor man's PAN gesture: FigureCanvas eats all PAN gestures and
		// converts them to far less precise mouse wheel events
		if (event.type == SWT.MouseVerticalWheel || event.type == SWT.MouseHorizontalWheel) {
			swipeAnimationJob.add(event.count / 5000., 1.2);
			event.doit = false;
		}
		super.mouseWheelScrolled(event, viewer);
	}

	public boolean handleGesture(GestureEvent gestureEvent) {
		RevealRequest sourceRequest = getSourceRequest();
		switch (gestureEvent.detail) {
		case SWT.GESTURE_MAGNIFY:
			swipeAnimationJob.stop();
			sourceRequest.setMouseDistance(initialDistance * gestureEvent.magnification);
			break;
		case SWT.GESTURE_ROTATE:
			swipeAnimationJob.stop();
			sourceRequest.setMouseAngle(initialAngle + gestureEvent.rotation * Math.PI / 180.);
			break;
		case SWT.GESTURE_SWIPE:
			swipeAnimationJob.add((gestureEvent.xDirection + gestureEvent.yDirection) / 50., 1.03);
			break;
		// case SWT.GESTURE_PAN:
		// swipeAnimationJob.add(gestureEvent.xDirection / 5000.);
		// break;
		case SWT.GESTURE_END:
			initialDistance = sourceRequest.getMouseDistance();
			initialAngle = sourceRequest.getMouseAngle();
			break;
		default:
			return false;
		}
		showSourceFeedback();
		return true;
	}

	@Override
	protected boolean handleButtonDown(int button) {
		swipeAnimationJob.stop();
		if (button != 1) {
			EditPart selectedEditPart = getHostEditPart().getViewer().findObjectAt(getCurrentInput().getMouseLocation());
			if (selectedEditPart instanceof IInstanceModelEditPart) {
				if (!getSourceRequest().addToSelection((IInstanceModelEditPart) selectedEditPart))
					getSourceRequest().removeFromSelection((IInstanceModelEditPart) selectedEditPart);
				showSourceFeedback();
				return true;
			}
		}
		return super.handleButtonDown(button);
	}

	@Override
	protected boolean handleButtonUp(int button) {
		if (button == 1 && stateTransition(STATE_INITIAL, STATE_TERMINAL)) {
			EditPart selectedEditPart = getHostEditPart().getViewer().findObjectAt(getCurrentInput().getMouseLocation());
			if (selectedEditPart instanceof IInstanceModelEditPart) 
				getSourceRequest().addToSelection((IInstanceModelEditPart) selectedEditPart);
			else if(getSourceRequest().getSelection().isEmpty())
				getSourceRequest().selectAll();
			setCurrentCommand(getHostEditPart().getCommand(getSourceRequest()));
			eraseSourceFeedback();
			executeCommand(getHostEditPart().getCommand(getSourceRequest()));
			setState(STATE_TERMINAL);
			getHostEditPart().getViewer().getEditDomain().loadDefaultTool();
			return true;
		}
		return false;
	}

	public void gesturePerformed(GestureEvent gestureEvent, EditPartViewer viewer) {
		handleGesture(gestureEvent);
	}

	protected IInstanceModelEditPart getHostEditPart() {
		return hostEditPart;
	}

	protected void eraseSourceFeedback() {
		getHostEditPart().eraseSourceFeedback(getSourceRequest());
	}

	protected void showSourceFeedback() {
		getHostEditPart().showSourceFeedback(getSourceRequest());
	}

	protected class SwipeAnimationJob extends UIJob {

		private static final double MAX_SPEED = 0.01;

		private static final int RESCEDULE_INTERVAL = 10;

		private volatile boolean isStop = false;

		private volatile double speed;

		private volatile double slowdown;

		private long lastTime = -1l;

		public SwipeAnimationJob() {
			super("Swipe Animation Job");
		}

		public void add(double delta, double slowdown) {
			this.speed += delta;
			this.slowdown = slowdown;
			isStop = false;
			schedule();
		}

		public void stop() {
			isStop = true;
		}

		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			long currentTime = System.currentTimeMillis();
			if (!isStop) {
				long timeDelta = (lastTime != -1) ? currentTime - lastTime : RESCEDULE_INTERVAL;
				lastTime = currentTime;
				double angle = getSourceRequest().getMouseAngle() + timeDelta * Math.max(-MAX_SPEED, Math.min(MAX_SPEED, speed));
				getSourceRequest().setMouseAngle(angle);
				showSourceFeedback();
				speed /= slowdown;
				if (Math.abs(speed) > 0.001)
					schedule(RESCEDULE_INTERVAL);
				else 
					speed = 0.;
			}
			lastTime = (isStop) ? -1 : currentTime;
			return Status.OK_STATUS;
		}
	}
}
