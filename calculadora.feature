    Feature: Calcular impuestos
    Scenario: Calcular impuesto para monto mayor a 1000
    Given un monto de 1200
    When calculo el impuesto
    Then el resultado debe ser 1392 