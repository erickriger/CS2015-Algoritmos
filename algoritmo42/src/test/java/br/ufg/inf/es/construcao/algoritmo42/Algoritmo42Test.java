package br.ufg.inf.es.construcao.algoritmo42;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo42Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQueUm() {
        int n = 0;
        Algoritmo42.somaNaturais(n);
    }

    @Test
    public void testSomaNaturaisNIgualAUm() {
        int n = 1;
        int expResult = 1;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaNaturaisNMaiorQueUm() {
        int n = 10;
        int expResult = 55;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }

}