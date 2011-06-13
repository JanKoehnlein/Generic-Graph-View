/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.common.types.TypesPackage;

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
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingFactory
 * @model kind="package"
 * @generated
 */
public interface GraphViewMappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphViewMapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xtext/graphview/map/GraphViewMapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphViewMapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphViewMappingPackage eINSTANCE = org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl <em>Abstract Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMapping()
	 * @generated
	 */
	int ABSTRACT_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING__MAPPINGS = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING__NAME = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_FEATURE_COUNT = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl <em>Diagram Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getDiagramMapping()
	 * @generated
	 */
	int DIAGRAM_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__MAPPINGS = ABSTRACT_MAPPING__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__NAME = ABSTRACT_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__IMPORTS = ABSTRACT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__TYPE_GUARD = ABSTRACT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 2;

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
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl <em>Abstract Expression Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractExpressionMapping()
	 * @generated
	 */
	int ABSTRACT_EXPRESSION_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__MAPPINGS = ABSTRACT_MAPPING__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__NAME = ABSTRACT_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__MULTI = ABSTRACT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__EXPRESSION = ABSTRACT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Expression Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getNodeMapping()
	 * @generated
	 */
	int NODE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__MAPPINGS = ABSTRACT_EXPRESSION_MAPPING__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__NAME = ABSTRACT_EXPRESSION_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__MULTI = ABSTRACT_EXPRESSION_MAPPING__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__EXPRESSION = ABSTRACT_EXPRESSION_MAPPING__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_FEATURE_COUNT = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl <em>Label Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getLabelMapping()
	 * @generated
	 */
	int LABEL_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__MAPPINGS = ABSTRACT_EXPRESSION_MAPPING__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__NAME = ABSTRACT_EXPRESSION_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__MULTI = ABSTRACT_EXPRESSION_MAPPING__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__EXPRESSION = ABSTRACT_EXPRESSION_MAPPING__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING_FEATURE_COUNT = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl <em>Edge Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeMapping()
	 * @generated
	 */
	int EDGE_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__MAPPINGS = ABSTRACT_EXPRESSION_MAPPING__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__NAME = ABSTRACT_EXPRESSION_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__MULTI = ABSTRACT_EXPRESSION_MAPPING__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__EXPRESSION = ABSTRACT_EXPRESSION_MAPPING__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__SOURCE_MAPPING = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__TARGET_MAPPING = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING_FEATURE_COUNT = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl <em>Edge End Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeEndMapping()
	 * @generated
	 */
	int EDGE_END_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__MAPPINGS = ABSTRACT_EXPRESSION_MAPPING__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__NAME = ABSTRACT_EXPRESSION_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__MULTI = ABSTRACT_EXPRESSION_MAPPING__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__EXPRESSION = ABSTRACT_EXPRESSION_MAPPING__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__MAPPING = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge End Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING_FEATURE_COUNT = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping <em>Abstract Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping
	 * @generated
	 */
	EClass getAbstractMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getMappings()
	 * @see #getAbstractMapping()
	 * @generated
	 */
	EReference getAbstractMapping_Mappings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getName()
	 * @see #getAbstractMapping()
	 * @generated
	 */
	EAttribute getAbstractMapping_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping <em>Diagram Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping
	 * @generated
	 */
	EClass getDiagramMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImports()
	 * @see #getDiagramMapping()
	 * @generated
	 */
	EReference getDiagramMapping_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getTypeGuard <em>Type Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Guard</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getTypeGuard()
	 * @see #getDiagramMapping()
	 * @generated
	 */
	EReference getDiagramMapping_TypeGuard();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping <em>Abstract Expression Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Expression Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping
	 * @generated
	 */
	EClass getAbstractExpressionMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#isMulti()
	 * @see #getAbstractExpressionMapping()
	 * @generated
	 */
	EAttribute getAbstractExpressionMapping_Multi();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#getExpression()
	 * @see #getAbstractExpressionMapping()
	 * @generated
	 */
	EReference getAbstractExpressionMapping_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping <em>Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping
	 * @generated
	 */
	EClass getNodeMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping <em>Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping
	 * @generated
	 */
	EClass getLabelMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping <em>Edge Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping
	 * @generated
	 */
	EClass getEdgeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getSourceMapping <em>Source Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getSourceMapping()
	 * @see #getEdgeMapping()
	 * @generated
	 */
	EReference getEdgeMapping_SourceMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getTargetMapping <em>Target Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getTargetMapping()
	 * @see #getEdgeMapping()
	 * @generated
	 */
	EReference getEdgeMapping_TargetMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping <em>Edge End Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge End Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping
	 * @generated
	 */
	EClass getEdgeEndMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#getMapping()
	 * @see #getEdgeEndMapping()
	 * @generated
	 */
	EReference getEdgeEndMapping_Mapping();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphViewMappingFactory getGraphViewMappingFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl <em>Abstract Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMapping()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING = eINSTANCE.getAbstractMapping();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAPPING__MAPPINGS = eINSTANCE.getAbstractMapping_Mappings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MAPPING__NAME = eINSTANCE.getAbstractMapping_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl <em>Diagram Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getDiagramMapping()
		 * @generated
		 */
		EClass DIAGRAM_MAPPING = eINSTANCE.getDiagramMapping();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MAPPING__IMPORTS = eINSTANCE.getDiagramMapping_Imports();

		/**
		 * The meta object literal for the '<em><b>Type Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MAPPING__TYPE_GUARD = eINSTANCE.getDiagramMapping_TypeGuard();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getImport()
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
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl <em>Abstract Expression Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractExpressionMapping()
		 * @generated
		 */
		EClass ABSTRACT_EXPRESSION_MAPPING = eINSTANCE.getAbstractExpressionMapping();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXPRESSION_MAPPING__MULTI = eINSTANCE.getAbstractExpressionMapping_Multi();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EXPRESSION_MAPPING__EXPRESSION = eINSTANCE.getAbstractExpressionMapping_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getNodeMapping()
		 * @generated
		 */
		EClass NODE_MAPPING = eINSTANCE.getNodeMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl <em>Label Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getLabelMapping()
		 * @generated
		 */
		EClass LABEL_MAPPING = eINSTANCE.getLabelMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl <em>Edge Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeMapping()
		 * @generated
		 */
		EClass EDGE_MAPPING = eINSTANCE.getEdgeMapping();

		/**
		 * The meta object literal for the '<em><b>Source Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_MAPPING__SOURCE_MAPPING = eINSTANCE.getEdgeMapping_SourceMapping();

		/**
		 * The meta object literal for the '<em><b>Target Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_MAPPING__TARGET_MAPPING = eINSTANCE.getEdgeMapping_TargetMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl <em>Edge End Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeEndMapping()
		 * @generated
		 */
		EClass EDGE_END_MAPPING = eINSTANCE.getEdgeEndMapping();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_END_MAPPING__MAPPING = eINSTANCE.getEdgeEndMapping_Mapping();

	}

} //GraphViewMappingPackage
