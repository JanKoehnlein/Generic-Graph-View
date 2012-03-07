/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.view.config;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.editor.findrefs.IReferenceFinder;
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

	@Inject
	private DefaultDiagramConfigurationProvider diagramConfigurationProvider;

	private Combo mappingCombo;
	private Combo styleCombo;

	private List<IEObjectDescription> sortedMappings;

	private List<IEObjectDescription> sortedStyles;

	private IEObjectDescription nullSelection;

	public SelectDiagramConfigurationDialog() {
		super(Display.getDefault().getActiveShell());
		nullSelection = EObjectDescription.create("<none>", null);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Label mappingLabel = new Label(composite, SWT.NONE);
		mappingLabel.setText("Select mapping model:");
		mappingLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		mappingCombo = new Combo(composite, SWT.DROP_DOWN);
		mappingCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		Label styleLabel = new Label(composite, SWT.NONE);
		styleLabel.setText("Select style sheet:");
		styleLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		styleCombo = new Combo(composite, SWT.DROP_DOWN);
		styleCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		mappingCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						int index = mappingCombo.getSelectionIndex();
						IEObjectDescription selectedMapping = (index == -1) ? null : sortedMappings.get(index);
						populateStyleCombo(selectedMapping);
					}
				});
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
		diagramConfigurationProvider.setModels(getSelection(mappingCombo, sortedMappings), getSelection(styleCombo, sortedStyles));
		super.okPressed();
	}

	protected IEObjectDescription getSelection(Combo combo, List<IEObjectDescription> data) {
		int selectionIndex = combo.getSelectionIndex();
		IEObjectDescription selection = null;
		if (selectionIndex != -1)
			selection = data.get(selectionIndex);
		else
			selection = data.get(0);
		return (selection == nullSelection) ? null : selection;
	}

	protected void populateMappingCombo() {
		mappingCombo.removeAll();
		Iterable<IEObjectDescription> mappings = index.getExportedObjectsByType(GraphViewMappingPackage.Literals.DIAGRAM_MAPPING);
		sortedMappings = sortByName(mappings);
		sortedMappings.add(nullSelection);
		for (IEObjectDescription mapping : sortedMappings) {
			mappingCombo.add(mapping.getName().toString());
		}
		if (!sortedMappings.isEmpty()) {
			int selectedIndex = findIndex(sortedMappings, diagramConfigurationProvider.getDiagramMapping());
			mappingCombo.select(selectedIndex);
			populateStyleCombo(sortedMappings.get(selectedIndex));
		}
	}

	protected void populateStyleCombo(IEObjectDescription selectedMapping) {
		styleCombo.removeAll();
		if (selectedMapping == null)
			return;
		Set<IEObjectDescription> styleSheets = Sets.newHashSet();
		if (selectedMapping != nullSelection) {
			final List<IReferenceDescription> references = Lists.newArrayList();
			IAcceptor<IReferenceDescription> referenceAcceptor = new IAcceptor<IReferenceDescription>() {
				public void accept(IReferenceDescription reference) {
					references.add(reference);
				}
			};
			referenceFinder.findAllReferences(Collections.singleton(selectedMapping.getEObjectURI()), null, referenceAcceptor, new NullProgressMonitor());
			for (IReferenceDescription reference : references) {
				IResourceDescription referringResource = index.getResourceDescription(reference.getSourceEObjectUri().trimFragment());
				for (IEObjectDescription styleSheet : referringResource
						.getExportedObjectsByType(GraphViewStylePackage.Literals.STYLE_SHEET)) {
					styleSheets.add(styleSheet);
				}
			}
		}
		sortedStyles = sortByName(styleSheets);
		sortedStyles.add(nullSelection);
		for (IEObjectDescription styleSheet : sortedStyles)
			styleCombo.add(styleSheet.getName().toString());
		if (!sortedStyles.isEmpty())
			styleCombo.select(findIndex(sortedStyles, diagramConfigurationProvider.getStyleSheet()));
	}

	protected int findIndex(List<IEObjectDescription> descriptions, EObject element) {
		if (element != null) {
			URI uri = EcoreUtil.getURI(element);
			if (uri != null) {
				for (int i = 0; i < descriptions.size(); ++i) {
					IEObjectDescription description = descriptions.get(i);
					if (description != nullSelection && uri.equals(description.getEObjectURI())) {
						return i;
					}
				}
			}
			return 0;
		}
		return descriptions.size() - 1;
	}

	protected List<IEObjectDescription> sortByName(Iterable<IEObjectDescription> iterable) {
		List<IEObjectDescription> list = Lists.newArrayList(iterable);
		Collections.sort(list, new Comparator<IEObjectDescription>() {
			public int compare(IEObjectDescription o1, IEObjectDescription o2) {
				return o1.getName().toString().compareTo(o2.getName().toString());
			}
		});
		return list;
	}

}