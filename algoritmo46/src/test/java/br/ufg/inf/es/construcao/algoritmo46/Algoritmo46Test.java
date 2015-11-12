package br.ufg.inf.es.construcao.algoritmo46;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo46Test {

    @Test
    public void testSomaArray() {
        int[] array = {1, 2, 3, 4, 5};
        int expResult = 15;
        int result = Algoritmo46.somaArray(array);
        assertEquals(expResult, result);
    }

}
