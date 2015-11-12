package br.ufg.inf.es.construcao.algoritmo21;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo21Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testKMenorQueUm() {
        int k = 0;
        Algoritmo21.quadradoPerfeito(k);
    }

    @Test
    public void testQuadradoPerfeitoTrue() {
        int k = 16;
        boolean expResult = true;
        boolean result = Algoritmo21.quadradoPerfeito(k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadradoPerfeitoFalse() {
        int k = 10;
        boolean expResult = false;
        boolean result = Algoritmo21.quadradoPerfeito(k);
        assertEquals(expResult, result);
    }
    
}
