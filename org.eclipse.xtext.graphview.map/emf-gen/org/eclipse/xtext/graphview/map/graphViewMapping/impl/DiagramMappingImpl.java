/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.graphview.map.graphViewMapping.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl#getTypeGuard <em>Type Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramMappingImpl extends AbstractMappingDefinitionImpl implements DiagramMapping
{
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getTypeGuard() <em>Type Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGuard()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference typeGuard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramMappingImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GraphViewMappingPackage.Literals.DIAGRAM_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<Import>(Import.class, this, GraphViewMappingPackage.DIAGRAM_MAPPING__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getTypeGuard()
	{
		return typeGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeGuard(JvmTypeReference newTypeGuard, NotificationChain msgs)
	{
		JvmTypeReference oldTypeGuard = typeGuard;
		typeGuard = newTypeGuard;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD, oldTypeGuard, newTypeGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGuard(JvmTypeReference newTypeGuard)
	{
		if (newTypeGuard != typeGuard)
		{
			NotificationChain msgs = null;
			if (typeGuard != null)
				msgs = ((InternalEObject)typeGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD, null, msgs);
			if (newTypeGuard != null)
				msgs = ((InternalEObject)newTypeGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD, null, msgs);
			msgs = basicSetTypeGuard(newTypeGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD, newTypeGuard, newTypeGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GraphViewMappingPackage.DIAGRAM_MAPPING__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD:
				return basicSetTypeGuard(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case GraphViewMappingPackage.DIAGRAM_MAPPING__IMPORTS:
				return getImports();
			case GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD:
				return getTypeGuard();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GraphViewMappingPackage.DIAGRAM_MAPPING__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD:
				setTypeGuard((JvmTypeReference)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case GraphViewMappingPackage.DIAGRAM_MAPPING__IMPORTS:
				getImports().clear();
				return;
			case GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD:
				setTypeGuard((JvmTypeReference)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case GraphViewMappingPackage.DIAGRAM_MAPPING__IMPORTS:
				return imports != null && !imports.isEmpty();
			case GraphViewMappingPackage.DIAGRAM_MAPPING__TYPE_GUARD:
				return typeGuard != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramMappingImpl
