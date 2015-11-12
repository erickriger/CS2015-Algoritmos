package br.ufg.inf.es.construcao.algoritmo31;

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
public class Algoritmo31Test {

    public Algoritmo31Test() {
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