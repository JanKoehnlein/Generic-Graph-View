package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.request.HideRequest;
import org.eclipse.xtext.graphview.editpolicy.request.SetVisibilityCommand;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.inject.Inject;

public class HideEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Hide role";
	
	@Inject
	private SetVisibilityCommand.Provider visibilityCommandProvider;
	
	@Override
	public Command getCommand(Request request) {
		if(request instanceof HideRequest)
			return visibilityCommandProvider.get((AbstractInstance) getHost().getModel(), Visibility.HIDDEN);
		return super.getCommand(request);
	}
}
