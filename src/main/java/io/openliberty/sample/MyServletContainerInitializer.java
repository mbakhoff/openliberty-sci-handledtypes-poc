package io.openliberty.sample;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes({MyInterface.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

  public static Set<Class<?>> result;

  @Override
  public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
    result = c;
  }
}
