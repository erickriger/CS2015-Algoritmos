package br.ufg.inf.es.construcao.algoritmo47;

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
public class Algoritmo47Test {

    public Algoritmo47Test() {
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
    public void testMediaArray() {
        int[] array = {1,2,3,4,5};
        double expResult = 3.0;
        double result = Algoritmo47.mediaArray(array);
        assertEquals(expResult, result, 0.0);
    }

}