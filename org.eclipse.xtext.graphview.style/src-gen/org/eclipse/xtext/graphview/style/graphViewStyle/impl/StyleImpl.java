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

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;

import org.eclipse.xtext.xbase.XAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style
{
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
   * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaClass()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference javaClass;

  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected EList<XAssignment> settings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleImpl()
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
    return GraphViewStylePackage.Literals.STYLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getJavaClass()
  {
    return javaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJavaClass(JvmParameterizedTypeReference newJavaClass, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldJavaClass = javaClass;
    javaClass = newJavaClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__JAVA_CLASS, oldJavaClass, newJavaClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaClass(JvmParameterizedTypeReference newJavaClass)
  {
    if (newJavaClass != javaClass)
    {
      NotificationChain msgs = null;
      if (javaClass != null)
        msgs = ((InternalEObject)javaClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewStylePackage.STYLE__JAVA_CLASS, null, msgs);
      if (newJavaClass != null)
        msgs = ((InternalEObject)newJavaClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewStylePackage.STYLE__JAVA_CLASS, null, msgs);
      msgs = basicSetJavaClass(newJavaClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__JAVA_CLASS, newJavaClass, newJavaClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XAssignment> getSettings()
  {
    if (settings == null)
    {
      settings = new EObjectContainmentEList<XAssignment>(XAssignment.class, this, GraphViewStylePackage.STYLE__SETTINGS);
    }
    return settings;
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
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        return basicSetJavaClass(null, msgs);
      case GraphViewStylePackage.STYLE__SETTINGS:
        return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
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
      case GraphViewStylePackage.STYLE__NAME:
        return getName();
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        return getJavaClass();
      case GraphViewStylePackage.STYLE__SETTINGS:
        return getSettings();
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
      case GraphViewStylePackage.STYLE__NAME:
        setName((String)newValue);
        return;
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        setJavaClass((JvmParameterizedTypeReference)newValue);
        return;
      case GraphViewStylePackage.STYLE__SETTINGS:
        getSettings().clear();
        getSettings().addAll((Collection<? extends XAssignment>)newValue);
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
      case GraphViewStylePackage.STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        setJavaClass((JvmParameterizedTypeReference)null);
        return;
      case GraphViewStylePackage.STYLE__SETTINGS:
        getSettings().clear();
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
      case GraphViewStylePackage.STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        return javaClass != null;
      case GraphViewStylePackage.STYLE__SETTINGS:
        return settings != null && !settings.isEmpty();
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

} //StyleImpl
