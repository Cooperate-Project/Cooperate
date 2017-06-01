/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.Actor;
import de.cooperateproject.modeling.textual.sequence.sequence.CreateMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.CreateMessageImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.CreateMessageImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateMessageImpl extends MessageImpl implements CreateMessage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CreateMessageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequencePackage.Literals.CREATE_MESSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor getLeft() {
        return (Actor)eDynamicGet(SequencePackage.CREATE_MESSAGE__LEFT, SequencePackage.Literals.CREATE_MESSAGE__LEFT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor basicGetLeft() {
        return (Actor)eDynamicGet(SequencePackage.CREATE_MESSAGE__LEFT, SequencePackage.Literals.CREATE_MESSAGE__LEFT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeft(Actor newLeft) {
        eDynamicSet(SequencePackage.CREATE_MESSAGE__LEFT, SequencePackage.Literals.CREATE_MESSAGE__LEFT, newLeft);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor getRight() {
        return (Actor)eDynamicGet(SequencePackage.CREATE_MESSAGE__RIGHT, SequencePackage.Literals.CREATE_MESSAGE__RIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor basicGetRight() {
        return (Actor)eDynamicGet(SequencePackage.CREATE_MESSAGE__RIGHT, SequencePackage.Literals.CREATE_MESSAGE__RIGHT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRight(Actor newRight) {
        eDynamicSet(SequencePackage.CREATE_MESSAGE__RIGHT, SequencePackage.Literals.CREATE_MESSAGE__RIGHT, newRight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                if (resolve) return getLeft();
                return basicGetLeft();
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                if (resolve) return getRight();
                return basicGetRight();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                setLeft((Actor)newValue);
                return;
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                setRight((Actor)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                setLeft((Actor)null);
                return;
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                setRight((Actor)null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SequencePackage.CREATE_MESSAGE__LEFT:
                return basicGetLeft() != null;
            case SequencePackage.CREATE_MESSAGE__RIGHT:
                return basicGetRight() != null;
        }
        return super.eIsSet(featureID);
    }

} //CreateMessageImpl
