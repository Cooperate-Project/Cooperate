package de.cooperateproject.modeling.textual.activity.issues;

import de.cooperateproject.modeling.textual.common.issues.DependingElementMissingElementResolvableCheckerBase


import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.activity.act.Node
import de.cooperateproject.modeling.textual.activity.act.ActPackage
import de.cooperateproject.modeling.textual.activity.act.Flow
import de.cooperateproject.modeling.textual.activity.act.Swimlane
import de.cooperateproject.modeling.textual.activity.act.Activity

class ActUMLReferencingElementMissingElementChecker extends DependingElementMissingElementResolvableCheckerBase {
	
	protected def dispatch localResolutionPossible(Node<?> element) {
		return element.hasValidParent(ActPackage.Literals.CONTAINER) 
	}
	
	protected def dispatch localResolutionPossible(Flow element) {
		return true;
	}
	
	protected def dispatch localResolutionPossible(Swimlane element) {
		return element.hasValidParent(ActPackage.Literals.ACTIVITY)
	}
	
	protected def dispatch localResolutionPossible(Activity element) {
		return element.hasValidParent(ActPackage.Literals.ROOT_PACKAGE)
	}
	
	protected def dispatch getDependencies(Flow element) {
		#[element.source, element.target]
	}
	
}