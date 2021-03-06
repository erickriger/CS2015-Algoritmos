package br.ufg.inf.es.construcao.algoritmo27;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo27Test {

    @Test(expected = IllegalArgumentException.class)
    public void testXMenorOuIgualAZero() {
        int x = 0;
        int y = 0;
        Algoritmo27.mod(x, y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorQueZero() {
        int x = 1;
        int y = -1;
        Algoritmo27.mod(x, y);
    }
    
    @Test
    public void testModMultiplos() {
        int x = 16;
        int y = 4;
        int expResult = 0;
        int result = Algoritmo27.mod(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testModNaoMultiplos() {
        int x = 15;
        int y = 4;
        int expResult = 3;
        int result = Algoritmo27.mod(x, y);
        assertEquals(expResult, result);
    }
    
}
