package br.ufg.inf.es.construcao.algoritmo5;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo5Test {

    @Test(expected = IllegalArgumentException.class)
    public void testXMenorOuIgualAZero() {
        int x = 0;
        int y = 0;
        Algoritmo5.potencia(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testYMenorQueZero() {
        int x = 2;
        int y = -1;
        Algoritmo5.potencia(x, y);
    }

    @Test
    public void testPotencia() {
        int x = 2;
        int y = 3;
        int expResult = 8;
        int result = Algoritmo5.potencia(x, y);
        assertEquals(expResult, result);
    }

}
