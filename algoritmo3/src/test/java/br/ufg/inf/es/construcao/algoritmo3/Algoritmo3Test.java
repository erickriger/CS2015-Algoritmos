package br.ufg.inf.es.construcao.algoritmo3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo3Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        int n = 0;
        Algoritmo3.somaNaturais(n);
    }
    
    @Test
    public void testSomaNaturais() {
        int n = 10;
        int expResult = 55;
        int result = Algoritmo3.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
}
