/*
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.ui;

import com.google.inject.Injector;
import itu.xtext.landin2.configurator.ui.internal.ConfiguratorActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ExcoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ConfiguratorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ConfiguratorActivator.getInstance().getInjector(ConfiguratorActivator.ITU_XTEXT_LANDIN2_CONFIGURATOR_EXCO);
	}
	
}
