package org.eclipse.xtext.graphview.editpolicy.request;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.Request;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.editpolicy.RevealedEditPartMap;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public class RevealRequest extends Request {

	private final List<AbstractInstance> toBeRevealed;

	private Point currentMouseLocation;
	
	private boolean isRevealSingle;
	
	private IInstanceModelEditPart singleSelection;
	
	private RevealedEditPartMap revealedEditPartMap;
	
	public RevealRequest(List<AbstractInstance> toBeRevealed) {
		this.toBeRevealed = toBeRevealed;
	}
	
	@Override
	public Object getType() {
		return "Show connected";
	}
	
	public List<AbstractInstance> getToBeRevealed() {
		return toBeRevealed;
	}
	
	public Point getCurrentMouseLocation() {
		return currentMouseLocation;
	}

	public void setCurrentMouseLocation(Point currentMouseLocation) {
		this.currentMouseLocation = currentMouseLocation;
	}

	public boolean isRevealSingle() {
		return isRevealSingle;
	}

	public void setRevealSingle(boolean isRevealSingle) {
		this.isRevealSingle = isRevealSingle;
	}

	public RevealedEditPartMap getRevealedEditPartMap() {
		return revealedEditPartMap;
	}

	public void setRevealedEditPartMap(RevealedEditPartMap revealedEditPartMap) {
		this.revealedEditPartMap = revealedEditPartMap;
	}

	public IInstanceModelEditPart getSingleSelection() {
		return singleSelection;
	}

	public void setSingleSelection(IInstanceModelEditPart singleSelection) {
		this.singleSelection = singleSelection;
	}

}
