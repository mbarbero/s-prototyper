/*
* generated by Xtext
*/
package fr.obeo.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SPrototyperUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.obeo.dsl.ui.internal.SPrototyperActivator.getInstance().getInjector("fr.obeo.dsl.SPrototyper");
	}
	
}
