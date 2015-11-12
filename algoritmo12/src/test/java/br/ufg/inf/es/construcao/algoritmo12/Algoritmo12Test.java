package br.ufg.inf.es.construcao.algoritmo12;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo12Test {

    @Test(expected = IllegalArgumentException.class)
    public void testAMenorQueB() {
        int a = 10;
        int b = 12;
        Algoritmo12.mdc(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBMenorOuIgualAZero() {
        int a = 10;
        int b = 0;
        Algoritmo12.mdc(a, b);
    }

    @Test
    public void testMdcNumerosIguais() {
        int a = 10;
        int b = 10;
        int expResult = 10;
        int result = Algoritmo12.mdc(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMdcNumerosDiferentes() {
        int a = 15;
        int b = 10;
        int expResult = 5;
        int result = Algoritmo12.mdc(a, b);
        assertEquals(expResult, result);
    }
    
}
