package br.ufg.inf.es.construcao.algoritmo48;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo48Test {

    @Test
    public void testBubbleSort() {
        int[] array = {5, 9, 1, 1, 7, 2, 6, 8, 7};
        int[] expResult = {1, 1, 2, 5, 6, 7, 7, 8, 9};
        int[] result = Algoritmo48.bubbleSort(array);
        assertArrayEquals(expResult, result);
    }

}
