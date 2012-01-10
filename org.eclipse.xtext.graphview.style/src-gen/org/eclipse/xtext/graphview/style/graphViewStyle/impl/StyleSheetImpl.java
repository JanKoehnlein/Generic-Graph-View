/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;

import org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage;
import org.eclipse.xtext.graphview.style.graphViewStyle.Import;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl#getDiagramMapping <em>Diagram Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleSheetImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleSheetImpl extends MinimalEObjectImpl.Container implements StyleSheet
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDiagramMapping() <em>Diagram Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiagramMapping()
   * @generated
   * @ordered
   */
  protected DiagramMapping diagramMapping;

  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected EList<Style> styles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleSheetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraphViewStylePackage.Literals.STYLE_SHEET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, GraphViewStylePackage.STYLE_SHEET__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE_SHEET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramMapping getDiagramMapping()
  {
    if (diagramMapping != null && diagramMapping.eIsProxy())
    {
      InternalEObject oldDiagramMapping = (InternalEObject)diagramMapping;
      diagramMapping = (DiagramMapping)eResolveProxy(oldDiagramMapping);
      if (diagramMapping != oldDiagramMapping)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphViewStylePackage.STYLE_SHEET__DIAGRAM_MAPPING, oldDiagramMapping, diagramMapping));
      }
    }
    return diagramMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramMapping basicGetDiagramMapping()
  {
    return diagramMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiagramMapping(DiagramMapping newDiagramMapping)
  {
    DiagramMapping oldDiagramMapping = diagramMapping;
    diagramMapping = newDiagramMapping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE_SHEET__DIAGRAM_MAPPING, oldDiagramMapping, diagramMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Style> getStyles()
  {
    if (styles == null)
    {
      styles = new EObjectContainmentEList<Style>(Style.class, this, GraphViewStylePackage.STYLE_SHEET__STYLES);
    }
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE_SHEET__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GraphViewStylePackage.STYLE_SHEET__STYLES:
        return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE_SHEET__IMPORTS:
        return getImports();
      case GraphViewStylePackage.STYLE_SHEET__NAME:
        return getName();
      case GraphViewStylePackage.STYLE_SHEET__DIAGRAM_MAPPING:
        if (resolve) return getDiagramMapping();
        return basicGetDiagramMapping();
      case GraphViewStylePackage.STYLE_SHEET__STYLES:
        return getStyles();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE_SHEET__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case GraphViewStylePackage.STYLE_SHEET__NAME:
        setName((String)newValue);
        return;
      case GraphViewStylePackage.STYLE_SHEET__DIAGRAM_MAPPING:
        setDiagramMapping((DiagramMapping)newValue);
        return;
      case GraphViewStylePackage.STYLE_SHEET__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends Style>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE_SHEET__IMPORTS:
        getImports().clear();
        return;
      case GraphViewStylePackage.STYLE_SHEET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraphViewStylePackage.STYLE_SHEET__DIAGRAM_MAPPING:
        setDiagramMapping((DiagramMapping)null);
        return;
      case GraphViewStylePackage.STYLE_SHEET__STYLES:
        getStyles().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE_SHEET__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GraphViewStylePackage.STYLE_SHEET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraphViewStylePackage.STYLE_SHEET__DIAGRAM_MAPPING:
        return diagramMapping != null;
      case GraphViewStylePackage.STYLE_SHEET__STYLES:
        return styles != null && !styles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StyleSheetImpl
