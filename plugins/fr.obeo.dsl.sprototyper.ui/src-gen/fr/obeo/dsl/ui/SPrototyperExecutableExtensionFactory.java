/*
 * generated by Xtext
 */
package fr.obeo.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.obeo.dsl.ui.internal.SPrototyperActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SPrototyperExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SPrototyperActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SPrototyperActivator.getInstance().getInjector(SPrototyperActivator.FR_OBEO_DSL_SPROTOTYPER);
	}
	
}
