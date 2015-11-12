package br.ufg.inf.es.construcao.algoritmo46;

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
public class Algoritmo46Test {

    public Algoritmo46Test() {
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
    public void testSomaArray() {
        int[] array = {1,2,3,4,5};
        int expResult = 15;
        int result = Algoritmo46.somaArray(array);
        assertEquals(expResult, result);
    }

}