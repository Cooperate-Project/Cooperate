package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.GrammarUtil

import static org.eclipse.xtext.xtext.generator.model.TypeReference.*

class CustomizedRuntimeModuleGenerator {

	private val extension XtextGeneratorNaming naming
	private val Grammar grammar

	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}

	def create(JavaFileAccess jva, String simpleClassName) {
		jva.content = '''
		import java.lang.reflect.Modifier;
		import java.net.URL;
		import java.util.Arrays;
		import java.util.Collection;
		import java.util.EnumMap;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;
		import java.util.Optional;
		import java.util.Set;
		import java.util.stream.Collectors;
		
		import org.eclipse.emf.ecore.EObject;
		import org.reflections.Reflections;
		import org.reflections.scanners.SubTypesScanner;
		import org.reflections.util.ClasspathHelper;
		import org.reflections.util.ConfigurationBuilder;
		import org.reflections.util.FilterBuilder;
		
		import com.google.inject.Inject;
		import com.google.inject.Injector;
		
		import de.cooperateproject.modeling.textual.common.derivedstate.calculator.UMLReferencingElementCalculator;
		import de.cooperateproject.modeling.textual.common.derivedstate.initializer.VisibilityHavingElementInitializer;
		import de.cooperateproject.modeling.textual.common.derivedstate.remover.UMLReferencingElementRemover;
		import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
		import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;
		import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessor;
		import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;
		
		/**
		 * Runtime module for «GrammarUtil.getSimpleName(grammar).toLowerCase» diagrams that injects test mocks.
		 * 
		 * This module enables running the tests as JUnit tests rather than plugin tests.
		 */
		public class «simpleClassName» extends «typeRef(abstractCustomizedRuntimeModuleName)» {
		
		    private static class DummyAtomicProcessorRegistry implements IAtomicDerivedStateProcessorRegistry {
		        private static final Class<?>[] RELEVANT_CLASSES = { IAtomicDerivedStateProcessor.class,
		                UMLReferencingElementCalculator.class, UMLReferencingElementRemover.class,
		                VisibilityHavingElementInitializer.class };
		
		        @SuppressWarnings("rawtypes")
		        private static final Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> PROCESSORS = getProcessors();
		
		        @Inject
		        public DummyAtomicProcessorRegistry(Injector injector) {
		            PROCESSORS.values().stream().map(Map::values).flatMap(Collection::stream).distinct()
		                    .forEach(injector::injectMembers);
		        }
		
		        @SuppressWarnings("rawtypes")
		        private static Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> getProcessors() {
		
		            Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> categories = new EnumMap<>(
		                    DerivedStateProcessorApplicability.class);
		            for (DerivedStateProcessorApplicability applicability : DerivedStateProcessorApplicability.values()) {
		                categories.put(applicability, new HashMap<>());
		            }
		
		            List<Class<?>> packageProvidingClasses = Arrays.asList(RELEVANT_CLASSES);
		            Collection<URL> urls = packageProvidingClasses.stream()
		                    .map(«GrammarUtil.getSimpleName.toLowerCase» -> ClasspathHelper.forPackage(«GrammarUtil.getSimpleName.toLowerCase».getPackage().getName(), «GrammarUtil.getSimpleName.toLowerCase».getClassLoader()))
		                    .flatMap(Collection::stream).collect(Collectors.toSet());
		            String[] packageNames = packageProvidingClasses.stream().map(Class::getPackage).map(Package::getName)
		                    .collect(Collectors.toSet()).toArray(new String[0]);
		            Reflections reflections = new Reflections(
		                    new ConfigurationBuilder().setUrls(urls).setScanners(new SubTypesScanner(false))
		                            .filterInputsBy(new FilterBuilder().includePackage(packageNames)));
		            Set<Class<? extends IAtomicDerivedStateProcessor>> subTypes = reflections
		                    .getSubTypesOf(IAtomicDerivedStateProcessor.class).stream().filter(c -> !c.isInterface()
		                            && !Modifier.isAbstract(c.getModifiers()) && Modifier.isPublic(c.getModifiers()))
		                    .collect(Collectors.toSet());
		
		            for (Class<? extends IAtomicDerivedStateProcessor> type : subTypes) {
		                IAtomicDerivedStateProcessor<?> instance;
		                try {
		                    instance = type.newInstance();
		                } catch (InstantiationException | IllegalAccessException e) {
		                    throw new RuntimeException(e);
		                }
		                Applicability applicabilities = instance.getClass().getAnnotation(Applicability.class);
		                for (DerivedStateProcessorApplicability applicability : applicabilities.applicabilities()) {
		                    categories.get(applicability).put(instance.getType(), instance);
		                }
		            }
		
		            return categories;
		        }
		
		        @Override
		        @SuppressWarnings("unchecked")
		        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type) {
		            return Optional.ofNullable(
		                    PROCESSORS.get(DerivedStateProcessorApplicability.INITIALIZATION).getOrDefault(type, null));
		        }
		
		        @Override
		        @SuppressWarnings("unchecked")
		        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type) {
		            return Optional
		                    .ofNullable(PROCESSORS.get(DerivedStateProcessorApplicability.CLEANING).getOrDefault(type, null));
		        }
		
		        @Override
		        @SuppressWarnings("unchecked")
		        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type) {
		            return Optional.ofNullable(
		                    PROCESSORS.get(DerivedStateProcessorApplicability.CALCULATION).getOrDefault(type, null));
		        }
		
		    }
		
		    @Override
		    public Class<? extends IAtomicDerivedStateProcessorRegistry> bindIAtomicDerivedStateProcessorRegistry() {
		        return DummyAtomicProcessorRegistry.class;
		    };
		
		}
		
		'''

	}
	
	private def getAbstractCustomizedRuntimeModuleName() {
		return naming.getRuntimeTestBasePackage(grammar) + ".scoping.util." + "Abstract" + 
		GrammarUtil.getSimpleName(grammar) + "CustomizedRuntimeModule";
	}

}
