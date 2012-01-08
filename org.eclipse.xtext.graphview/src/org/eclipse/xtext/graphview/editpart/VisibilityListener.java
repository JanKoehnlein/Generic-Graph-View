package org.eclipse.xtext.graphview.editpart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

public class VisibilityListener extends EContentAdapter {

	private IInstanceModelEditPart editPart;

	public void notifyChanged(Notification notification) {
		if (notification.getFeature() == InstancemodelPackage.Literals.ABSTRACT_INSTANCE__VISIBILITY
				&& notification.getEventType() == Notification.SET) {
			AbstractInstance instanceModel = (AbstractInstance) notification
					.getNotifier();
			IInstanceModelEditPart editPart = findEditPart(instanceModel);
			if (editPart != null) {
				if (notification.getOldValue() == Visibility.TRANSPARENT)
					editPart.setTransparent(false);
				if (notification.getNewValue() == Visibility.TRANSPARENT) {
					editPart.setTransparent(true);
				}
			}
			if (instanceModel instanceof EdgeInstance) {
				refreshEditPart(((EdgeInstance) instanceModel).getSource());
				refreshEditPart(((EdgeInstance) instanceModel).getTarget());
			} else {
				refreshEditPart(instanceModel.eContainer());
			}
		}
	}

	private void refreshEditPart(EObject instanceModel) {
		if (instanceModel instanceof AbstractInstance
				&& ((AbstractInstance) instanceModel).getVisibility() != Visibility.HIDDEN) {
			IInstanceModelEditPart editPart = findEditPart(instanceModel);
			if (editPart != null)
				editPart.refresh();
		}
	}

	protected IInstanceModelEditPart findEditPart(EObject instanceModel) {
		return (IInstanceModelEditPart) editPart.getViewer()
				.getEditPartRegistry().get(instanceModel);
	}

	public void register(IInstanceModelEditPart editPart) {
		this.editPart = editPart;
		editPart.getModel().eAdapters().add(this);
	}

	public void deregister(IInstanceModelEditPart editPart) {
		this.editPart = editPart;
		editPart.getModel().eAdapters().remove(this);
	}

	public boolean isAdapterForType(Object type) {
		return type == getClass();
	}
}
