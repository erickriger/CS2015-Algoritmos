package br.ufg.inf.es.construcao.algoritmo35;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo35Test {

    @Test(expected = IllegalArgumentException.class)
    public void testVetorMenorQueDuasPosicoes() {
        int[] n = {0};
        Algoritmo35.luhn(n);
    }
    
    @Test(expected = NullPointerException.class)
    public void testVetorNull() {
        int[] n = null;
        Algoritmo35.luhn(n);
    }
    
    @Test
    public void testLuhn() {
        int[] n = {2, 5, 8, 4};
        int expResult = 3;
        int result = Algoritmo35.luhn(n);
        assertEquals(expResult, result);
    }

}