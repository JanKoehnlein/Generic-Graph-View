/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Mapping Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference#getReferencedMapping <em>Referenced Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getAbstractMappingReference()
 * @model
 * @generated
 */
public interface AbstractMappingReference extends AbstractExpressionMapping
{
	/**
	 * Returns the value of the '<em><b>Referenced Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Mapping</em>' reference.
	 * @see #setReferencedMapping(AbstractMappingDefinition)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getAbstractMappingReference_ReferencedMapping()
	 * @model
	 * @generated
	 */
	AbstractMappingDefinition getReferencedMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference#getReferencedMapping <em>Referenced Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Mapping</em>' reference.
	 * @see #getReferencedMapping()
	 * @generated
	 */
	void setReferencedMapping(AbstractMappingDefinition value);

} // AbstractMappingReference
