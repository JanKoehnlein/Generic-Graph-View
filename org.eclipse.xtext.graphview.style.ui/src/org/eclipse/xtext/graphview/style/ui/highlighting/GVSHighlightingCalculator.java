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

	@Override
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
