/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.graphview.map.graphViewMapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage
 * @generated
 */
public class GraphViewMappingAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphViewMappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphViewMappingAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = GraphViewMappingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphViewMappingSwitch<Adapter> modelSwitch =
		new GraphViewMappingSwitch<Adapter>()
		{
			@Override
			public Adapter caseAbstractMapping(AbstractMapping object)
			{
				return createAbstractMappingAdapter();
			}
			@Override
			public Adapter caseAbstractMappingDefinition(AbstractMappingDefinition object)
			{
				return createAbstractMappingDefinitionAdapter();
			}
			@Override
			public Adapter caseAbstractExpressionMapping(AbstractExpressionMapping object)
			{
				return createAbstractExpressionMappingAdapter();
			}
			@Override
			public Adapter caseAbstractMappingReference(AbstractMappingReference object)
			{
				return createAbstractMappingReferenceAdapter();
			}
			@Override
			public Adapter caseImport(Import object)
			{
				return createImportAdapter();
			}
			@Override
			public Adapter caseDiagramMapping(DiagramMapping object)
			{
				return createDiagramMappingAdapter();
			}
			@Override
			public Adapter caseNodeMapping(NodeMapping object)
			{
				return createNodeMappingAdapter();
			}
			@Override
			public Adapter caseLabelMapping(LabelMapping object)
			{
				return createLabelMappingAdapter();
			}
			@Override
			public Adapter caseEdgeMapping(EdgeMapping object)
			{
				return createEdgeMappingAdapter();
			}
			@Override
			public Adapter caseEdgeEndMapping(EdgeEndMapping object)
			{
				return createEdgeEndMappingAdapter();
			}
			@Override
			public Adapter caseMappingCall(MappingCall object)
			{
				return createMappingCallAdapter();
			}
			@Override
			public Adapter caseJvmIdentifiableElement(JvmIdentifiableElement object)
			{
				return createJvmIdentifiableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping <em>Abstract Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping
	 * @generated
	 */
	public Adapter createAbstractMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition <em>Abstract Mapping Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition
	 * @generated
	 */
	public Adapter createAbstractMappingDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping <em>Abstract Expression Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping
	 * @generated
	 */
	public Adapter createAbstractExpressionMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference <em>Abstract Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference
	 * @generated
	 */
	public Adapter createAbstractMappingReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping <em>Diagram Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping
	 * @generated
	 */
	public Adapter createDiagramMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping <em>Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping
	 * @generated
	 */
	public Adapter createNodeMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping <em>Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping
	 * @generated
	 */
	public Adapter createLabelMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping <em>Edge Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping
	 * @generated
	 */
	public Adapter createEdgeMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping <em>Edge End Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping
	 * @generated
	 */
	public Adapter createEdgeEndMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall <em>Mapping Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall
	 * @generated
	 */
	public Adapter createMappingCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.common.types.JvmIdentifiableElement <em>Jvm Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.common.types.JvmIdentifiableElement
	 * @generated
	 */
	public Adapter createJvmIdentifiableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //GraphViewMappingAdapterFactory
