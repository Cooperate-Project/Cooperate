/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.usecase.ui.outline

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization
import de.cooperateproject.modeling.textual.usecase.usecase.System
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element
import de.cooperateproject.modeling.textual.common.outline.CooperateOutlineTreeProvider
import de.cooperateproject.modeling.textual.common.outline.UMLImage
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class UsecaseOutlineTreeProvider extends CooperateOutlineTreeProvider {

	dispatch def createChildren(IOutlineNode parentNode, UseCaseDiagram root) {
        if (root.rootPackage === null) {
            return
        }
        
        val pkg = root.rootPackage
        
        createFeatureNode(parentNode, pkg, UsecasePackage.Literals.ROOT_PACKAGE__ACTORS, UMLImage.PACKAGE.image,
            getStyledString("Actors", pkg.actors.size), false)
        createFeatureNode(parentNode, pkg, UsecasePackage.Literals.ROOT_PACKAGE__SYSTEMS, UMLImage.PACKAGE.image,
            getStyledString("Systems", pkg.systems.size), false)
        createFeatureNode(parentNode, pkg, UsecasePackage.Literals.ROOT_PACKAGE__RELATIONSHIPS, UMLImage.PACKAGE.image,
            getStyledString("Relationships", pkg.relationships.size), false)
    }
    
	protected def dispatch createNode(IOutlineNode parentNode, RootPackage element) {
	    if (element.owningPackage === null) {
	       createEObjectNode(parentNode, element.referencedElement)
	    } else {
	       createEObjectNode(parentNode, element)
	    }
	}
   
    dispatch def createChildren(IOutlineNode parentNode, System system) {
        createChild(parentNode, system)
        for (usecase : system.usecases) {
            createEObjectNode(parentNode, usecase)
        }
    }
    
    dispatch def createChildren(IOutlineNode parentNode, Generalization generalization) {
       createEObjectNode(parentNode, generalization)
    }
    
    dispatch def createChildren(IOutlineNode parentNode, UseCase uc) {
    	createChild(parentNode, uc)
    	for (ep : uc.extensionPoints) {
    		createEObjectNode(parentNode, ep)
    	}
    }
				
	protected def createChild(IOutlineNode parentNode, Commentable<?> commentable) {
		if (!commentable.comments.isEmpty) {
			createEObjectNode(parentNode, commentable.comments.findFirst[true])
		}
	}
	
	dispatch def createChildren(IOutlineNode parentNode, Element object) {
       createEObjectNode(parentNode, object)
    }
    
    dispatch def createChildren(IOutlineNode parentNode, Void object) {
       //Do nothing for a null object
    }
	
}
