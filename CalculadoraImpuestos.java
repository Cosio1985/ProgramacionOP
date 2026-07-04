package com.ejemplo;

public class CalculadoraImpuestos {
    
    private static final double UMBRAL = 1000.0;
    private static final double IVA = 1.16;

    public double calcular(double monto) {
        // Implementación mínima para pasar los tests
        return (monto > UMBRAL) ? monto * IVA : monto;
        // condición ternaria para decidir si aplicar el IVA o no
        // si la condición es verdadera, se aplica el IVA; si es falsa, se devuelve el monto original
    }
}