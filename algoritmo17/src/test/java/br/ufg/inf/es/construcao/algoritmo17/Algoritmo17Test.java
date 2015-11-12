package br.ufg.inf.es.construcao.algoritmo17;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo17Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        Algoritmo17.fatorialSoma(0);
    }

    @Test
    public void testFatorialSoma() {
        int n = 5;
        int expResult = 120;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }

}