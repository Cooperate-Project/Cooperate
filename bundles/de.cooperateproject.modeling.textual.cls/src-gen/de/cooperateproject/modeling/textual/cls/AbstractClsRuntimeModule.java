/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls;

import java.util.Properties;

import org.eclipse.xtext.Constants;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.DerivedStateResourceHandlerFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.IDerivedStateResourceHandlerFactory;

/**
 * Manual modifications go to {de.cooperateproject.modeling.textual.cls.ClsRuntimeModule}
 */
@SuppressWarnings("all")
public abstract class AbstractClsRuntimeModule extends org.eclipse.xtext.service.DefaultRuntimeModule {

    protected Properties properties = null;

    @Override
    public void configure(Binder binder) {
        properties = tryBindProperties(binder, "de/cooperateproject/modeling/textual/cls/Cls.properties");
        super.configure(binder);
    }

    public void configureLanguageName(Binder binder) {
        binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME))
                .toInstance("de.cooperateproject.modeling.textual.cls.Cls");
    }

    public void configureFileExtensions(Binder binder) {
        if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
            binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("cls");
    }

    // contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
    public java.lang.ClassLoader bindClassLoaderToInstance() {
        return getClass().getClassLoader();
    }

    // contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
    public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
        return de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess.class;
    }

    // contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
    public Class<? extends org.eclipse.xtext.serializer.sequencer.ISemanticSequencer> bindISemanticSequencer() {
        return de.cooperateproject.modeling.textual.cls.serializer.ClsSemanticSequencer.class;
    }

    // contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
    public Class<? extends org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer> bindISyntacticSequencer() {
        return de.cooperateproject.modeling.textual.cls.serializer.ClsSyntacticSequencer.class;
    }

    // contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
    public Class<? extends org.eclipse.xtext.serializer.ISerializer> bindISerializer() {
        return org.eclipse.xtext.serializer.impl.Serializer.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
        return de.cooperateproject.modeling.textual.cls.parser.antlr.ClsParser.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
        return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
        return de.cooperateproject.modeling.textual.cls.parser.antlr.ClsAntlrTokenFileProvider.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
        return de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsLexer.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public com.google.inject.Provider<de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsLexer> provideInternalClsLexer() {
        return org.eclipse.xtext.parser.antlr.LexerProvider
                .create(de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsLexer.class);
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public void configureRuntimeLexer(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
                .annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME))
                .to(de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsLexer.class);
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
        return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
    }

    // contributed by org.eclipse.xtext.generator.validation.ValidatorFragment
    @org.eclipse.xtext.service.SingletonBinding(eager = true)
    public Class<? extends de.cooperateproject.modeling.textual.cls.validation.ClsValidator> bindClsValidator() {
        return de.cooperateproject.modeling.textual.cls.validation.ClsValidator.class;
    }

    // contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
        return de.cooperateproject.modeling.textual.cls.scoping.ClsScopeProvider.class;
    }

    // contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
    public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
                .annotatedWith(com.google.inject.name.Names
                        .named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.class);
    }

    // contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
    public void configureIgnoreCaseLinking(com.google.inject.Binder binder) {
        binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
        return org.eclipse.xtext.resource.containers.StateBasedContainerManager.class;
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
        return org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider.class;
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public void configureIResourceDescriptions(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class)
                .to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public void configureIResourceDescriptionsPersisted(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class)
                .annotatedWith(com.google.inject.name.Names
                        .named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS))
                .to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
    }

    // contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
    public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
        return de.cooperateproject.modeling.textual.cls.generator.ClsGenerator.class;
    }

    // contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
    public Class<? extends org.eclipse.xtext.formatting2.IFormatter2> bindIFormatter2() {
        return de.cooperateproject.modeling.textual.cls.formatting2.ClsFormatter.class;
    }

    // contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
    public void configureFormatterPreferences(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.preferences.IPreferenceValuesProvider.class)
                .annotatedWith(org.eclipse.xtext.formatting2.FormatterPreferences.class)
                .to(org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider.class);
    }

    // contributed by net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment
    public Class<? extends org.eclipse.xtext.formatting2.regionaccess.TextRegionAccessBuilder> bindTextRegionAccessBuilder() {
        return net.winklerweb.cdoxtext.runtime.CDOTextRegionAccessBuilder.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends org.eclipse.xtext.resource.XtextResourceSet> bindXtextResourceSet() {
        return de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
        return de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder> bindIUMLUriFinder() {
        return de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends IDerivedStateResourceHandlerFactory> bindIDerivedStateResourceHandlerFactory() {
        return DerivedStateResourceHandlerFactory.class;
    }

    // contributed by de.cooperateproject.modeling.textual.xtext.generator.naming.CooperateNamingBindingsFragment
    public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider.class;
    }

    // contributed by de.cooperateproject.modeling.textual.xtext.generator.naming.CooperateNamingBindingsFragment
    public Class<? extends de.cooperateproject.modeling.textual.xtext.runtime.scoping.IAlternativeNameProvider> bindIAlternativeNameProvider() {
        return de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider.class;
    }

    // contributed by de.cooperateproject.modeling.textual.xtext.generator.naming.CooperateNamingBindingsFragment
    public Class<? extends de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLPrimitiveTypeSelector> bindIUMLPrimitiveTypeSelector() {
        return de.cooperateproject.modeling.textual.xtext.runtime.scoping.DefaultUMLPrimitiveTypeSelector.class;
    }

}
