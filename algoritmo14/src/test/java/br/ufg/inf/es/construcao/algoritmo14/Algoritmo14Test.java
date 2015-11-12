package br.ufg.inf.es.construcao.algoritmo14;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo14Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        int n = 0;
        Algoritmo14.somatorio(n);
    }
    
    @Test
    public void testSomatorio() {
        int n = 3;
        double expResult = 0.8;
        double result = Algoritmo14.somatorio(n);
        assertEquals(expResult, result, 0.3);
    }
    
}
