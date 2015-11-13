package br.ufg.inf.es.construcao.algoritmo19;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Algoritmo19Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        Algoritmo19.logn(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKMenorQueDois() {
        Algoritmo19.logn(1, 1);
    }

    @Test
    public void testLogNatSimples() {
        int n = 1;
        int k = 2;
        double expResult = 2.0;
        double result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result, 0.5);
    }

}
