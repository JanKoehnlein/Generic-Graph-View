package org.eclipse.xtext.graphview.view.config;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.editor.findrefs.IReferenceFinder;
import org.eclipse.xtext.ui.editor.findrefs.ReferenceQueryData;
import org.eclipse.xtext.util.IAcceptor;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SelectDiagramConfigurationDialog extends Dialog {

	@Inject
	private IResourceDescriptions index;

	@Inject
	private IReferenceFinder referenceFinder;

	private Combo mappingCombo;
	private Combo styleCombo;

	private List<IEObjectDescription> sortedMappings;

	private List<IEObjectDescription> sortedStyles;

	private IEObjectDescription selectedMapping;

	private IEObjectDescription selectedStyleSheet;;

	public SelectDiagramConfigurationDialog() {
		super(Display.getDefault().getActiveShell());
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Label mappingLabel = new Label(composite, SWT.NONE);
		mappingLabel.setText("Select mapping model:");
		mappingLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false));
		mappingCombo = new Combo(composite, SWT.DROP_DOWN);
		mappingCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));
		Label styleLabel = new Label(composite, SWT.NONE);
		styleLabel.setText("Select style sheet:");
		styleLabel
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		styleCombo = new Combo(composite, SWT.DROP_DOWN);
		styleCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));
		mappingCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				int index = mappingCombo.getSelectionIndex();
				IEObjectDescription selectedMapping = (index == -1) ? null
						: sortedMappings.get(index);
				populateStyleCombo(selectedMapping);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		populateMappingCombo();
		applyDialogFont(composite);
		return composite;
	}

	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Select diagram configuration");
	}

	@Override
	protected void okPressed() {
		selectedMapping = getSelection(mappingCombo, sortedMappings);
		selectedStyleSheet = getSelection(styleCombo, sortedStyles);
		super.okPressed();
	}

	protected IEObjectDescription getSelection(Combo combo,
			List<IEObjectDescription> data) {
		int selectionIndex = combo.getSelectionIndex();
		if (selectionIndex != -1)
			return data.get(selectionIndex);
		else if (data.isEmpty())
			return null;
		else
			return data.get(0);
	}

	protected void populateMappingCombo() {
		mappingCombo.removeAll();
		Iterable<IEObjectDescription> mappings = index
				.getExportedObjectsByType(GraphViewMappingPackage.Literals.DIAGRAM_MAPPING);
		sortedMappings = sortByName(mappings);
		for (IEObjectDescription mapping : sortedMappings) {
			mappingCombo.add(mapping.getName().toString());
		}
		if (!sortedMappings.isEmpty()) {
			mappingCombo.select(0);
			populateStyleCombo(sortedMappings.get(0));
		}
	}

	protected void populateStyleCombo(IEObjectDescription selectedMapping) {
		styleCombo.removeAll();
		if (selectedMapping == null)
			return;
		final List<IReferenceDescription> references = Lists.newArrayList();
		IAcceptor<IReferenceDescription> referenceAcceptor = new IAcceptor<IReferenceDescription>() {
			public void accept(IReferenceDescription reference) {
				references.add(reference);
			}
		};
		referenceFinder.findIndexedReferences(new ReferenceQueryData(
				selectedMapping.getEObjectURI()), referenceAcceptor, null);
		Set<IEObjectDescription> styleSheets = Sets.newHashSet();
		for (IReferenceDescription reference : references) {
			IResourceDescription referringResource = index
					.getResourceDescription(reference.getSourceEObjectUri()
							.trimFragment());
			for (IEObjectDescription styleSheet : referringResource
					.getExportedObjectsByType(GraphViewStylePackage.Literals.STYLE_SHEET)) {
				styleSheets.add(styleSheet);
			}
		}
		sortedStyles = sortByName(styleSheets);
		for (IEObjectDescription styleSheet : sortedStyles)
			styleCombo.add(styleSheet.getName().toString());
		if (!sortedStyles.isEmpty())
			styleCombo.select(0);
	}

	protected List<IEObjectDescription> sortByName(
			Iterable<IEObjectDescription> iterable) {
		List<IEObjectDescription> list = Lists.newArrayList(iterable);
		Collections.sort(list, new Comparator<IEObjectDescription>() {
			public int compare(IEObjectDescription o1, IEObjectDescription o2) {
				return o1.getName().toString()
						.compareTo(o2.getName().toString());
			}
		});
		return list;
	}

	public IEObjectDescription getSelectedMapping() {
		return selectedMapping;
	}

	public IEObjectDescription getSelectedStyleSheet() {
		return selectedStyleSheet;
	}

}