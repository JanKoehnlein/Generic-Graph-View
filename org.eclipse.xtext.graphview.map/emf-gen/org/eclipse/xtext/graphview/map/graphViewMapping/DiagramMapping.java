/**
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImportSection <em>Import Section</em>}</li>
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
	 * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Section</em>' containment reference.
	 * @see #setImportSection(XImportSection)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getDiagramMapping_ImportSection()
	 * @model containment="true"
	 * @generated
	 */
	XImportSection getImportSection();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImportSection <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Section</em>' containment reference.
	 * @see #getImportSection()
	 * @generated
	 */
	void setImportSection(XImportSection value);

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
