package org.eclipse.xtext.graphview.editpart;

import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.shape.LabelShape;

public class LabelEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
	}

	public IFigure createDefaultFigure() {
		return new LabelShape();
	}

	@Override
	protected void refreshVisuals() {
		((LabelShape) getFigure()).setText(calculateText());
		super.refreshVisuals();
	}

	protected String calculateText() {
		Object semanticElement = helper.getSemanticElement();
		if (semanticElement == null)
			return "<null>";
		if (semanticElement instanceof CharSequence) {
			return semanticElement.toString();
		}
		try {
			Method method = semanticElement.getClass().getMethod("getName",
					new Class<?>[0]);
			if (method.isAccessible())
				return method.invoke(semanticElement, new Object[0]).toString();
		} catch (Exception e) {
			// ignore
		}
		return semanticElement.toString();
	}
}
