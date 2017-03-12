/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndTypes <em>Member End Types</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndNames <em>Member End Names</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndCardinalities <em>Member End Cardinalities</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getMemberEndNavigabilities <em>Member End Navigabilities</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#isTwoSideBidirectionality <em>Two Side Bidirectionality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getTwoSideAggregationKind <em>Two Side Aggregation Kind</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation()
 * @model
 * @generated
 */
public interface XtextAssociation extends Association {
    /**
     * Returns the value of the '<em><b>Member End Types</b></em>' reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Classifier}&lt;?>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member End Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member End Types</em>' reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation_MemberEndTypes()
     * @model transient="true"
     * @generated
     */
    EList<Classifier<?>> getMemberEndTypes();

    /**
     * Returns the value of the '<em><b>Member End Names</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member End Names</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member End Names</em>' attribute list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation_MemberEndNames()
     * @model unique="false" transient="true"
     * @generated
     */
    EList<String> getMemberEndNames();

    /**
     * Returns the value of the '<em><b>Member End Cardinalities</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member End Cardinalities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member End Cardinalities</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation_MemberEndCardinalities()
     * @model containment="true" transient="true"
     * @generated
     */
    EList<Cardinality> getMemberEndCardinalities();

    /**
     * Returns the value of the '<em><b>Member End Navigabilities</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Boolean}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member End Navigabilities</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member End Navigabilities</em>' attribute list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation_MemberEndNavigabilities()
     * @model unique="false" transient="true"
     * @generated
     */
    EList<Boolean> getMemberEndNavigabilities();

    /**
     * Returns the value of the '<em><b>Two Side Bidirectionality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Two Side Bidirectionality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Two Side Bidirectionality</em>' attribute.
     * @see #setTwoSideBidirectionality(boolean)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation_TwoSideBidirectionality()
     * @model required="true" transient="true"
     * @generated
     */
    boolean isTwoSideBidirectionality();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#isTwoSideBidirectionality <em>Two Side Bidirectionality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Two Side Bidirectionality</em>' attribute.
     * @see #isTwoSideBidirectionality()
     * @generated
     */
    void setTwoSideBidirectionality(boolean value);

    /**
     * Returns the value of the '<em><b>Two Side Aggregation Kind</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Two Side Aggregation Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Two Side Aggregation Kind</em>' attribute.
     * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
     * @see #setTwoSideAggregationKind(AggregationKind)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getXtextAssociation_TwoSideAggregationKind()
     * @model required="true" transient="true"
     * @generated
     */
    AggregationKind getTwoSideAggregationKind();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation#getTwoSideAggregationKind <em>Two Side Aggregation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Two Side Aggregation Kind</em>' attribute.
     * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
     * @see #getTwoSideAggregationKind()
     * @generated
     */
    void setTwoSideAggregationKind(AggregationKind value);

} // XtextAssociation
