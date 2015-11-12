package br.ufg.inf.es.construcao.algoritmo35;

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
public class Algoritmo35Test {

    public Algoritmo35Test() {
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
    public void testVetorMenorQueDuasPosicoes() {
        int[] n = {0};
        Algoritmo35.luhn(n);
    }
    
    @Test(expected = NullPointerException.class)
    public void testVetorNull() {
        int[] n = null;
        Algoritmo35.luhn(n);
    }
    
    @Test
    public void testLuhn() {
        int[] n = {2, 5, 8, 4};
        int expResult = 3;
        int result = Algoritmo35.luhn(n);
        assertEquals(expResult, result);
    }

}