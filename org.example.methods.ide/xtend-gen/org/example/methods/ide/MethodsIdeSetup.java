/**
 * generated by Xtext 2.13.0
 */
package org.example.methods.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.example.methods.MethodsRuntimeModule;
import org.example.methods.MethodsStandaloneSetup;
import org.example.methods.ide.MethodsIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MethodsIdeSetup extends MethodsStandaloneSetup {
  @Override
  public Injector createInjector() {
    MethodsRuntimeModule _methodsRuntimeModule = new MethodsRuntimeModule();
    MethodsIdeModule _methodsIdeModule = new MethodsIdeModule();
    return Guice.createInjector(Modules2.mixin(_methodsRuntimeModule, _methodsIdeModule));
  }
}