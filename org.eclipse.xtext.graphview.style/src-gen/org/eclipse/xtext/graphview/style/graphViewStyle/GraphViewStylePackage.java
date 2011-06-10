/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStyleFactory
 * @model kind="package"
 * @generated
 */
public interface GraphViewStylePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "graphViewStyle";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/graphview/style/GraphViewStyle";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "graphViewStyle";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraphViewStylePackage eINSTANCE = org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl#getStyleSheet()
   * @generated
   */
  int STYLE_SHEET = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SHEET__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SHEET__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SHEET__STYLES = 2;

  /**
   * The number of structural features of the '<em>Style Sheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_SHEET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.ImportImpl
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl#getStyle()
   * @generated
   */
  int STYLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Java Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__JAVA_CLASS = 1;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__SETTINGS = 2;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet <em>Style Sheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Sheet</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet
   * @generated
   */
  EClass getStyleSheet();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getName()
   * @see #getStyleSheet()
   * @generated
   */
  EAttribute getStyleSheet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getImports()
   * @see #getStyleSheet()
   * @generated
   */
  EReference getStyleSheet_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Styles</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getStyles()
   * @see #getStyleSheet()
   * @generated
   */
  EReference getStyleSheet_Styles();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.Style#getName()
   * @see #getStyle()
   * @generated
   */
  EAttribute getStyle_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getJavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Java Class</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.Style#getJavaClass()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_JavaClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.style.graphViewStyle.Style#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Settings</em>'.
   * @see org.eclipse.xtext.graphview.style.graphViewStyle.Style#getSettings()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_Settings();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GraphViewStyleFactory getGraphViewStyleFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl
     * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl#getStyleSheet()
     * @generated
     */
    EClass STYLE_SHEET = eINSTANCE.getStyleSheet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_SHEET__NAME = eINSTANCE.getStyleSheet_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_SHEET__IMPORTS = eINSTANCE.getStyleSheet_Imports();

    /**
     * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE_SHEET__STYLES = eINSTANCE.getStyleSheet_Styles();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.ImportImpl
     * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl
     * @see org.eclipse.xtext.graphview.style.graphViewStyle.impl.GraphViewStylePackageImpl#getStyle()
     * @generated
     */
    EClass STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE__NAME = eINSTANCE.getStyle_Name();

    /**
     * The meta object literal for the '<em><b>Java Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__JAVA_CLASS = eINSTANCE.getStyle_JavaClass();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__SETTINGS = eINSTANCE.getStyle_Settings();

  }

} //GraphViewStylePackage
