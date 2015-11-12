package br.ufg.inf.es.construcao.algoritmo7;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo7Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueZero() {
        int n = -1;
        Algoritmo7.propriedade3025(n);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNMaiorQue9999() {
        int n = 10000;
        Algoritmo7.propriedade3025(n);
    }

    @Test
    public void testPropriedade3025() {
        int n = 3025;
        boolean expResult = true;
        boolean result = Algoritmo7.propriedade3025(n);
        assertEquals(expResult, result);
    }

}
