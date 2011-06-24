/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;

import com.google.inject.Inject;

public class ExportToFileAction extends Action {

	@Inject
	private GraphView graphView;

	public static final int PADDING = 10;

	public ExportToFileAction() {
		setText("Export to file");
		setDescription("Export this diagram to an image file");
		setToolTipText("Export this diagram to an image file");
	}

	@Inject
	public void setImages(IWorkbench workbench) {
		ISharedImages sharedImages = workbench.getSharedImages();
		setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT_DISABLED));
	}
	
	@Override
	public void run() {
		IFigure contents = ((GraphicalEditPart) graphView.getGraphicalViewer().getRootEditPart()).getFigure();
		while(contents instanceof Viewport)
			contents = (IFigure) contents.getChildren().get(0);
		if (contents != null) {
			FileDialog fileDialog = new FileDialog(graphView.getSite().getShell(), SWT.SAVE);
			fileDialog.setFilterExtensions(new String[] { "*.png" });
			fileDialog.setText("Choose diagram file");
			String fileName = fileDialog.open();
			Dimension preferredSize = contents.getPreferredSize();
			Image image = new Image(Display.getDefault(), preferredSize.width + 2 * PADDING, preferredSize.height + 2
					* PADDING);
			GC gc = new GC(image);
			SWTGraphics graphics = new SWTGraphics(gc);
			graphics.translate(PADDING, PADDING);
			graphics.translate(contents.getBounds().getLocation().getNegated());
			contents.paint(graphics);
			ImageData imageData = image.getImageData();
			ImageLoader imageLoader = new ImageLoader();
			imageLoader.data = new ImageData[] { imageData };
			imageLoader.save(fileName, SWT.IMAGE_PNG);
		}
	}
}