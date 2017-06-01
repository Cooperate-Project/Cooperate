/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.Reference#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends UMLReferencingElement<InteractionUse>, NonInstantaneousFragment<InteractionUse> {
    /**
     * Returns the value of the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' reference.
     * @see #setReference(Interaction)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getReference_Reference()
     * @model
     * @generated
     */
    Interaction getReference();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.Reference#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(Interaction value);

} // Reference
