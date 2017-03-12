/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui.cdoxtext

import com.google.common.base.Function
import com.google.inject.Inject
import com.google.inject.Provider
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.emf.cdo.util.CDOUtil
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.scope.IComparisonScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.StringExpression

class ClsMatchEngineFactory extends MatchEngineFactoryImpl { 
	
	private static final String NS_URI = "http://www.cooperateproject.de/modeling/textual/cls/Cls"
	
	@Inject
	Provider<ProximityEObjectMatcher.DistanceFunction> dfProvider
	
	override isMatchEngineFactoryFor(IComparisonScope scope) {
		val nsURIs = #{scope.left, scope.right, scope.origin}.filter(EObject).map[eClass.EPackage.nsURI].toSet
		return nsURIs.size == 1 && NS_URI.equals(nsURIs.head)
	}
	
	override getMatchEngine() {
		val idComputation = new Function<EObject, String>() {
			override apply(EObject input) {
				val cdoObject = CDOUtil.getCDOObject(input)
				cdoObject.cdoID.toString
				//val adapter = EcoreUtil.getExistingAdapter(input, typeof(CDOLegacyAdapter))
				//println((adapter as CDOLegacyAdapter).cdoID)
				//(adapter as CDOLegacyAdapter).cdoID.toString
				//val cdoid = CDOIDUtil.getCDOID(input)
				//return cdoid.toString
				
			}
		}
		
		val idFunction = new Function<EObject, String>() {
			override apply(EObject input) {				
				switch input {
					UMLReferencingElement: "UMLReferencingElement" + idComputation.apply(input.referencedElement)
					StringExpression: "StringExp" + input.name
					Cardinality: "Cardinality" + input.eContainmentFeature.name + apply(input.eContainer)
					default: null
				}
			}
		}
		
		val proxMatcher = new ProximityEObjectMatcher(dfProvider.get)
		val matcher = new IdentifierEObjectMatcher(proxMatcher, idFunction)
		return new DefaultMatchEngine(matcher, new DefaultComparisonFactory(new DefaultEqualityHelperFactory()))
	}	
}
