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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl#getSemanticElement <em>Semantic Element</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractInstanceImpl extends EObjectImpl implements AbstractInstance {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInstance> children;

	/**
	 * The default value of the '{@link #getSemanticElement() <em>Semantic Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticElement()
	 * @generated
	 * @ordered
	 */
	protected static final Object SEMANTIC_ELEMENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSemanticElement() <em>Semantic Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticElement()
	 * @generated
	 * @ordered
	 */
	protected Object semanticElement = SEMANTIC_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected AbstractMapping mapping;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancemodelPackage.Literals.ABSTRACT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInstance getParent() {
		if (eContainerFeatureID() != InstancemodelPackage.ABSTRACT_INSTANCE__PARENT) return null;
		return (AbstractInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AbstractInstance newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, InstancemodelPackage.ABSTRACT_INSTANCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AbstractInstance newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != InstancemodelPackage.ABSTRACT_INSTANCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN, AbstractInstance.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancemodelPackage.ABSTRACT_INSTANCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInstance> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<AbstractInstance>(AbstractInstance.class, this, InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN, InstancemodelPackage.ABSTRACT_INSTANCE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSemanticElement() {
		return semanticElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticElement(Object newSemanticElement) {
		Object oldSemanticElement = semanticElement;
		semanticElement = newSemanticElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancemodelPackage.ABSTRACT_INSTANCE__SEMANTIC_ELEMENT, oldSemanticElement, semanticElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapping getMapping() {
		if (mapping != null && mapping.eIsProxy()) {
			InternalEObject oldMapping = (InternalEObject)mapping;
			mapping = (AbstractMapping)eResolveProxy(oldMapping);
			if (mapping != oldMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancemodelPackage.ABSTRACT_INSTANCE__MAPPING, oldMapping, mapping));
			}
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapping basicGetMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(AbstractMapping newMapping) {
		AbstractMapping oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancemodelPackage.ABSTRACT_INSTANCE__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancemodelPackage.ABSTRACT_INSTANCE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AbstractInstance)otherEnd, msgs);
			case InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				return basicSetParent(null, msgs);
			case InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				return eInternalContainer().eInverseRemove(this, InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN, AbstractInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				return getParent();
			case InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN:
				return getChildren();
			case InstancemodelPackage.ABSTRACT_INSTANCE__SEMANTIC_ELEMENT:
				return getSemanticElement();
			case InstancemodelPackage.ABSTRACT_INSTANCE__MAPPING:
				if (resolve) return getMapping();
				return basicGetMapping();
			case InstancemodelPackage.ABSTRACT_INSTANCE__VISIBILITY:
				return getVisibility();
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
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				setParent((AbstractInstance)newValue);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends AbstractInstance>)newValue);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__SEMANTIC_ELEMENT:
				setSemanticElement(newValue);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__MAPPING:
				setMapping((AbstractMapping)newValue);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__VISIBILITY:
				setVisibility((Visibility)newValue);
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
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				setParent((AbstractInstance)null);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN:
				getChildren().clear();
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__SEMANTIC_ELEMENT:
				setSemanticElement(SEMANTIC_ELEMENT_EDEFAULT);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__MAPPING:
				setMapping((AbstractMapping)null);
				return;
			case InstancemodelPackage.ABSTRACT_INSTANCE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
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
			case InstancemodelPackage.ABSTRACT_INSTANCE__PARENT:
				return getParent() != null;
			case InstancemodelPackage.ABSTRACT_INSTANCE__CHILDREN:
				return children != null && !children.isEmpty();
			case InstancemodelPackage.ABSTRACT_INSTANCE__SEMANTIC_ELEMENT:
				return SEMANTIC_ELEMENT_EDEFAULT == null ? semanticElement != null : !SEMANTIC_ELEMENT_EDEFAULT.equals(semanticElement);
			case InstancemodelPackage.ABSTRACT_INSTANCE__MAPPING:
				return mapping != null;
			case InstancemodelPackage.ABSTRACT_INSTANCE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
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
		result.append(" (semanticElement: ");
		result.append(semanticElement);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //AbstractInstanceImpl
