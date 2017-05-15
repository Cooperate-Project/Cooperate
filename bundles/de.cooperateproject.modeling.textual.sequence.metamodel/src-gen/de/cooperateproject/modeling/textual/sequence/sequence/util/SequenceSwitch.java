/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.sequence.sequence.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
 * @generated
 */
public class SequenceSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SequencePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceSwitch() {
        if (modelPackage == null) {
            modelPackage = SequencePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SequencePackage.SEQUENCE_DIAGRAM: {
                SequenceDiagram sequenceDiagram = (SequenceDiagram)theEObject;
                T result = caseSequenceDiagram(sequenceDiagram);
                if (result == null) result = caseUMLReferencingElement(sequenceDiagram);
                if (result == null) result = caseElement(sequenceDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.ROOT_PACKAGE: {
                RootPackage rootPackage = (RootPackage)theEObject;
                T result = caseRootPackage(rootPackage);
                if (result == null) result = caseUMLReferencingElement(rootPackage);
                if (result == null) result = caseNamedElement(rootPackage);
                if (result == null) result = caseElement(rootPackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.ACTOR: {
                Actor actor = (Actor)theEObject;
                T result = caseActor(actor);
                if (result == null) result = caseAliasedElement(actor);
                if (result == null) result = caseCommentable(actor);
                if (result == null) result = caseUMLReferencingElement(actor);
                if (result == null) result = caseNamedElement(actor);
                if (result == null) result = caseElement(actor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.BEHAVIOR_FRAGMENT: {
                BehaviorFragment behaviorFragment = (BehaviorFragment)theEObject;
                T result = caseBehaviorFragment(behaviorFragment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.MESSAGE: {
                Message message = (Message)theEObject;
                T result = caseMessage(message);
                if (result == null) result = caseBehaviorFragment(message);
                if (result == null) result = caseUMLReferencingElement(message);
                if (result == null) result = caseNamedElement(message);
                if (result == null) result = caseElement(message);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.TIME_CONSTRAINT: {
                TimeConstraint timeConstraint = (TimeConstraint)theEObject;
                T result = caseTimeConstraint(timeConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.INNER_TIME_CONSTRAINT: {
                InnerTimeConstraint innerTimeConstraint = (InnerTimeConstraint)theEObject;
                T result = caseInnerTimeConstraint(innerTimeConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.STANDARD_MESSAGE: {
                StandardMessage standardMessage = (StandardMessage)theEObject;
                T result = caseStandardMessage(standardMessage);
                if (result == null) result = caseMessage(standardMessage);
                if (result == null) result = caseBehaviorFragment(standardMessage);
                if (result == null) result = caseUMLReferencingElement(standardMessage);
                if (result == null) result = caseNamedElement(standardMessage);
                if (result == null) result = caseElement(standardMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.RESPONSE_MESSAGE: {
                ResponseMessage responseMessage = (ResponseMessage)theEObject;
                T result = caseResponseMessage(responseMessage);
                if (result == null) result = caseMessage(responseMessage);
                if (result == null) result = caseBehaviorFragment(responseMessage);
                if (result == null) result = caseUMLReferencingElement(responseMessage);
                if (result == null) result = caseNamedElement(responseMessage);
                if (result == null) result = caseElement(responseMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.FOUND_MESSAGE: {
                FoundMessage foundMessage = (FoundMessage)theEObject;
                T result = caseFoundMessage(foundMessage);
                if (result == null) result = caseMessage(foundMessage);
                if (result == null) result = caseBehaviorFragment(foundMessage);
                if (result == null) result = caseUMLReferencingElement(foundMessage);
                if (result == null) result = caseNamedElement(foundMessage);
                if (result == null) result = caseElement(foundMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.LOST_MESSAGE: {
                LostMessage lostMessage = (LostMessage)theEObject;
                T result = caseLostMessage(lostMessage);
                if (result == null) result = caseMessage(lostMessage);
                if (result == null) result = caseBehaviorFragment(lostMessage);
                if (result == null) result = caseUMLReferencingElement(lostMessage);
                if (result == null) result = caseNamedElement(lostMessage);
                if (result == null) result = caseElement(lostMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.CREATE_MESSAGE: {
                CreateMessage createMessage = (CreateMessage)theEObject;
                T result = caseCreateMessage(createMessage);
                if (result == null) result = caseMessage(createMessage);
                if (result == null) result = caseBehaviorFragment(createMessage);
                if (result == null) result = caseUMLReferencingElement(createMessage);
                if (result == null) result = caseNamedElement(createMessage);
                if (result == null) result = caseElement(createMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.DESTRUCTION_MESSAGE: {
                DestructionMessage destructionMessage = (DestructionMessage)theEObject;
                T result = caseDestructionMessage(destructionMessage);
                if (result == null) result = caseMessage(destructionMessage);
                if (result == null) result = caseBehaviorFragment(destructionMessage);
                if (result == null) result = caseUMLReferencingElement(destructionMessage);
                if (result == null) result = caseNamedElement(destructionMessage);
                if (result == null) result = caseElement(destructionMessage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.OCCURENCE_SPECIFICATION: {
                OccurenceSpecification occurenceSpecification = (OccurenceSpecification)theEObject;
                T result = caseOccurenceSpecification(occurenceSpecification);
                if (result == null) result = caseBehaviorFragment(occurenceSpecification);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.DESTRUCTION_OCCURENCE_SPECIFICATION: {
                DestructionOccurenceSpecification destructionOccurenceSpecification = (DestructionOccurenceSpecification)theEObject;
                T result = caseDestructionOccurenceSpecification(destructionOccurenceSpecification);
                if (result == null) result = caseOccurenceSpecification(destructionOccurenceSpecification);
                if (result == null) result = caseUMLReferencingElement(destructionOccurenceSpecification);
                if (result == null) result = caseBehaviorFragment(destructionOccurenceSpecification);
                if (result == null) result = caseElement(destructionOccurenceSpecification);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.COMBINED_FRAGMENT: {
                CombinedFragment combinedFragment = (CombinedFragment)theEObject;
                T result = caseCombinedFragment(combinedFragment);
                if (result == null) result = caseBehaviorFragment(combinedFragment);
                if (result == null) result = caseUMLReferencingElement(combinedFragment);
                if (result == null) result = caseElement(combinedFragment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.ALTERNATIVE: {
                Alternative alternative = (Alternative)theEObject;
                T result = caseAlternative(alternative);
                if (result == null) result = caseCombinedFragment(alternative);
                if (result == null) result = caseBehaviorFragment(alternative);
                if (result == null) result = caseUMLReferencingElement(alternative);
                if (result == null) result = caseElement(alternative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.OPTION: {
                Option option = (Option)theEObject;
                T result = caseOption(option);
                if (result == null) result = caseCombinedFragment(option);
                if (result == null) result = caseBehaviorFragment(option);
                if (result == null) result = caseUMLReferencingElement(option);
                if (result == null) result = caseElement(option);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.PARALLEL: {
                Parallel parallel = (Parallel)theEObject;
                T result = caseParallel(parallel);
                if (result == null) result = caseCombinedFragment(parallel);
                if (result == null) result = caseBehaviorFragment(parallel);
                if (result == null) result = caseUMLReferencingElement(parallel);
                if (result == null) result = caseElement(parallel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.CRITICAL: {
                Critical critical = (Critical)theEObject;
                T result = caseCritical(critical);
                if (result == null) result = caseCombinedFragment(critical);
                if (result == null) result = caseBehaviorFragment(critical);
                if (result == null) result = caseUMLReferencingElement(critical);
                if (result == null) result = caseElement(critical);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.LOOP: {
                Loop loop = (Loop)theEObject;
                T result = caseLoop(loop);
                if (result == null) result = caseCombinedFragment(loop);
                if (result == null) result = caseBehaviorFragment(loop);
                if (result == null) result = caseUMLReferencingElement(loop);
                if (result == null) result = caseElement(loop);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.BEHAVIOR_FRAGMENTS: {
                BehaviorFragments behaviorFragments = (BehaviorFragments)theEObject;
                T result = caseBehaviorFragments(behaviorFragments);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.BEHAVIOR_FRAGMENTS_WITH_CONDITION: {
                BehaviorFragmentsWithCondition behaviorFragmentsWithCondition = (BehaviorFragmentsWithCondition)theEObject;
                T result = caseBehaviorFragmentsWithCondition(behaviorFragmentsWithCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.ACTOR_CLASSIFIER_MAPPING: {
                ActorClassifierMapping actorClassifierMapping = (ActorClassifierMapping)theEObject;
                T result = caseActorClassifierMapping(actorClassifierMapping);
                if (result == null) result = caseUMLReferencingElement(actorClassifierMapping);
                if (result == null) result = caseElement(actorClassifierMapping);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SequencePackage.TIMED: {
                Timed timed = (Timed)theEObject;
                T result = caseTimed(timed);
                if (result == null) result = caseCombinedFragment(timed);
                if (result == null) result = caseBehaviorFragment(timed);
                if (result == null) result = caseUMLReferencingElement(timed);
                if (result == null) result = caseElement(timed);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSequenceDiagram(SequenceDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Root Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRootPackage(RootPackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActor(Actor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Fragment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Fragment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorFragment(BehaviorFragment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessage(Message object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeConstraint(TimeConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inner Time Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inner Time Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInnerTimeConstraint(InnerTimeConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Standard Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Standard Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStandardMessage(StandardMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Response Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Response Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResponseMessage(ResponseMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Found Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Found Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFoundMessage(FoundMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lost Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lost Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLostMessage(LostMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Create Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Create Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCreateMessage(CreateMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Destruction Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Destruction Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDestructionMessage(DestructionMessage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Occurence Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOccurenceSpecification(OccurenceSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Destruction Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Destruction Occurence Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDestructionOccurenceSpecification(DestructionOccurenceSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombinedFragment(CombinedFragment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlternative(Alternative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOption(Option object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParallel(Parallel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Critical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Critical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCritical(Critical object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoop(Loop object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Fragments</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Fragments</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorFragments(BehaviorFragments object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Fragments With Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Fragments With Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorFragmentsWithCondition(BehaviorFragmentsWithCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Actor Classifier Mapping</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Actor Classifier Mapping</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActorClassifierMapping(ActorClassifierMapping object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimed(Timed object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Referencing Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Referencing Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <UMLType extends org.eclipse.uml2.uml.Element> T caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aliased Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aliased Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAliasedElement(AliasedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <CommentableUMLType extends org.eclipse.uml2.uml.Element> T caseCommentable(Commentable<CommentableUMLType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SequenceSwitch
