/**
 */
package fr.obeo.dsl.sPrototyper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getEClass <em>EClass</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#isCanCreate <em>Can Create</em>}</li>
 *   <li>{@link fr.obeo.dsl.sPrototyper.TableElement#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement()
 * @model
 * @generated
 */
public interface TableElement extends EObject
{
  /**
   * Returns the value of the '<em><b>EClass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EClass</em>' attribute.
   * @see #setEClass(String)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_EClass()
   * @model
   * @generated
   */
  String getEClass();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#getEClass <em>EClass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EClass</em>' attribute.
   * @see #getEClass()
   * @generated
   */
  void setEClass(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(SPExpression)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_Expression()
   * @model containment="true"
   * @generated
   */
  SPExpression getExpression();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SPExpression value);

  /**
   * Returns the value of the '<em><b>Can Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can Create</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Can Create</em>' attribute.
   * @see #setCanCreate(boolean)
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_CanCreate()
   * @model
   * @generated
   */
  boolean isCanCreate();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.sPrototyper.TableElement#isCanCreate <em>Can Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Create</em>' attribute.
   * @see #isCanCreate()
   * @generated
   */
  void setCanCreate(boolean value);

  /**
   * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.sPrototyper.TableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Elements</em>' containment reference list.
   * @see fr.obeo.dsl.sPrototyper.SPrototyperPackage#getTableElement_SubElements()
   * @model containment="true"
   * @generated
   */
  EList<TableElement> getSubElements();

} // TableElement
