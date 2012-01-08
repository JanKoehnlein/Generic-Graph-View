package org.eclipse.xtext.graphview.editpolicy.request;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public class RevealRequest extends Request {

	private final List<AbstractInstance> toBeRevealed;

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
}
