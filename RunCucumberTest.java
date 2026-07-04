/* Maven por sí solo no sabe qué es Cucumber ni cómo leer un archivo .feature. 
Maven solo busca clases de Java que terminen con la palabra Test (como RunCucumberTest). */

package com.ejemplo;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
Al encontrar esta clase, ve la anotación @RunWith(Cucumber.class). 
Esto le dice a Maven: 
cede el control a la librería de Cucumber para que ella se encargue de ejecutar lo que sigue.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class RunCucumberTest {
}