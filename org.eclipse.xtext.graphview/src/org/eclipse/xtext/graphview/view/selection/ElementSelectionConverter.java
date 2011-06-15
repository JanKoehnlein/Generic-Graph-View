package org.eclipse.xtext.graphview.view.selection;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.graphview.view.GraphView;

import com.google.common.collect.Lists;
import com.google.inject.Binding;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;

@Singleton
public class ElementSelectionConverter implements ISelectionListener {

	private static final Logger LOG = Logger
			.getLogger(ElementSelectionConverter.class);

	@Inject
	private GraphView graphView;

	@Inject
	private IWorkbench workbench;

	private IEditorInput editorInput;

	private String editorId;

	private List<IElementSelectionStrategy> contributions;

	private ISelection mySelection = null;

	private IElementSelectionStrategy defaultElementSelectionStrategy = new IElementSelectionStrategy() {

		@Override
		public boolean isStrategyFor(IEditorPart editor) {
			return true;
		}

		@Override
		public ISelection setSelection(IEditorPart editor, Object selectedElement) {
			return new StructuredSelection(selectedElement);
		}

		@Override
		public Object getSelectedElement(IEditorPart editor, ISelection selection) {
			if (selection instanceof IStructuredSelection)
				return ((IStructuredSelection) selection).getFirstElement();
			else
				return null;
		}
	};

	@Inject
	protected void initialize(Injector injector) {
		contributions = Lists.newArrayList();
		List<Binding<IElementSelectionStrategy>> bindings = injector
				.findBindingsByType(TypeLiteral
						.get(IElementSelectionStrategy.class));
		for (Binding<IElementSelectionStrategy> binding : bindings) {
			contributions.add(injector.getInstance(binding.getKey()));
		}
		contributions.add(defaultElementSelectionStrategy);
	}

	protected IElementSelectionStrategy findElementSelectionStrategy(
			IEditorPart editor) {
		for (IElementSelectionStrategy elementSelectionStrategy : contributions) {
			if (elementSelectionStrategy.isStrategyFor(editor))
				return elementSelectionStrategy;
		}
		return null;
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		try {
			if (selection == mySelection) {
				return;
			}
			if (part instanceof IEditorPart && !selection.isEmpty()) {
				IEditorPart editor = (IEditorPart) part;
				IElementSelectionStrategy elementSelectionStrategy = findElementSelectionStrategy((IEditorPart) editor);
				Object semanticElement = elementSelectionStrategy
						.getSelectedElement(editor, selection);
				if (semanticElement != null) {
					if (graphView.setViewerContents(semanticElement, false)) {
						this.editorInput = ((IEditorPart) part)
								.getEditorInput();
						this.editorId = ((IEditorPart) part).getEditorSite()
								.getId();
					}
				}
			}
		} catch (Exception e) {
			LOG.error("Error getting selected element", e);
		} finally {
			mySelection = null;
		}
	}

	public void select(Object selectedElement) {
		try {
			IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow()
					.getActivePage();
			IEditorPart editor = activePage.openEditor(editorInput, editorId);
			if (editor != null) {
				activePage.bringToTop(editor);
				IElementSelectionStrategy elementSelectionStrategy = findElementSelectionStrategy((IEditorPart) editor);
				ISelection selection = elementSelectionStrategy
						.setSelection(editor, selectedElement);
				if (selection != null) {
					ISelectionProvider selectionProvider = editor
							.getEditorSite().getSelectionProvider();
					mySelection = selection;
					selectionProvider.setSelection(selection);
				}
			}
		} catch (Exception e) {
			LOG.error("Error selecting element", e);
		}
	}

}
