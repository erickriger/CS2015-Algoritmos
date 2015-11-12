package br.ufg.inf.es.construcao.algoritmo48;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eric
 */
public class Algoritmo48Test {

    public Algoritmo48Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testBubbleSort() {
        int[] array = {5, 9, 1, 1, 7, 2, 6, 8, 7};
        int[] expResult = {1, 1, 2, 5, 6, 7, 7, 8, 9};
        int[] result = Algoritmo48.bubbleSort(array);
        assertArrayEquals(expResult, result);
    }

}