/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl#getSourceMapping <em>Source Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl#getTargetMapping <em>Target Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeMappingImpl extends AbstractExpressionMappingImpl implements EdgeMapping {
	/**
	 * The cached value of the '{@link #getSourceMapping() <em>Source Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMapping()
	 * @generated
	 * @ordered
	 */
	protected EdgeEndMapping sourceMapping;

	/**
	 * The cached value of the '{@link #getTargetMapping() <em>Target Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMapping()
	 * @generated
	 * @ordered
	 */
	protected EdgeEndMapping targetMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphViewMappingPackage.Literals.EDGE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeEndMapping getSourceMapping() {
		return sourceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMapping(EdgeEndMapping newSourceMapping, NotificationChain msgs) {
		EdgeEndMapping oldSourceMapping = sourceMapping;
		sourceMapping = newSourceMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING, oldSourceMapping, newSourceMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMapping(EdgeEndMapping newSourceMapping) {
		if (newSourceMapping != sourceMapping) {
			NotificationChain msgs = null;
			if (sourceMapping != null)
				msgs = ((InternalEObject)sourceMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING, null, msgs);
			if (newSourceMapping != null)
				msgs = ((InternalEObject)newSourceMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING, null, msgs);
			msgs = basicSetSourceMapping(newSourceMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING, newSourceMapping, newSourceMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeEndMapping getTargetMapping() {
		return targetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetMapping(EdgeEndMapping newTargetMapping, NotificationChain msgs) {
		EdgeEndMapping oldTargetMapping = targetMapping;
		targetMapping = newTargetMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING, oldTargetMapping, newTargetMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMapping(EdgeEndMapping newTargetMapping) {
		if (newTargetMapping != targetMapping) {
			NotificationChain msgs = null;
			if (targetMapping != null)
				msgs = ((InternalEObject)targetMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING, null, msgs);
			if (newTargetMapping != null)
				msgs = ((InternalEObject)newTargetMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING, null, msgs);
			msgs = basicSetTargetMapping(newTargetMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING, newTargetMapping, newTargetMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING:
				return basicSetSourceMapping(null, msgs);
			case GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING:
				return basicSetTargetMapping(null, msgs);
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
			case GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING:
				return getSourceMapping();
			case GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING:
				return getTargetMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING:
				setSourceMapping((EdgeEndMapping)newValue);
				return;
			case GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING:
				setTargetMapping((EdgeEndMapping)newValue);
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
			case GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING:
				setSourceMapping((EdgeEndMapping)null);
				return;
			case GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING:
				setTargetMapping((EdgeEndMapping)null);
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
			case GraphViewMappingPackage.EDGE_MAPPING__SOURCE_MAPPING:
				return sourceMapping != null;
			case GraphViewMappingPackage.EDGE_MAPPING__TARGET_MAPPING:
				return targetMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeMappingImpl
