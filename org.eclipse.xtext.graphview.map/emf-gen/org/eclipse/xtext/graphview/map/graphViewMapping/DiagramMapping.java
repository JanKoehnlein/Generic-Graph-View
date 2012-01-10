/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getTypeGuard <em>Type Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getDiagramMapping()
 * @model
 * @generated
 */
public interface DiagramMapping extends AbstractMappingDefinition
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.graphview.map.graphViewMapping.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getDiagramMapping_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Type Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Guard</em>' containment reference.
	 * @see #setTypeGuard(JvmTypeReference)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getDiagramMapping_TypeGuard()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getTypeGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getTypeGuard <em>Type Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Guard</em>' containment reference.
	 * @see #getTypeGuard()
	 * @generated
	 */
	void setTypeGuard(JvmTypeReference value);

} // DiagramMapping
