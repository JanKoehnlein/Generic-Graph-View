package org.eclipse.xtext.graphview.editpolicy.request;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.editpolicy.RevealedEditPartMap;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public class RevealRequest extends Request {

	private final List<AbstractInstance> toBeRevealed;

	private RevealedEditPartMap revealedEditPartMap;

	private double mouseAngle;
	
	private double mouseDistance;
	
	private boolean isRevealSingle;

	private double selectAngle;
	
	private IInstanceModelEditPart singleSelection;

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
	
	public double getMouseDistance() {
		return mouseDistance;
	}
	
	public void setMouseDistance(double mouseDistance) {
		this.mouseDistance = mouseDistance;
	}
	
	public double getMouseAngle() {
		return mouseAngle;
	}

	public void setMouseAngle(double mouseAngle) {
		this.mouseAngle = mouseAngle;
	}
	
	public boolean isRevealSingle() {
		return isRevealSingle;
	}

	public void setRevealSingle(boolean isRevealSingle) {
		this.isRevealSingle = isRevealSingle;
	}

	public double getSelectAngle() {
		return selectAngle;
	}

	public void setRevealAngle(double revealAngle) {
		this.selectAngle = revealAngle;
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
