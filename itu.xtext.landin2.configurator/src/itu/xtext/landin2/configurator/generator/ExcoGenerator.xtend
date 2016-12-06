/*
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import itu.xtext.landin2.configurator.exco.Configurator
import itu.xtext.landin2.configurator.exco.Title
import itu.xtext.landin2.configurator.exco.FreeText
import itu.xtext.landin2.configurator.exco.Expression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ExcoGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Configurator)) {
            fsa.generateFile(
                'spec.json',
                e.compileJS)
	}
}
	def  compileJS(Configurator c){
'''{
"ConfigTitle": "�c.title.compileJS�",
"options": [
�FOR f : c.expression�
�f.compileJS�
�ENDFOR�
]
}
'''
}

def compileJS(Title t){
	return (t.name);
}

def compileJS(Expression e){
	return e.left.name;
}



}