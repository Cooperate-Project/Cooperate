package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.usecase.usecase.Visibility
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.VisibilityKind
import de.cooperateproject.modeling.textual.usecase.usecase.Cardinality

class UsecaseIssueResolutionUtilities {
	
	public static def setVisibility(NamedElement element, Visibility visibility) {
		val convertedVisibility = visibility.convert
		if (convertedVisibility == null) {
			element.eUnset(UMLPackage.eINSTANCE.namedElement_Visibility)
		} else {
			element.visibility = convertedVisibility	
		}
	}
	
	public static def convert(Visibility visibility) {
		switch (visibility) {
			case PACKAGE: VisibilityKind.PACKAGE_LITERAL
			case PRIVATE: VisibilityKind.PRIVATE_LITERAL
			case PROTECTED: VisibilityKind.PROTECTED_LITERAL
			case PUBLIC: VisibilityKind.PUBLIC_LITERAL
			case UNDEFINED: null
		}
	}
	
	public static def convert(Cardinality cardinality) {
		var leftLower = cardinality.lowerBound
		var leftUpper = cardinality.upperBound
		if (cardinality.upperBound == 0) {
			leftUpper = leftLower
		}
		if (leftLower == -1 && leftUpper == -1) {
			leftLower = 0
		}
		return Pair.of(leftLower, leftUpper)
	}
}