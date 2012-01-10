/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Mapping Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingReferenceImpl#getReferencedMapping <em>Referenced Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractMappingReferenceImpl extends AbstractExpressionMappingImpl implements AbstractMappingReference
{
	/**
	 * The cached value of the '{@link #getReferencedMapping() <em>Referenced Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMapping()
	 * @generated
	 * @ordered
	 */
	protected AbstractMappingDefinition referencedMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMappingReferenceImpl()
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
		return GraphViewMappingPackage.Literals.ABSTRACT_MAPPING_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingDefinition getReferencedMapping()
	{
		if (referencedMapping != null && referencedMapping.eIsProxy())
		{
			InternalEObject oldReferencedMapping = (InternalEObject)referencedMapping;
			referencedMapping = (AbstractMappingDefinition)eResolveProxy(oldReferencedMapping);
			if (referencedMapping != oldReferencedMapping)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING, oldReferencedMapping, referencedMapping));
			}
		}
		return referencedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingDefinition basicGetReferencedMapping()
	{
		return referencedMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMapping(AbstractMappingDefinition newReferencedMapping)
	{
		AbstractMappingDefinition oldReferencedMapping = referencedMapping;
		referencedMapping = newReferencedMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING, oldReferencedMapping, referencedMapping));
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING:
				if (resolve) return getReferencedMapping();
				return basicGetReferencedMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING:
				setReferencedMapping((AbstractMappingDefinition)newValue);
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING:
				setReferencedMapping((AbstractMappingDefinition)null);
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING:
				return referencedMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractMappingReferenceImpl
