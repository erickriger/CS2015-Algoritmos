package br.ufg.inf.es.construcao.algoritmo18;

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
public class Algoritmo18Test {

    public Algoritmo18Test() {
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
        Algoritmo18.logNatSimples(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testKMenorQueDois() {
        Algoritmo18.logNatSimples(1, 1);
    }
    
//    @Test
//    public void testLogNatSimples() {
//        int n = 2;
//        int k = 20;
//        double expResult = 0.69;
//        double result = Algoritmo18.logNatSimples(n, k);
//        assertEquals(expResult, result, 0.0);
//    }

}