/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.common.collect.Maps;

public class SetVisibilityCommand extends Command {

	public static class Provider {
		public SetVisibilityCommand get(AbstractInstance instanceModel, Visibility newVisibility) {
			return new SetVisibilityCommand(instanceModel, newVisibility);
		}
	}

	private final AbstractInstance instanceModel;

	private Map<AbstractInstance, Visibility> stateMemento;

	private Visibility newVisibility;

	public SetVisibilityCommand(AbstractInstance instanceModel, Visibility newVisibility) {
		this.instanceModel = instanceModel;
		this.newVisibility = newVisibility;
	}

	public void execute() {
		stateMemento = Maps.newHashMap();
		if (instanceModel instanceof NodeInstance) {
			for (EdgeInstance edge : ((NodeInstance) instanceModel).getIncomingEdges()) {
				handleEdge(edge, edge.getSource());
			}
			for (EdgeInstance edge : ((NodeInstance) instanceModel).getOutgoingEdges()) {
				handleEdge(edge, edge.getTarget());
			}
		}
		memorizeAndSetVisibility(instanceModel, newVisibility);
	}

	protected void handleEdge(EdgeInstance edge, AbstractInstance otherEnd) {
		if (newVisibility == Visibility.HIDDEN || otherEnd.getVisibility() != Visibility.HIDDEN)
			memorizeAndSetVisibility(edge, newVisibility);
	}

	protected void memorizeAndSetVisibility(AbstractInstance instance, Visibility newVisibility) {
		if (newVisibility != instance.getVisibility()) {
			Visibility oldVisibility = instance.getVisibility();
			if (oldVisibility == Visibility.TRANSPARENT)
				oldVisibility = Visibility.HIDDEN;
			stateMemento.put(instance, oldVisibility);
			instance.setVisibility(newVisibility);
		}
	}

	public void undo() {
		for (Map.Entry<AbstractInstance, Visibility> entry : stateMemento.entrySet())
			entry.getKey().setVisibility(entry.getValue());
	}
}
