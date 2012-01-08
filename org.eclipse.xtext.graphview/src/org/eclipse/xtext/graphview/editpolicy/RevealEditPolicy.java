package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.request.RevealRequest;
import org.eclipse.xtext.graphview.editpolicy.request.SetVisibilityCommand;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.inject.Inject;

public class RevealEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Reveal role";
	
	@Inject
	private SetVisibilityCommand.Provider visibilityCommandProvider;
	
	@Override
	public Command getCommand(Request request) {
		if(request instanceof RevealRequest) {
			CompoundCommand compoundCommand = new CompoundCommand();
			for(AbstractInstance instance: ((RevealRequest) request).getToBeRevealed()) {
				compoundCommand.add(visibilityCommandProvider.get(instance, Visibility.VISIBLE));
			}
			return compoundCommand;
		}
		return super.getCommand(request);
	}
}
