package br.ufg.inf.es.construcao.algoritmo18;

import org.junit.Test;

public class Algoritmo18Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        Algoritmo18.logNatSimples(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testKMenorQueDois() {
        Algoritmo18.logNatSimples(1, 1);
    }
    
//    @Test
//    public void testLogNatSimples() {
//        int n = 2;
//        int k = 20;
//        double expResult = 0.69;
//        double result = Algoritmo18.logNatSimples(n, k);
//        assertEquals(expResult, result, 0.0);
//    }

}