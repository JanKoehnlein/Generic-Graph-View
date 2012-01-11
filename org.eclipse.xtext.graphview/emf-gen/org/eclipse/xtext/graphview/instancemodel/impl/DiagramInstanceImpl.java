/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.DiagramInstanceImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.DiagramInstanceImpl#isOpenNewDiagram <em>Open New Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramInstanceImpl extends AbstractInstanceImpl implements DiagramInstance {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeInstance> edges;

	/**
	 * The default value of the '{@link #isOpenNewDiagram() <em>Open New Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenNewDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_NEW_DIAGRAM_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOpenNewDiagram() <em>Open New Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenNewDiagram()
	 * @generated
	 * @ordered
	 */
	protected boolean openNewDiagram = OPEN_NEW_DIAGRAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancemodelPackage.Literals.DIAGRAM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdgeInstance> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<EdgeInstance>(EdgeInstance.class, this, InstancemodelPackage.DIAGRAM_INSTANCE__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenNewDiagram() {
		return openNewDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenNewDiagram(boolean newOpenNewDiagram) {
		boolean oldOpenNewDiagram = openNewDiagram;
		openNewDiagram = newOpenNewDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancemodelPackage.DIAGRAM_INSTANCE__OPEN_NEW_DIAGRAM, oldOpenNewDiagram, openNewDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancemodelPackage.DIAGRAM_INSTANCE__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancemodelPackage.DIAGRAM_INSTANCE__EDGES:
				return getEdges();
			case InstancemodelPackage.DIAGRAM_INSTANCE__OPEN_NEW_DIAGRAM:
				return isOpenNewDiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancemodelPackage.DIAGRAM_INSTANCE__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends EdgeInstance>)newValue);
				return;
			case InstancemodelPackage.DIAGRAM_INSTANCE__OPEN_NEW_DIAGRAM:
				setOpenNewDiagram((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstancemodelPackage.DIAGRAM_INSTANCE__EDGES:
				getEdges().clear();
				return;
			case InstancemodelPackage.DIAGRAM_INSTANCE__OPEN_NEW_DIAGRAM:
				setOpenNewDiagram(OPEN_NEW_DIAGRAM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancemodelPackage.DIAGRAM_INSTANCE__EDGES:
				return edges != null && !edges.isEmpty();
			case InstancemodelPackage.DIAGRAM_INSTANCE__OPEN_NEW_DIAGRAM:
				return openNewDiagram != OPEN_NEW_DIAGRAM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (openNewDiagram: ");
		result.append(openNewDiagram);
		result.append(')');
		return result.toString();
	}

} //DiagramInstanceImpl
