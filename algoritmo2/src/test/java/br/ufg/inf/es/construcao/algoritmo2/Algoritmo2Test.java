package br.ufg.inf.es.construcao.algoritmo2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo2Test {
    
    @Test
    public void testParidadeTrue() {
        int n = 0;
        boolean expResult = true;
        boolean result = Algoritmo2.paridade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testParidadeFalse() {
        int n = 25;
        boolean expResult = false;
        boolean result = Algoritmo2.paridade(n);
        assertEquals(expResult, result);
    }
    
}
