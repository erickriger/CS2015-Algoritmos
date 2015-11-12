package br.ufg.inf.es.construcao.algoritmo19;

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
public class Algoritmo19Test {

    public Algoritmo19Test() {
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
    public void testNMenorQueUm() {
        Algoritmo19.logn(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testKMenorQueDois() {
        Algoritmo19.logn(1, 1);
    }
    
//    @Test
//    public void testLogn() {
//        int n = 2;
//        int k = 20;
//        double expResult = 0.69;
//        double result = Algoritmo19.logn(n, k);
//        assertEquals(expResult, result, 0.0);
//    }

}