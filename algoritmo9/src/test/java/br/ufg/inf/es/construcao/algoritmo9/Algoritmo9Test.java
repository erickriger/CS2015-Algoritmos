package br.ufg.inf.es.construcao.algoritmo9;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo9Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorOuIgualAUm() {
        int n = 1;
        Algoritmo9.primo(n);
    }

    @Test
    public void testPrimo() {
        int n = 7;
        boolean expResult = true;
        boolean result = Algoritmo9.primo(n);
        assertEquals(expResult, result);
    }

}
