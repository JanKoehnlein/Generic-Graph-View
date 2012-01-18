/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
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
