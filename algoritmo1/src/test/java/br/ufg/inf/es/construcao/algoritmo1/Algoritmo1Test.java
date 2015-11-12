package br.ufg.inf.es.construcao.algoritmo1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo1Test {

    @Test(expected = IllegalArgumentException.class)
    public void testDiaMenorQueUm() {
        int d = 0;
        int m = 1;
        int a = 1753;
        Algoritmo1.diaSemana(d, m, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaMaiorQue31() {
        int d = 32;
        int m = 1;
        int a = 1753;
        Algoritmo1.diaSemana(d, m, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesMenorQueUm() {
        int d = 1;
        int m = 0;
        int a = 1753;
        Algoritmo1.diaSemana(d, m, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesMaiorQue12() {
        int d = 1;
        int m = 13;
        int a = 1753;
        Algoritmo1.diaSemana(d, m, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnoMenorQue1753() {
        int d = 1;
        int m = 1;
        int a = 1752;
        Algoritmo1.diaSemana(d, m, a);
    }

    @Test
    public void testDiaSemana() {
        int d = 26;
        int m = 12;
        int a = 2015;
        double expResult = 5.0;
        double result = Algoritmo1.diaSemana(d, m, a);
        assertEquals(expResult, result, 0.0);
    }
    
}
