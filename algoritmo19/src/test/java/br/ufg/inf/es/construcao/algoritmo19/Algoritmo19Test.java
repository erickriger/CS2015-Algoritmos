package br.ufg.inf.es.construcao.algoritmo19;

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
    
//    @Test
//    public void testLogn() {
//        int n = 2;
//        int k = 20;
//        double expResult = 0.69;
//        double result = Algoritmo19.logn(n, k);
//        assertEquals(expResult, result, 0.0);
//    }

}