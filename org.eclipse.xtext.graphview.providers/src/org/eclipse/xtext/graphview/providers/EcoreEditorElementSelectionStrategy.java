package org.eclipse.xtext.graphview.providers;

import java.util.Collections;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.graphview.view.GraphView;
import org.eclipse.xtext.graphview.view.selection.StructuredElementSelectionStrategy;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.Strings;

public class EcoreEditorElementSelectionStrategy extends StructuredElementSelectionStrategy {

	@Override
	public boolean isStrategyFor(IEditorPart editor) {
		return Strings.equal("org.eclipse.emf.ecore.presentation.EcoreEditor",
				editor.getClass().getCanonicalName());
	}

	@Override
	public ISelection viewSelectionChanged(IEditorPart editor, Object selectedElement, GraphView graphView) {
		PolymorphicDispatcher.createForSingleTarget("setSelectionToViewer", editor).invoke(Collections.singleton(selectedElement));
		return editor.getEditorSite().getSelectionProvider().getSelection();
	}
}
