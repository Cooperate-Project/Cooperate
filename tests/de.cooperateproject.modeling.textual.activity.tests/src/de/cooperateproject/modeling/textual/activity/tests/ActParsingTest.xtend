/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.tests

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.activity.act.ActivityDiagram
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(ActInjectorProvider)
class ActParsingTest {
	@Inject
	ParseHelper<ActivityDiagram> parseHelper
	
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			@start-actd "SomeName"
			"SomeTitle"
			@end-actd
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
}
