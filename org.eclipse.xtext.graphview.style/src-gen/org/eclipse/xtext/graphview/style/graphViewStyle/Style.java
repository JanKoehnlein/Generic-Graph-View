/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.xbase.XAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Java Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Class</em>' containment reference.
   * @see #setJavaClass(JvmParameterizedTypeReference)
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyle_JavaClass()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getJavaClass();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getJavaClass <em>Java Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Class</em>' containment reference.
   * @see #getJavaClass()
   * @generated
   */
  void setJavaClass(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference list.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyle_Settings()
   * @model containment="true"
   * @generated
   */
  EList<XAssignment> getSettings();

} // Style
