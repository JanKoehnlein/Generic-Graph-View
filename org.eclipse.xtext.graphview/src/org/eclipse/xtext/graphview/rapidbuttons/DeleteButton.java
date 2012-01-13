/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class DeleteButton extends AbstractRapidButton {

	@Inject
	private IWorkbench workbench;

	@Override
	protected Image createImage() {
		return workbench.getSharedImages().getImage(ISharedImages.IMG_ETOOL_DELETE);
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getEditPolicy().getHost()) {
			@Override
			protected String getCommandName() {
				return "Hide element";
			}

			@SuppressWarnings("unchecked")
			@Override
			protected Request createSourceRequest() {
				GroupRequest deleteRequest = new GroupRequest();
				deleteRequest.setType(RequestConstants.REQ_DELETE);
				List<EditPart> editParts = Lists.newArrayList();
				editParts.add(getHostEditPart());
				editParts.addAll(getHostEditPart().getSourceConnections());
				editParts.addAll(getHostEditPart().getTargetConnections());
				deleteRequest.setEditParts(editParts);
				return deleteRequest;
			}
		};
	}
}
