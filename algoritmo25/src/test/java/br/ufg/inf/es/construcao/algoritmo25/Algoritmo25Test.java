package br.ufg.inf.es.construcao.algoritmo25;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo25Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testXMenorQueZero() {
        int x = -1;
        int y = 1;
        Algoritmo25.divideSubtracoes(x, y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorOuIgualAZero() {
        int x = 0;
        int y = 0;
        Algoritmo25.divideSubtracoes(x, y);
    }
    
    @Test
    public void testDivideSubtracoesMultiplos() {
        int x = 16;
        int y = 4;
        int expResult = 4;
        int result = Algoritmo25.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSomasNaoMultiplos() {
        int x = 15;
        int y = 4;
        int expResult = 3;
        int result = Algoritmo25.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
}
