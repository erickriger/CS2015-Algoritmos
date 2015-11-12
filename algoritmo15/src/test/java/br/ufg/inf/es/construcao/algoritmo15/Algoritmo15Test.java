package br.ufg.inf.es.construcao.algoritmo15;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo15Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        int n = 0;
        Algoritmo15.pi(n);
    }
    
    @Test
    public void testPiPara1() {
        int n = 1;
        double expResult = 3.1;
        double result = Algoritmo15.pi(n);
        assertEquals(expResult, result, 0.9);
    }
    
    @Test
    public void testPi() {
        int n = 10;
        double expResult = 3.1;
        double result = Algoritmo15.pi(n);
        assertEquals(expResult, result, 0.9);
    }
    
}
