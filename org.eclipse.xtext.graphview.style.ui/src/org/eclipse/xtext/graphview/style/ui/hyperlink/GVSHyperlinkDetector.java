/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.ui.hyperlink;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.DefaultHyperlinkDetector;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class GVSHyperlinkDetector extends DefaultHyperlinkDetector {

	@Override
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, final IRegion region, boolean canShowMultipleHyperlinks) {
		IHyperlink[] detectHyperlinks = super.detectHyperlinks(textViewer, region, canShowMultipleHyperlinks);
		if (!canShowMultipleHyperlinks && detectHyperlinks != null && detectHyperlinks.length != 0) {
			return detectHyperlinks;
		}
		final IXtextDocument xtextDocument = (IXtextDocument) textViewer.getDocument();
		IHyperlink additionalHyperlink = xtextDocument.readOnly(new IUnitOfWork<IHyperlink, XtextResource>() {
			public IHyperlink exec(XtextResource state) throws Exception {
				return createColorHyperLink(xtextDocument, state, region.getOffset());
			}
		});
		if (additionalHyperlink == null) {
			return detectHyperlinks;
		} else {
			if (detectHyperlinks == null) {
				return new IHyperlink[] { additionalHyperlink };
			} else {
				IHyperlink[] hyperlinks = new IHyperlink[detectHyperlinks.length + 1];
				System.arraycopy(detectHyperlinks, 0, hyperlinks, 1, detectHyperlinks.length);
				hyperlinks[0] = additionalHyperlink;
				return hyperlinks;
			}
		}
	}

	public IHyperlink createColorHyperLink(IXtextDocument document, XtextResource resource, int offset) {
		if (resource.getParseResult() != null && resource.getParseResult().getRootNode() != null) {
			ILeafNode leafNode = NodeModelUtils.findLeafNodeAtOffset(resource.getParseResult().getRootNode(), offset);
			EObject element = NodeModelUtils.findActualSemanticObjectFor(leafNode);
			if (element instanceof XColorLiteral) {
				return new ColorHyperlink(new Region(leafNode.getOffset(), leafNode.getLength()), document);
			}
		}
		return null;
	}
}
