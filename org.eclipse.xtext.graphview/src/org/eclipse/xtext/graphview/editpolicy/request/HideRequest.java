package org.eclipse.xtext.graphview.editpolicy.request;

import org.eclipse.gef.requests.GroupRequest;

public class HideRequest extends GroupRequest {

	@Override
	public Object getType() {
		return "Hide";
	}

}
