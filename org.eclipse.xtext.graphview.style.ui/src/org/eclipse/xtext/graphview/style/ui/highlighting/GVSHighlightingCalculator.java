/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.ui.highlighting;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class GVSHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource != null && resource.getParseResult() != null
				&& resource.getParseResult().getRootNode() != null) {
			for (INode node : resource.getParseResult().getRootNode()
					.getAsTreeIterable()) {
				if (node.getGrammarElement() instanceof CrossReference) {
					CrossReference crossReference = (CrossReference) node
							.getGrammarElement();
					if (crossReference.getType().getClassifier() instanceof EClass) {
						EClass crossRefType = (EClass) crossReference.getType()
								.getClassifier();
						if (GraphViewMappingPackage.Literals.ABSTRACT_MAPPING
								.isSuperTypeOf(crossRefType)) {
							acceptor.addPosition(
									node.getOffset(),
									node.getLength(),
									GVSHighlightingConfiguration.MAPPING_NAME_ID);
						}
					}
				}
			}
		}
	}

}
