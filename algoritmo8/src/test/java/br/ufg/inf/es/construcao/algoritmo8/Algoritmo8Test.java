package br.ufg.inf.es.construcao.algoritmo8;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo8Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueZero() {
        int n = -1;
        Algoritmo8.propriedade153(n);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNMaiorQue999() {
        int n = 1000;
        Algoritmo8.propriedade153(n);
    }

    @Test
    public void testPropriedade153() {
        int n = 153;
        boolean expResult = true;
        boolean result = Algoritmo8.propriedade153(n);
        assertEquals(expResult, result);
    }

}
