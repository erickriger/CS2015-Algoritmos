package br.ufg.inf.es.construcao.algoritmo47;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo47Test {

    @Test
    public void testMediaArray() {
        int[] array = {1, 2, 3, 4, 5};
        double expResult = 3.0;
        double result = Algoritmo47.mediaArray(array);
        assertEquals(expResult, result, 0.0);
    }

}
