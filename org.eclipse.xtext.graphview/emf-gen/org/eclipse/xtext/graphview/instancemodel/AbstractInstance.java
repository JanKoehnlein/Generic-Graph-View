/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getSemanticElement <em>Semantic Element</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getAbstractInstance()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractInstance)
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getAbstractInstance_Parent()
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	AbstractInstance getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractInstance value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getAbstractInstance_Children()
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AbstractInstance> getChildren();

	/**
	 * Returns the value of the '<em><b>Semantic Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Element</em>' attribute.
	 * @see #setSemanticElement(Object)
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getAbstractInstance_SemanticElement()
	 * @model
	 * @generated
	 */
	Object getSemanticElement();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getSemanticElement <em>Semantic Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Element</em>' attribute.
	 * @see #getSemanticElement()
	 * @generated
	 */
	void setSemanticElement(Object value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(AbstractMapping)
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getAbstractInstance_Mapping()
	 * @model
	 * @generated
	 */
	AbstractMapping getMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(AbstractMapping value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.xtext.graphview.instancemodel.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.xtext.graphview.instancemodel.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getAbstractInstance_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.xtext.graphview.instancemodel.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // AbstractInstance
