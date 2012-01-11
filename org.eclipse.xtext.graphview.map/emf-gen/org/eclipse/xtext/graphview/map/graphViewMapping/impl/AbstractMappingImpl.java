/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.impl.JvmIdentifiableElementImpl;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl#getUnlessCondition <em>Unless Condition</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl#isHidden <em>Hidden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMappingImpl extends JvmIdentifiableElementImpl implements AbstractMapping
{
	/**
	 * The cached value of the '{@link #getUnlessCondition() <em>Unless Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlessCondition()
	 * @generated
	 * @ordered
	 */
	protected XExpression unlessCondition;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMappingImpl()
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
		return GraphViewMappingPackage.Literals.ABSTRACT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getUnlessCondition()
	{
		return unlessCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlessCondition(XExpression newUnlessCondition, NotificationChain msgs)
	{
		XExpression oldUnlessCondition = unlessCondition;
		unlessCondition = newUnlessCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION, oldUnlessCondition, newUnlessCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlessCondition(XExpression newUnlessCondition)
	{
		if (newUnlessCondition != unlessCondition)
		{
			NotificationChain msgs = null;
			if (unlessCondition != null)
				msgs = ((InternalEObject)unlessCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION, null, msgs);
			if (newUnlessCondition != null)
				msgs = ((InternalEObject)newUnlessCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION, null, msgs);
			msgs = basicSetUnlessCondition(newUnlessCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION, newUnlessCondition, newUnlessCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden()
	{
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden)
	{
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphViewMappingPackage.ABSTRACT_MAPPING__HIDDEN, oldHidden, hidden));
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION:
				return basicSetUnlessCondition(null, msgs);
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION:
				return getUnlessCondition();
			case GraphViewMappingPackage.ABSTRACT_MAPPING__HIDDEN:
				return isHidden();
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION:
				setUnlessCondition((XExpression)newValue);
				return;
			case GraphViewMappingPackage.ABSTRACT_MAPPING__HIDDEN:
				setHidden((Boolean)newValue);
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION:
				setUnlessCondition((XExpression)null);
				return;
			case GraphViewMappingPackage.ABSTRACT_MAPPING__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING__UNLESS_CONDITION:
				return unlessCondition != null;
			case GraphViewMappingPackage.ABSTRACT_MAPPING__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hidden: ");
		result.append(hidden);
		result.append(')');
		return result.toString();
	}

} //AbstractMappingImpl
