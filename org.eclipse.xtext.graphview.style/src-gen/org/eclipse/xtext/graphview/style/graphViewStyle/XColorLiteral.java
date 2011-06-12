/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XColor Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getXColorLiteral()
 * @model
 * @generated
 */
public interface XColorLiteral extends XExpression
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getXColorLiteral_Color()
   * @model
   * @generated
   */
  String getColor();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(String value);

} // XColorLiteral
