package br.ufg.inf.es.construcao.algoritmo31;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo31Test {

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoMenorQueUm() {
        int[] n = {};
        Algoritmo31.polHorner(10, n);
    }
    
    @Test
    public void testPolHorner() {
        int x = 3;
        int[] a = {-12, 7, 2};
        int expResult = 27;
        int result = Algoritmo31.polHorner(x, a);
        assertEquals(expResult, result);
    }

}