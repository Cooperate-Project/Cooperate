/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getLeftport <em>Leftport</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getRightport <em>Rightport</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation()
 * @model abstract="true"
 * @generated
 */
public interface PortRelation extends AliasedElement {
    /**
     * Returns the value of the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' reference.
     * @see #setInterface(Interface)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_Interface()
     * @model required="true"
     * @generated
     */
    Interface getInterface();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getInterface <em>Interface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' reference.
     * @see #getInterface()
     * @generated
     */
    void setInterface(Interface value);

    /**
     * Returns the value of the '<em><b>Leftport</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leftport</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leftport</em>' reference.
     * @see #setLeftport(Port)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_Leftport()
     * @model required="true"
     * @generated
     */
    Port getLeftport();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getLeftport <em>Leftport</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leftport</em>' reference.
     * @see #getLeftport()
     * @generated
     */
    void setLeftport(Port value);

    /**
     * Returns the value of the '<em><b>Rightport</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rightport</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rightport</em>' reference.
     * @see #setRightport(Port)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_Rightport()
     * @model required="true"
     * @generated
     */
    Port getRightport();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#getRightport <em>Rightport</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rightport</em>' reference.
     * @see #getRightport()
     * @generated
     */
    void setRightport(Port value);

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getPortRelation_Static()
     * @model unique="false"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

} // PortRelation