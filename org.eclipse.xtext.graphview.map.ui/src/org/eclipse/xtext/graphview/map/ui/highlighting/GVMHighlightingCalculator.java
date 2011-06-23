package org.eclipse.xtext.graphview.map.ui.highlighting;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.Strings;

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
				if (eObject instanceof AbstractMappingDefinition
						&& !Strings.isEmpty(((AbstractMappingDefinition) eObject)
								.getName())) {
					ITextRegion nameRegion = locationInFileProvider
							.getSignificantTextRegion(eObject);
					acceptor.addPosition(nameRegion.getOffset(),
							nameRegion.getLength(),
							GVMHighlightingConfiguration.MAPPING_NAME_ID);
				}
				if(eObject instanceof AbstractMappingReference) {
					for(INode crossRefNode : NodeModelUtils.findNodesForFeature(eObject, GraphViewMappingPackage.Literals.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING)) {
						acceptor.addPosition(crossRefNode.getOffset(),
								crossRefNode.getLength(),
								GVMHighlightingConfiguration.MAPPING_NAME_ID);
					}
				}
			}
		}
	}

}
