/*
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.ui.tests;

import com.google.inject.Injector;
import itu.xtext.landin2.configurator.ui.internal.ConfiguratorActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ExcoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ConfiguratorActivator.getInstance().getInjector("itu.xtext.landin2.configurator.Exco");
	}

}
