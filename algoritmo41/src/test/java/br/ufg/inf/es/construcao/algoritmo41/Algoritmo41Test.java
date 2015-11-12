package br.ufg.inf.es.construcao.algoritmo41;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo41Test {

    @Test(expected = IllegalArgumentException.class)
    public void testStringVazia() {        
        Algoritmo41.inverteCaracteres("");
    }
    
    @Test
    public void testStringComUmCaracter() {
        String s = "A";
        assertEquals("A", s);
    }

    @Test
    public void testInverteCaracteres() {
        String s = "Teste";
        String expResult = "etseT";
        String result = Algoritmo41.inverteCaracteres(s);
        assertEquals(expResult, result);
    }

}