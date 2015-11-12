package br.ufg.inf.es.construcao.algoritmo30;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo30Test {

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoMenorQueUm() {
        int[] n = {};
        Algoritmo30.polSimples(10, n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testVetorUltimoElementoIgualZero() {
        int[] n = {3, 5, 0};
        Algoritmo30.polSimples(10, n);
    }
    
    @Test
    public void testPolSimples() {
        int x = 3;
        int[] a = {-12, 7, 2};
        int expResult = 27;
        int result = Algoritmo30.polSimples(x, a);
        assertEquals(expResult, result);
    }

}