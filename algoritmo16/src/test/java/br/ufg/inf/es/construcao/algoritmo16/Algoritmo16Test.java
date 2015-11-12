package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo16Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        int n = 0;
        Algoritmo16.fatorial(n);
    }
    
    @Test
    public void testFatorial() {
        int n = 5;
        int expResult = 120;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
}
