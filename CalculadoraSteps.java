package com.ejemplo;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSteps {
    private double monto;
    private double resultado;
    private CalculadoraImpuestos calc = new CalculadoraImpuestos();

    // Escenario: Calcular impuesto para monto mayor a 1000
    @Given("un monto de {double}")
    //invocación del método dadoUnMonto con el valor del monto proporcionado en la característica
    public void dadoUnMonto(double monto) { this.monto = monto; }

    @When("calculo el impuesto")
    public void cuandoCalculo() { this.resultado = calc.calcular(this.monto); }

    @Then("el resultado debe ser {double}")
    //invocación del método entoncesElResultado con el valor esperado proporcionado en la característica
    //el delta de 0.001 se utiliza para permitir una pequeña tolerancia en la comparación de números de punto flotante, ya que las operaciones matemáticas pueden introducir pequeñas imprecisiones.
    public void entoncesElResultado(double esperado) { assertEquals(esperado, resultado, 0.001); }
}