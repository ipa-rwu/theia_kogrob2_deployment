/*
 * generated by Xtext 2.26.0
 */
package de.ipa.fraunhofer.deployment.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.ipa.fraunhofer.deployment.YamlRuntimeModule;
import de.ipa.fraunhofer.deployment.YamlStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class YamlIdeSetup extends YamlStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new YamlRuntimeModule(), new YamlIdeModule()));
	}
	
}
