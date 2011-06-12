/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage
 * @generated
 */
public interface GraphViewStyleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraphViewStyleFactory eINSTANCE = org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStyleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Style Sheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style Sheet</em>'.
   * @generated
   */
  StyleSheet createStyleSheet();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>XColor Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XColor Literal</em>'.
   * @generated
   */
  XColorLiteral createXColorLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GraphViewStylePackage getGraphViewStylePackage();

} //GraphViewStyleFactory
