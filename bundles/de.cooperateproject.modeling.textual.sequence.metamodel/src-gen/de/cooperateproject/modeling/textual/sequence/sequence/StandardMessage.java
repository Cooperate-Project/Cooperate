/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getStandardMessage()
 * @model
 * @generated
 */
public interface StandardMessage extends Message {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.sequence.sequence.MessageType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cooperateproject.modeling.textual.sequence.sequence.MessageType
     * @see #setType(MessageType)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getStandardMessage_Type()
     * @model
     * @generated
     */
    MessageType getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cooperateproject.modeling.textual.sequence.sequence.MessageType
     * @see #getType()
     * @generated
     */
    void setType(MessageType value);

    /**
     * Returns the value of the '<em><b>Left</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' reference.
     * @see #setLeft(Actor)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getStandardMessage_Left()
     * @model
     * @generated
     */
    Actor getLeft();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage#getLeft <em>Left</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft(Actor value);

    /**
     * Returns the value of the '<em><b>Right</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' reference.
     * @see #setRight(Actor)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getStandardMessage_Right()
     * @model
     * @generated
     */
    Actor getRight();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage#getRight <em>Right</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' reference.
     * @see #getRight()
     * @generated
     */
    void setRight(Actor value);

} // StandardMessage