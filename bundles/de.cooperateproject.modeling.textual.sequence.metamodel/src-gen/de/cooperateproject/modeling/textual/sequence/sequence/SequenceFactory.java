/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
 * @generated
 */
public interface SequenceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SequenceFactory eINSTANCE = de.cooperateproject.modeling.textual.sequence.sequence.impl.SequenceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    SequenceDiagram createSequenceDiagram();

    /**
     * Returns a new object of class '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Root Package</em>'.
     * @generated
     */
    RootPackage createRootPackage();

    /**
     * Returns a new object of class '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor</em>'.
     * @generated
     */
    Actor createActor();

    /**
     * Returns a new object of class '<em>Behavior Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Fragment</em>'.
     * @generated
     */
    BehaviorFragment createBehaviorFragment();

    /**
     * Returns a new object of class '<em>Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message</em>'.
     * @generated
     */
    Message createMessage();

    /**
     * Returns a new object of class '<em>Time Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Constraint</em>'.
     * @generated
     */
    TimeConstraint createTimeConstraint();

    /**
     * Returns a new object of class '<em>Inner Time Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inner Time Constraint</em>'.
     * @generated
     */
    InnerTimeConstraint createInnerTimeConstraint();

    /**
     * Returns a new object of class '<em>Standard Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Standard Message</em>'.
     * @generated
     */
    StandardMessage createStandardMessage();

    /**
     * Returns a new object of class '<em>Response Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Response Message</em>'.
     * @generated
     */
    ResponseMessage createResponseMessage();

    /**
     * Returns a new object of class '<em>Found Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Found Message</em>'.
     * @generated
     */
    FoundMessage createFoundMessage();

    /**
     * Returns a new object of class '<em>Lost Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lost Message</em>'.
     * @generated
     */
    LostMessage createLostMessage();

    /**
     * Returns a new object of class '<em>Create Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Create Message</em>'.
     * @generated
     */
    CreateMessage createCreateMessage();

    /**
     * Returns a new object of class '<em>Destruction Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destruction Message</em>'.
     * @generated
     */
    DestructionMessage createDestructionMessage();

    /**
     * Returns a new object of class '<em>Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Occurence Specification</em>'.
     * @generated
     */
    OccurenceSpecification createOccurenceSpecification();

    /**
     * Returns a new object of class '<em>Destruction Occurence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destruction Occurence Specification</em>'.
     * @generated
     */
    DestructionOccurenceSpecification createDestructionOccurenceSpecification();

    /**
     * Returns a new object of class '<em>Combined Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combined Fragment</em>'.
     * @generated
     */
    CombinedFragment createCombinedFragment();

    /**
     * Returns a new object of class '<em>Alternative</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alternative</em>'.
     * @generated
     */
    Alternative createAlternative();

    /**
     * Returns a new object of class '<em>Option</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Option</em>'.
     * @generated
     */
    Option createOption();

    /**
     * Returns a new object of class '<em>Parallel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parallel</em>'.
     * @generated
     */
    Parallel createParallel();

    /**
     * Returns a new object of class '<em>Critical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Critical</em>'.
     * @generated
     */
    Critical createCritical();

    /**
     * Returns a new object of class '<em>Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loop</em>'.
     * @generated
     */
    Loop createLoop();

    /**
     * Returns a new object of class '<em>Behavior Fragments</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Fragments</em>'.
     * @generated
     */
    BehaviorFragments createBehaviorFragments();

    /**
     * Returns a new object of class '<em>Behavior Fragments With Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Fragments With Condition</em>'.
     * @generated
     */
    BehaviorFragmentsWithCondition createBehaviorFragmentsWithCondition();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SequencePackage getSequencePackage();

} //SequenceFactory