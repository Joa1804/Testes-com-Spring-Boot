package com.example.testeunitario.util;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.testeunitario.service.CalculadoraDeDesconto;

public class test {
    @Test
    void deveLancarExececaoQuandoValoresNegativos(){
        CalculadoraDeDesconto calc = new CalculadoraDeDesconto();

        assertThrows(IllegalArgumentException.class,() ->{
            calc.aplicarDesconto(-100.0, 10.0);
        });
    }

}
