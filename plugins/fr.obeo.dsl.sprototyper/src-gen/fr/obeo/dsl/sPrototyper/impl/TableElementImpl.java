/**
 */
package fr.obeo.dsl.sPrototyper.impl;

import fr.obeo.dsl.sPrototyper.SPExpression;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.TableElement;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.TableElementImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.TableElementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.TableElementImpl#isCanCreate <em>Can Create</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.impl.TableElementImpl#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableElementImpl extends MinimalEObjectImpl.Container implements TableElement
{
  /**
   * The default value of the '{@link #getEClass() <em>EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEClass()
   * @generated
   * @ordered
   */
  protected static final String ECLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEClass() <em>EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEClass()
   * @generated
   * @ordered
   */
  protected String eClass = ECLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected SPExpression expression;

  /**
   * The default value of the '{@link #isCanCreate() <em>Can Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCanCreate()
   * @generated
   * @ordered
   */
  protected static final boolean CAN_CREATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCanCreate() <em>Can Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCanCreate()
   * @generated
   * @ordered
   */
  protected boolean canCreate = CAN_CREATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubElements()
   * @generated
   * @ordered
   */
  protected EList<TableElement> subElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableElementImpl()
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
    return SPrototyperPackage.Literals.TABLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEClass()
  {
    return eClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEClass(String newEClass)
  {
    String oldEClass = eClass;
    eClass = newEClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.TABLE_ELEMENT__ECLASS, oldEClass, eClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(SPExpression newExpression, NotificationChain msgs)
  {
    SPExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPrototyperPackage.TABLE_ELEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(SPExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.TABLE_ELEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPrototyperPackage.TABLE_ELEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.TABLE_ELEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCanCreate()
  {
    return canCreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCanCreate(boolean newCanCreate)
  {
    boolean oldCanCreate = canCreate;
    canCreate = newCanCreate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPrototyperPackage.TABLE_ELEMENT__CAN_CREATE, oldCanCreate, canCreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableElement> getSubElements()
  {
    if (subElements == null)
    {
      subElements = new EObjectContainmentEList<TableElement>(TableElement.class, this, SPrototyperPackage.TABLE_ELEMENT__SUB_ELEMENTS);
    }
    return subElements;
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
      case SPrototyperPackage.TABLE_ELEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SPrototyperPackage.TABLE_ELEMENT__SUB_ELEMENTS:
        return ((InternalEList<?>)getSubElements()).basicRemove(otherEnd, msgs);
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
      case SPrototyperPackage.TABLE_ELEMENT__ECLASS:
        return getEClass();
      case SPrototyperPackage.TABLE_ELEMENT__EXPRESSION:
        return getExpression();
      case SPrototyperPackage.TABLE_ELEMENT__CAN_CREATE:
        return isCanCreate();
      case SPrototyperPackage.TABLE_ELEMENT__SUB_ELEMENTS:
        return getSubElements();
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
      case SPrototyperPackage.TABLE_ELEMENT__ECLASS:
        setEClass((String)newValue);
        return;
      case SPrototyperPackage.TABLE_ELEMENT__EXPRESSION:
        setExpression((SPExpression)newValue);
        return;
      case SPrototyperPackage.TABLE_ELEMENT__CAN_CREATE:
        setCanCreate((Boolean)newValue);
        return;
      case SPrototyperPackage.TABLE_ELEMENT__SUB_ELEMENTS:
        getSubElements().clear();
        getSubElements().addAll((Collection<? extends TableElement>)newValue);
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
      case SPrototyperPackage.TABLE_ELEMENT__ECLASS:
        setEClass(ECLASS_EDEFAULT);
        return;
      case SPrototyperPackage.TABLE_ELEMENT__EXPRESSION:
        setExpression((SPExpression)null);
        return;
      case SPrototyperPackage.TABLE_ELEMENT__CAN_CREATE:
        setCanCreate(CAN_CREATE_EDEFAULT);
        return;
      case SPrototyperPackage.TABLE_ELEMENT__SUB_ELEMENTS:
        getSubElements().clear();
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
      case SPrototyperPackage.TABLE_ELEMENT__ECLASS:
        return ECLASS_EDEFAULT == null ? eClass != null : !ECLASS_EDEFAULT.equals(eClass);
      case SPrototyperPackage.TABLE_ELEMENT__EXPRESSION:
        return expression != null;
      case SPrototyperPackage.TABLE_ELEMENT__CAN_CREATE:
        return canCreate != CAN_CREATE_EDEFAULT;
      case SPrototyperPackage.TABLE_ELEMENT__SUB_ELEMENTS:
        return subElements != null && !subElements.isEmpty();
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
    result.append(" (eClass: ");
    result.append(eClass);
    result.append(", canCreate: ");
    result.append(canCreate);
    result.append(')');
    return result.toString();
  }

} //TableElementImpl
