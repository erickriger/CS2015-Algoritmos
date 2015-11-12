package br.ufg.inf.es.construcao.algoritmo4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo4Test {

    @Test(expected = IllegalArgumentException.class)
    public void testAMenorQueZero() {
        int a = -1;
        int b = 0;
        Algoritmo4.produto(a, b);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBMenorQueZero() {
        int a = 0;
        int b = -1;
        Algoritmo4.produto(a, b);
    }

    @Test
    public void testProduto() {
        int a = 5;
        int b = 5;
        int expResult = 25;
        int result = Algoritmo4.produto(a, b);
        assertEquals(expResult, result);
    }
    
}
