package br.ufg.inf.es.construcao.algoritmo23;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo23Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorOuIgualAZero() {
        Algoritmo23.somaDivisores(0);
    }
    
    @Test
    public void testSomaDivisores() {
        int n = 6;
        int expResult = 6;
        int result = Algoritmo23.somaDivisores(n);
        assertEquals(expResult, result);
    }

}