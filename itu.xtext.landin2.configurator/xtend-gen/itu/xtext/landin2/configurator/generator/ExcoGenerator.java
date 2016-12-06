/**
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.generator;

import com.google.common.collect.Iterables;
import itu.xtext.landin2.configurator.exco.Configurator;
import itu.xtext.landin2.configurator.exco.Expression;
import itu.xtext.landin2.configurator.exco.Title;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ExcoGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Configurator> _filter = Iterables.<Configurator>filter(_iterable, Configurator.class);
    for (final Configurator e : _filter) {
      CharSequence _compileJS = this.compileJS(e);
      fsa.generateFile(
        "spec.json", _compileJS);
    }
  }
  
  public CharSequence compileJS(final Configurator c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\"ConfigTitle\": \"");
    Title _title = c.getTitle();
    String _compileJS = this.compileJS(_title);
    _builder.append(_compileJS, "");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\"options\": [");
    _builder.newLine();
    {
      EList<Expression> _expression = c.getExpression();
      for(final Expression f : _expression) {
        String _compileJS_1 = this.compileJS(f);
        _builder.append(_compileJS_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String compileJS(final Title t) {
    return t.getName();
  }
  
  public String compileJS(final Expression e) {
    Expression _left = e.getLeft();
    return _left.getName();
  }
}