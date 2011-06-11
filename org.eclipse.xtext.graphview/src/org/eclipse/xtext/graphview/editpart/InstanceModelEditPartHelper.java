package org.eclipse.xtext.graphview.editpart;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.style.StyleProvider;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

public class InstanceModelEditPartHelper {

	@Inject
	private StyleProvider styleProvider;

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

	public Style getStyle() {
		return styleProvider.getStyle(getMapping());
	}

	private static final Logger LOG = Logger
			.getLogger(InstanceModelEditPartHelper.class);

	protected IFigure createFigure() {
		IFigure figure = null;
		Style style = getStyle();
		if(style != null) 
			figure = createShape(style);
		return (figure == null) ? host.createDefaultFigure() : figure;
	}

	public IFigure createShape(Style style) {
		JvmParameterizedTypeReference javaClass = style.getJavaClass();
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
	
	public void style(IFigure figure) {
		styleProvider.style(figure, getStyle());
	}

}
