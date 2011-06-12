/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getNames <em>Names</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getExpression <em>Expression</em>}</li>
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
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyle_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

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
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyle_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // Style
