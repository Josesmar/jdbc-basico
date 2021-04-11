package com.teste;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraNovaTeste {

    @Test
    public void deveSomarDoisValores(){
        int valorA = 1;
        int valorB = 2;
        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(2,1);
        assertEquals(3,soma);
    }
    @Test
    public void deveSomarTresValores(){
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;
        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valorA,valorB,valorC);
        assertEquals(6,soma);
    }
}
