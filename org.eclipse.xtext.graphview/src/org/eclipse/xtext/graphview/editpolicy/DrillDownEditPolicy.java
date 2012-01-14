/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.editpart.DrillingHelper;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class DrillDownEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Drill down role";

	@Inject
	private DrillingHelper drillingHelper;
	
	@Override
	public Command getCommand(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			drillingHelper.drillDown((AbstractInstance) getHost().getModel());
		}
		return super.getCommand(request);
	}
}
