package br.ufg.inf.es.construcao.algoritmo13;

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
public class Algoritmo13Test {
    
    public Algoritmo13Test() {
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
        int n = 0;
        Algoritmo13.numeroHarmonico(n);
    }

    @Test
    public void testNumeroHarmonico() {
        int n = 10;
        double expResult = 2.0;
        double result = Algoritmo13.numeroHarmonico(n);
        assertEquals(expResult, result, 0.5);
    }
    
}
