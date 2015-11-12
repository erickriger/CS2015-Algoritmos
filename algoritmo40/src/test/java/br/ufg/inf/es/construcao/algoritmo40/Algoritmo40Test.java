package br.ufg.inf.es.construcao.algoritmo40;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo40Test {

    @Test
    public void testAtendeSomaFatoriais() {
        int n = 499;
        boolean expResult = false;
        boolean result = Algoritmo40.atendeSomaFatoriais(n);
        assertEquals(expResult, result);
    }

}