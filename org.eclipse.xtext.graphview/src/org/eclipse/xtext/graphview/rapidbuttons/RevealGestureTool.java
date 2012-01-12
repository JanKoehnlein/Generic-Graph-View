package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.editpolicy.request.RevealRequest;
import org.eclipse.xtext.graphview.gestures.IGestureHandler;
import org.eclipse.xtext.graphview.gestures.IViewerGestureListener;

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
		if(e.character == SWT.ESC)
			eraseSourceFeedback();
		return super.handleKeyDown(e);
	}
	
	@Override
	public void mouseWheelScrolled(Event event, EditPartViewer viewer) {
		if(event.type == SWT.MouseVerticalWheel || event.type == SWT.MouseHorizontalWheel) {
			swipeAnimationJob.add(event.count / 5000.);
			event.doit = false;
		}
		super.mouseWheelScrolled(event, viewer);
	}
	
	public boolean handleGesture(GestureEvent gestureEvent) {
		RevealRequest sourceRequest = getSourceRequest();
		switch (gestureEvent.detail) {
		case SWT.GESTURE_MAGNIFY:
			System.out.println("Magnify:" + gestureEvent.magnification);
			swipeAnimationJob.stop();
			sourceRequest.setMouseDistance(initialDistance
					* gestureEvent.magnification);
			break;
		case SWT.GESTURE_ROTATE:
			System.out.println("Rotate:" + gestureEvent.rotation);
			swipeAnimationJob.stop();
			sourceRequest.setMouseAngle(initialAngle
					+ gestureEvent.rotation * Math.PI / 180.);
			break;
		case SWT.GESTURE_SWIPE:
		case SWT.GESTURE_PAN:
			System.out.println("Swipe:" + gestureEvent.time);
			swipeAnimationJob.add(gestureEvent.xDirection);
			break;
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
		return super.handleButtonDown(button);
	}

	@Override
	protected boolean handleButtonUp(int button) {
		if (stateTransition(STATE_INITIAL, STATE_TERMINAL)) {
			setCurrentCommand(getHostEditPart().getCommand(getSourceRequest()));
			eraseSourceFeedback();
			executeCommand(getHostEditPart().getCommand(getSourceRequest()));
			setState(STATE_TERMINAL);
			getHostEditPart().getViewer().getEditDomain().loadDefaultTool();
			return true;
		}
		return false;
	}

	public void gesture(GestureEvent gestureEvent, EditPartViewer viewer) {
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

		private static final int RESCEDULE_INTERVAL = 10;

		private volatile boolean isStop = false;
		
		private volatile double speed;

		private long lastTime = -1l;
		
		public SwipeAnimationJob() {
			super("Swipe Animation Job");
		}
		
		public void add(double delta) {
			this.speed += delta;
			isStop = false;
			schedule();
		}
		
		public void stop() {
			try {
				isStop = true;
				this.join();
			} catch (InterruptedException e) {
			}
		}

		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			long currentTime = System.currentTimeMillis();
			if(!isStop) {
				long timeDelta = (lastTime != -1) ? currentTime - lastTime : RESCEDULE_INTERVAL;
				lastTime = currentTime;
				double angle = getSourceRequest().getMouseAngle() + timeDelta * Math.min(0.01, speed);
				getSourceRequest().setMouseAngle(angle);
				showSourceFeedback();
				speed /= 2;
				if(Math.abs(speed) > 0.01)
					schedule(RESCEDULE_INTERVAL);
			}
			lastTime = (isStop) ? -1 : currentTime;
			return Status.OK_STATUS;
		}
	}
}
