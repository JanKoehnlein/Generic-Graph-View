package org.eclipse.xtext.graphview.map.ui.highlighting;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.util.ITextRegion;

import com.google.inject.Inject;

public class GVMHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Inject
	private ILocationInFileProvider locationInFileProvider;

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource != null && !resource.getContents().isEmpty()) {
			for (TreeIterator<EObject> i = resource.getAllContents(); i
					.hasNext();) {
				EObject eObject = i.next();
				if (eObject instanceof AbstractMapping) {
					ITextRegion nameRegion = locationInFileProvider
							.getSignificantTextRegion(eObject);
					acceptor.addPosition(nameRegion.getOffset(),
							nameRegion.getLength(),
							GVMHighlightingConfiguration.MAPPING_NAME_ID);
				}
			}
		}
	}

}
