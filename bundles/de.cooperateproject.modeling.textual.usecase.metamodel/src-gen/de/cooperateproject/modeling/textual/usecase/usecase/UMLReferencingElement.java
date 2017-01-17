/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUMLReferencingElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface UMLReferencingElement<UMLType extends Element> extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(Element)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUMLReferencingElement_ReferencedElement()
	 * @model
	 * @generated
	 */
	UMLType getReferencedElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(UMLType value);

} // UMLReferencingElement
