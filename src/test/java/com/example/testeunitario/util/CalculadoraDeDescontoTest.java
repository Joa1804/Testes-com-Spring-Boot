package com.example.testeunitario.util;

import org.junit.jupiter.api.Test;

import com.example.testeunitario.service.CalculadoraDeDesconto;

public class CalculadoraDeDescontoTest {
    @Test
    void testAplicarDesconto() {

        CalculadoraDeDesconto calc  = new CalculadoraDeDesconto();

        double resultado  = calc.aplicarDesconto(200.0, 25.0);

        org.junit.jupiter.api.Assertions.assertEquals(150.0, resultado, 0.001);
    }
}
