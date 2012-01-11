/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.style.StyleProvider;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.view.selection.ElementSelectionConverter;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class InstanceModelEditPartHelper {

	@Inject
	private StyleProvider styleProvider;

	@Inject
	private ElementSelectionConverter selectionConverter;

	private AbstractInstance instanceModel;

	private IInstanceModelEditPart host;

	public void initialize(IInstanceModelEditPart host) {
		this.host = host;
		if (!(host.getModel() instanceof AbstractInstance))
			throw new RuntimeException("Model must be an AbstractInstance");
		this.instanceModel = (AbstractInstance) host.getModel();
	}

	public Object getSemanticElement() {
		return getInstanceModel().getSemanticElement();
	}

	public AbstractMapping getMapping() {
		return getInstanceModel().getMapping();
	}

	public AbstractInstance getInstanceModel() {
		return instanceModel;
	}

	public <T extends AbstractInstance> List<T> filterVisible(List<T> instances) {
		List<T> visibleChildren = Lists.newArrayList();
		for (T child : instances) {
			if (child.getVisibility() != Visibility.HIDDEN
					&& !(child instanceof DiagramInstance && ((DiagramInstance) child)
							.isOpenNewDiagram()))
				visibleChildren.add(child);
		}
		return visibleChildren;
	}

	public List<AbstractInstance> getVisibleModelChildren() {
		return filterVisible(getInstanceModel().getChildren());
	}

	public Collection<Style> getStyles() {
		return styleProvider.getStyles(getMapping());
	}

	private static final Logger LOG = Logger
			.getLogger(InstanceModelEditPartHelper.class);

	public IFigure createFigure() {
		IFigure figure = null;
		for (Style style : getStyles()) {
			if (style.getJavaClass() != null) {
				figure = createShape(style);
			}
		}
		return (figure == null) ? host.createDefaultFigure() : figure;
	}

	public IFigure createShape(Style style) {
		JvmTypeReference javaClass = style.getJavaClass();
		if (javaClass != null) {
			try {
				Class<?> figure = Class.forName(javaClass.getType()
						.getIdentifier());
				return (IFigure) figure.newInstance();
			} catch (Exception e) {
				LOG.error(
						"Error instantiating figure "
								+ Strings.notNull(style.getJavaClass()
										.getSimpleName()), e);
				LOG.error("Using default figure instead.");
			}
		}
		return null;
	}

	protected GraphViewEditDomain getEditDomain() {
		return (GraphViewEditDomain) host.getViewer().getEditDomain();
	}

	public void style(IFigure figure) {
		styleProvider.setClassLoader(getEditDomain().getClassLoader());
		for (Style style : getStyles())
			styleProvider.style(figure, getSemanticElement(), style);
	}

	public void performRequest(Request request) {
		if (RequestConstants.REQ_OPEN.equals(request.getType()))
			selectionConverter.select(getSemanticElement());
	}

}
