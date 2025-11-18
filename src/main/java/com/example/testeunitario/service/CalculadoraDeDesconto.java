package com.example.testeunitario.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraDeDesconto {
    public double aplicarDesconto(double valor, double percentual){
        return valor - (valor * percentual / 100.0);
    }

}
