/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.ui.hyperlink;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtext.graphview.lib.literals.ColorLiteral;

public class ColorHyperlink implements IHyperlink {

	private static final Logger LOG = Logger.getLogger(ColorHyperlink.class);

	private IRegion region;
	private final IDocument document;

	public ColorHyperlink(IRegion region, IDocument document) {
		this.region = region;
		this.document = document;
	}

	public IRegion getHyperlinkRegion() {
		return region;
	}

	public String getTypeLabel() {
		return "Color Chooser";
	}

	public String getHyperlinkText() {
		return "Choose a Color";
	}

	public void open() {
		try {
			String currentColorString = document.get(region.getOffset(), region.getLength());
			ColorLiteral currentColorLiteral = new ColorLiteral(currentColorString);
			RGB currentRGB = new RGB(currentColorLiteral.getRed(), currentColorLiteral.getGreen(), currentColorLiteral.getBlue());
			ColorDialog colorDialog = new ColorDialog(Display.getDefault().getActiveShell());
			colorDialog.setRGB(currentRGB);
			RGB newRGB = colorDialog.open();
			if (newRGB != null) {
				ColorLiteral newColorLiteral = new ColorLiteral(newRGB.red, newRGB.green, newRGB.blue);
				ReplaceEdit replaceEdit = new ReplaceEdit(region.getOffset(), region.getLength(), newColorLiteral.toString());
				replaceEdit.apply(document);
			}
		} catch (Exception e) {
			LOG.error("Error opening color hyperling: ", e);
		}
	}

}
