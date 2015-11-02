package br.ufg.inf.es.construcao.algoritmo14;

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
public class Algoritmo14Test {
    
    public Algoritmo14Test() {
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
        Algoritmo14.somatorio(n);
    }
    
    @Test
    public void testSomatorio() {
        int n = 3;
        double expResult = 0.8;
        double result = Algoritmo14.somatorio(n);
        assertEquals(expResult, result, 0.3);
    }
    
}
