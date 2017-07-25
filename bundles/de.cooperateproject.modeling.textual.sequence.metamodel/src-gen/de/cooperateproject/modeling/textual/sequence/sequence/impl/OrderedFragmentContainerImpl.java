/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.sequence.sequence.Condition;
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment;
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence;
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Fragment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.OrderedFragmentContainerImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.OrderedFragmentContainerImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.OrderedFragmentContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.OrderedFragmentContainerImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.OrderedFragmentContainerImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderedFragmentContainerImpl extends UMLReferencingElementImpl<InteractionOperand> implements OrderedFragmentContainer {
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
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OrderedFragmentContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequencePackage.Literals.ORDERED_FRAGMENT_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(InteractionOperand newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Fragment> getFragments() {
        return (EList<Fragment>)eDynamicGet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS, SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Comment> getComments() {
        return (EList<Comment>)eDynamicGet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS, TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        eDynamicUnset(SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAlias() {
        eDynamicUnset(SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlias() {
        return eDynamicIsSet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Condition getCondition() {
        return (Condition)eDynamicGet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION, SequencePackage.Literals.ORDERED_FRAGMENT_CONTAINER__CONDITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newCondition, SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(Condition newCondition) {
        eDynamicSet(SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION, SequencePackage.Literals.ORDERED_FRAGMENT_CONTAINER__CONDITION, newCondition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionFragment> getUMLFragmentSequence() {
        return de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils.getUMLFragmentSequence(this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS:
                return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS:
                return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION:
                return basicSetCondition(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS:
                return getFragments();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS:
                return getComments();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME:
                return getName();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS:
                return getAlias();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION:
                return getCondition();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS:
                getFragments().clear();
                getFragments().addAll((Collection<? extends Fragment>)newValue);
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS:
                getComments().clear();
                getComments().addAll((Collection<? extends Comment>)newValue);
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME:
                setName((String)newValue);
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS:
                setAlias((String)newValue);
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION:
                setCondition((Condition)newValue);
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
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS:
                getFragments().clear();
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS:
                getComments().clear();
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME:
                unsetName();
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS:
                unsetAlias();
                return;
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION:
                setCondition((Condition)null);
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
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS:
                return !getFragments().isEmpty();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS:
                return !getComments().isEmpty();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME:
                return isSetName();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS:
                return isSetAlias();
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION:
                return getCondition() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == FragmentSequence.class) {
            switch (derivedFeatureID) {
                case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS: return SequencePackage.FRAGMENT_SEQUENCE__FRAGMENTS;
                default: return -1;
            }
        }
        if (baseClass == Commentable.class) {
            switch (derivedFeatureID) {
                case SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS: return TextualCommonsPackage.COMMENTABLE__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == PointInTime.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == FragmentSequence.class) {
            switch (baseFeatureID) {
                case SequencePackage.FRAGMENT_SEQUENCE__FRAGMENTS: return SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS;
                default: return -1;
            }
        }
        if (baseClass == Commentable.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.COMMENTABLE__COMMENTS: return SequencePackage.ORDERED_FRAGMENT_CONTAINER__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == PointInTime.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return SequencePackage.ORDERED_FRAGMENT_CONTAINER__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return SequencePackage.ORDERED_FRAGMENT_CONTAINER__ALIAS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == FragmentSequence.class) {
            switch (baseOperationID) {
                case SequencePackage.FRAGMENT_SEQUENCE___GET_UML_FRAGMENT_SEQUENCE: return SequencePackage.ORDERED_FRAGMENT_CONTAINER___GET_UML_FRAGMENT_SEQUENCE;
                default: return -1;
            }
        }
        if (baseClass == Commentable.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == PointInTime.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER___GET_UML_FRAGMENT_SEQUENCE:
                return getUMLFragmentSequence();
        }
        return super.eInvoke(operationID, arguments);
    }

} //OrderedFragmentContainerImpl