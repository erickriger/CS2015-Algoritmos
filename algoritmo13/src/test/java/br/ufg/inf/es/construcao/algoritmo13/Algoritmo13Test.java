package br.ufg.inf.es.construcao.algoritmo13;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo13Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        int n = 0;
        Algoritmo13.numeroHarmonico(n);
    }

    @Test
    public void testNumeroHarmonico() {
        int n = 10;
        double expResult = 1.0;
        double result = Algoritmo13.numeroHarmonico(n);
        assertEquals(expResult, result, 0.1);
    }
    
}
