/**
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.graphview.map.graphViewMapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphViewMappingFactoryImpl extends EFactoryImpl implements GraphViewMappingFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphViewMappingFactory init()
	{
		try
		{
			GraphViewMappingFactory theGraphViewMappingFactory = (GraphViewMappingFactory)EPackage.Registry.INSTANCE.getEFactory(GraphViewMappingPackage.eNS_URI);
			if (theGraphViewMappingFactory != null)
			{
				return theGraphViewMappingFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphViewMappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphViewMappingFactoryImpl()
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
			case GraphViewMappingPackage.ABSTRACT_MAPPING_DEFINITION: return createAbstractMappingDefinition();
			case GraphViewMappingPackage.ABSTRACT_EXPRESSION_MAPPING: return createAbstractExpressionMapping();
			case GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE: return createAbstractMappingReference();
			case GraphViewMappingPackage.DIAGRAM_MAPPING: return createDiagramMapping();
			case GraphViewMappingPackage.NODE_MAPPING: return createNodeMapping();
			case GraphViewMappingPackage.LABEL_MAPPING: return createLabelMapping();
			case GraphViewMappingPackage.EDGE_MAPPING: return createEdgeMapping();
			case GraphViewMappingPackage.EDGE_END_MAPPING: return createEdgeEndMapping();
			case GraphViewMappingPackage.MAPPING_CALL: return createMappingCall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingDefinition createAbstractMappingDefinition()
	{
		AbstractMappingDefinitionImpl abstractMappingDefinition = new AbstractMappingDefinitionImpl();
		return abstractMappingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpressionMapping createAbstractExpressionMapping()
	{
		AbstractExpressionMappingImpl abstractExpressionMapping = new AbstractExpressionMappingImpl();
		return abstractExpressionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingReference createAbstractMappingReference()
	{
		AbstractMappingReferenceImpl abstractMappingReference = new AbstractMappingReferenceImpl();
		return abstractMappingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramMapping createDiagramMapping()
	{
		DiagramMappingImpl diagramMapping = new DiagramMappingImpl();
		return diagramMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping createNodeMapping()
	{
		NodeMappingImpl nodeMapping = new NodeMappingImpl();
		return nodeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelMapping createLabelMapping()
	{
		LabelMappingImpl labelMapping = new LabelMappingImpl();
		return labelMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeMapping createEdgeMapping()
	{
		EdgeMappingImpl edgeMapping = new EdgeMappingImpl();
		return edgeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeEndMapping createEdgeEndMapping()
	{
		EdgeEndMappingImpl edgeEndMapping = new EdgeEndMappingImpl();
		return edgeEndMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingCall createMappingCall()
	{
		MappingCallImpl mappingCall = new MappingCallImpl();
		return mappingCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphViewMappingPackage getGraphViewMappingPackage()
	{
		return (GraphViewMappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphViewMappingPackage getPackage()
	{
		return GraphViewMappingPackage.eINSTANCE;
	}

} //GraphViewMappingFactoryImpl
