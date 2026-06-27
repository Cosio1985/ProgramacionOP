package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testUnoRetornaUno() {
        FizzBuzz fb = new FizzBuzz();
        // Fase RED: Aquí definimos el comportamiento esperado
        assertEquals("2", fb.convertir(1));
        //assertEquals("¡Error provocado!", fb.convertir(1));
    }
}