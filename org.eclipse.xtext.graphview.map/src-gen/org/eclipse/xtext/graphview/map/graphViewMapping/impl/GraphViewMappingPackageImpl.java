/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingFactory;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.graphview.map.graphViewMapping.Import;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphViewMappingPackageImpl extends EPackageImpl implements GraphViewMappingPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractExpressionMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelMappingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GraphViewMappingPackageImpl()
  {
    super(eNS_URI, GraphViewMappingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GraphViewMappingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GraphViewMappingPackage init()
  {
    if (isInited) return (GraphViewMappingPackage)EPackage.Registry.INSTANCE.getEPackage(GraphViewMappingPackage.eNS_URI);

    // Obtain or create and register package
    GraphViewMappingPackageImpl theGraphViewMappingPackage = (GraphViewMappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphViewMappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphViewMappingPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGraphViewMappingPackage.createPackageContents();

    // Initialize created meta-data
    theGraphViewMappingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGraphViewMappingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GraphViewMappingPackage.eNS_URI, theGraphViewMappingPackage);
    return theGraphViewMappingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagramMapping()
  {
    return diagramMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagramMapping_Imports()
  {
    return (EReference)diagramMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramMapping_Name()
  {
    return (EAttribute)diagramMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagramMapping_TypeGuard()
  {
    return (EReference)diagramMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagramMapping_Mappings()
  {
    return (EReference)diagramMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractExpressionMapping()
  {
    return abstractExpressionMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractExpressionMapping_Name()
  {
    return (EAttribute)abstractExpressionMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractExpressionMapping_Multi()
  {
    return (EAttribute)abstractExpressionMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractExpressionMapping_Expression()
  {
    return (EReference)abstractExpressionMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeMapping()
  {
    return nodeMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeMapping_Contents()
  {
    return (EReference)nodeMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelMapping()
  {
    return labelMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphViewMappingFactory getGraphViewMappingFactory()
  {
    return (GraphViewMappingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    diagramMappingEClass = createEClass(DIAGRAM_MAPPING);
    createEReference(diagramMappingEClass, DIAGRAM_MAPPING__IMPORTS);
    createEAttribute(diagramMappingEClass, DIAGRAM_MAPPING__NAME);
    createEReference(diagramMappingEClass, DIAGRAM_MAPPING__TYPE_GUARD);
    createEReference(diagramMappingEClass, DIAGRAM_MAPPING__MAPPINGS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    abstractExpressionMappingEClass = createEClass(ABSTRACT_EXPRESSION_MAPPING);
    createEAttribute(abstractExpressionMappingEClass, ABSTRACT_EXPRESSION_MAPPING__NAME);
    createEAttribute(abstractExpressionMappingEClass, ABSTRACT_EXPRESSION_MAPPING__MULTI);
    createEReference(abstractExpressionMappingEClass, ABSTRACT_EXPRESSION_MAPPING__EXPRESSION);

    nodeMappingEClass = createEClass(NODE_MAPPING);
    createEReference(nodeMappingEClass, NODE_MAPPING__CONTENTS);

    labelMappingEClass = createEClass(LABEL_MAPPING);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    diagramMappingEClass.getESuperTypes().add(theTypesPackage.getJvmIdentifiableElement());
    abstractExpressionMappingEClass.getESuperTypes().add(theTypesPackage.getJvmIdentifiableElement());
    nodeMappingEClass.getESuperTypes().add(this.getAbstractExpressionMapping());
    labelMappingEClass.getESuperTypes().add(this.getAbstractExpressionMapping());

    // Initialize classes and features; add operations and parameters
    initEClass(diagramMappingEClass, DiagramMapping.class, "DiagramMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagramMapping_Imports(), this.getImport(), null, "imports", null, 0, -1, DiagramMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiagramMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagramMapping_TypeGuard(), theTypesPackage.getJvmParameterizedTypeReference(), null, "typeGuard", null, 0, 1, DiagramMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagramMapping_Mappings(), this.getAbstractExpressionMapping(), null, "mappings", null, 0, -1, DiagramMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractExpressionMappingEClass, AbstractExpressionMapping.class, "AbstractExpressionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractExpressionMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractExpressionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractExpressionMapping_Multi(), ecorePackage.getEBoolean(), "multi", null, 0, 1, AbstractExpressionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractExpressionMapping_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, AbstractExpressionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeMappingEClass, NodeMapping.class, "NodeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeMapping_Contents(), this.getAbstractExpressionMapping(), null, "contents", null, 0, -1, NodeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelMappingEClass, LabelMapping.class, "LabelMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GraphViewMappingPackageImpl
