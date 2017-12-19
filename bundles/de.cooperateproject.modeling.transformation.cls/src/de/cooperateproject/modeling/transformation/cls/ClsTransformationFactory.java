package de.cooperateproject.modeling.transformation.cls;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.modeling.transformation.cls.postprocessors.ClsPostProcessingSwitch;
import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.ContentIteratingPostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.switches.NotationPostProcessingSwitch;
import de.cooperateproject.modeling.transformation.registry.BidirectionalTransformationFactoryWithInjectedContext;

public class ClsTransformationFactory extends BidirectionalTransformationFactoryWithInjectedContext {
	private Collection<PostProcessor> t2gProcessors;
	private Collection<PostProcessor> g2tProcessors;

	public ClsTransformationFactory() {
		super(DiagramTypeRegistry.getInstance()
                .getByDiagramTypeDeprecated(DiagramTypesDeprecated.CLASS).get(), "notation");
	}

	@Override
	protected Collection<PostProcessor> getTextualToGraphicalPostProcessors() {
		if (t2gProcessors == null) {
			t2gProcessors = Collections.unmodifiableCollection(
					Arrays.asList(new ContentIteratingPostProcessor(50, NotationPostProcessingSwitch::new)));
		}
		return t2gProcessors;
	}

	@Override
	protected Collection<PostProcessor> getGraphicalToTextualPostProcessors() {
		if (g2tProcessors == null) {
			g2tProcessors = Collections.unmodifiableCollection(
					Arrays.asList(new ContentIteratingPostProcessor(50, ClsPostProcessingSwitch::new)));
		}
		return g2tProcessors;
	}

}
