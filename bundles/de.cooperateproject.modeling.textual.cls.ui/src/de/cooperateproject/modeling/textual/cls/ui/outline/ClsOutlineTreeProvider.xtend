/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui.outline

import com.google.common.base.Predicate
import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.CommentLink
import de.cooperateproject.modeling.textual.cls.cls.Commentable
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.Package
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode
import de.cooperateproject.modeling.textual.cls.ui.labeling.UMLImage

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class ClsOutlineTreeProvider extends DefaultOutlineTreeProvider {

	dispatch def createChildren(IOutlineNode parentNode, ClassDiagram root) {
		if (root.rootPackage == null) {
			return
		}
		createNode(parentNode, root.rootPackage)
	}
	
	dispatch def createChildren(IOutlineNode parentNode, Package pkg) {
		ceateFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__PACKAGES, UMLImage.PACKAGE.image, getStyledString("Packages", pkg.packages.size), false)
		ceateFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__PACKAGE_IMPORTS, UMLImage.PACKAGE_IMPORT.image, getStyledString("Imports", pkg.packageImports.size), false)
		ceateFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__CLASSIFIERS, UMLImage.CLASS.image, getStyledString("Classifiers", pkg.classifiers.size), false)
		ceateFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__CONNECTORS, UMLImage.ASSOCIATION.image, getStyledString("Connectors", pkg.connectors.size), false)
		ceateFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__CONNECTORS, UMLImage.COMMENT.image, getStyledString("Comments", pkg.connectors.filter(Commentable).filter[comment != null].size), false, [!pkg.connectors.filter(Commentable).filter[comment != null].empty])
	}
	
	protected def dispatch createNode(EStructuralFeatureNode parentNode, Connector c) {
		if ((parentNode.text as StyledString).toString.contains("Comments")) {
			createCommentNode(parentNode, c)
		} else {
			createConnectorNode(parentNode, c)
		}
	}
	
	protected def dispatch createNode(IOutlineNode node, AssociationProperties ap) {
		// do nothing
	}
	
	private def dispatch createCommentNode(IOutlineNode parentNode, CommentLink connector) {
		createCommentNode2(parentNode, connector)
	}
	
	private def dispatch createCommentNode(IOutlineNode parentNode, Association connector) {
		createCommentNode2(parentNode, connector)
	}
	
	private def dispatch createCommentNode(IOutlineNode parentNode, Connector connector) {
		// do nothing
	}
	
	private def createCommentNode2(IOutlineNode parentNode, Commentable connector) {
		if (connector.comment != null) {
			createEObjectNode(parentNode, connector, imageDispatcher.invoke(connector), textDispatcher.invoke(connector), true)
		}
	}
	
	private def dispatch createConnectorNode(IOutlineNode parentNode, Association connector) {
		if (connector.comment == null) {
			createEObjectNode(parentNode, connector)
		} else {
			val connectorClone = EcoreUtil.copy(connector)
			connectorClone.comment = null
			createEObjectNode(parentNode, connector, imageDispatcher.invoke(connectorClone), textDispatcher.invoke(connectorClone), false);
		}
	}
	
	private def dispatch createConnectorNode(IOutlineNode parentNode, Connector connector) {
		createEObjectNode(parentNode, connector)
	}
	
	private def dispatch createConnectorNode(IOutlineNode parentNode, CommentLink connector) {
		// do nothing
	}
	
	
	private def getStyledString(String name, int counter) {
		var styledLabel = new StyledString()
		styledLabel.append(name)
		styledLabel.append(new StyledString(" : " + counter, StyledString::DECORATIONS_STYLER))
		return styledLabel
	}
	
	
	private def <T extends EObject> ceateFeatureNode(IOutlineNode parentNode, T parent, EReference ref, Image img, StyledString text, boolean isLeaf) {
		val result = parent.eGet(ref);
		if (result instanceof Collection<?>) {
			ceateFeatureNode(parentNode, parent, ref, img, text, isLeaf, [!result.empty])
		} else if (result != null) {
			ceateFeatureNode(parentNode, parent, ref, img, text, isLeaf, [true])
		}
	}
	
	private def <T extends EObject> ceateFeatureNode(IOutlineNode parentNode, T parent, EReference ref, Image img, StyledString text, boolean isLeaf, Predicate<T> pred) {
		if (pred.apply(parent)) {
			createEStructuralFeatureNode(parentNode, parent, ref, img, text, false)		
		}
	}

}
