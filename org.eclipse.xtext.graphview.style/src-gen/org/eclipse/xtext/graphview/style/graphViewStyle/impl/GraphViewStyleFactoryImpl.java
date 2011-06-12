/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.graphview.style.graphViewStyle.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphViewStyleFactoryImpl extends EFactoryImpl implements GraphViewStyleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraphViewStyleFactory init()
  {
    try
    {
      GraphViewStyleFactory theGraphViewStyleFactory = (GraphViewStyleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/graphview/style/GraphViewStyle"); 
      if (theGraphViewStyleFactory != null)
      {
        return theGraphViewStyleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GraphViewStyleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphViewStyleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GraphViewStylePackage.STYLE_SHEET: return createStyleSheet();
      case GraphViewStylePackage.IMPORT: return createImport();
      case GraphViewStylePackage.STYLE: return createStyle();
      case GraphViewStylePackage.XCOLOR_LITERAL: return createXColorLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleSheet createStyleSheet()
  {
    StyleSheetImpl styleSheet = new StyleSheetImpl();
    return styleSheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyle()
  {
    StyleImpl style = new StyleImpl();
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XColorLiteral createXColorLiteral()
  {
    XColorLiteralImpl xColorLiteral = new XColorLiteralImpl();
    return xColorLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphViewStylePackage getGraphViewStylePackage()
  {
    return (GraphViewStylePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GraphViewStylePackage getPackage()
  {
    return GraphViewStylePackage.eINSTANCE;
  }

} //GraphViewStyleFactoryImpl
