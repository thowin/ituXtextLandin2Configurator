/*
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractExcoValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(itu.xtext.landin2.configurator.exco.ExcoPackage.eINSTANCE);
		return result;
	}
	
}
