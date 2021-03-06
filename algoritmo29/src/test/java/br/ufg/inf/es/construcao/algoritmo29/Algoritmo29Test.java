package br.ufg.inf.es.construcao.algoritmo29;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo29Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorOuIgualAZero() {
        int n = 0;
        int i = 2;
        Algoritmo29.raiz(n, i);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIndiceMenorQueZero() {
        int n = 2;
        int i = -1;
        Algoritmo29.raiz(n, i);
    }
    
    @Test
    public void testRaizQuadradaPerfeita() {
        double n = 16;
        int i = 2;
        double expResult = 4.0;
        double result = Algoritmo29.raiz(n, i);
        assertEquals(expResult, result, 0.9);
    }
    
    @Test
    public void testRaizQuadradaImperfeita() {
        double n = 15;
        int i = 2;
        double expResult = 3.87;
        double result = Algoritmo29.raiz(n, i);
        assertEquals(expResult, result, 0.9);
    }    
    
}
