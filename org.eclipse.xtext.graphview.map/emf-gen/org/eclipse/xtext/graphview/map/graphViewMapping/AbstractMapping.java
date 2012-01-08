/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getUnlessCondition <em>Unless Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getAbstractMapping()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMapping extends JvmIdentifiableElement {

	/**
	 * Returns the value of the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unless Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unless Condition</em>' containment reference.
	 * @see #setUnlessCondition(XExpression)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getAbstractMapping_UnlessCondition()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getUnlessCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getUnlessCondition <em>Unless Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unless Condition</em>' containment reference.
	 * @see #getUnlessCondition()
	 * @generated
	 */
	void setUnlessCondition(XExpression value);

} // AbstractMapping
