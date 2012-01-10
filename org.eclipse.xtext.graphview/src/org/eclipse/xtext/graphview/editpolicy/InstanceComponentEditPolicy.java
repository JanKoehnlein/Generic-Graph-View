package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.xtext.graphview.editpolicy.request.SetVisibilityCommand;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.inject.Inject;

public class InstanceComponentEditPolicy extends ComponentEditPolicy {

	@Inject
	private SetVisibilityCommand.Provider visibilityCommandProvider;
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		return visibilityCommandProvider.get((AbstractInstance) getHost().getModel(), Visibility.HIDDEN);
	}
}
