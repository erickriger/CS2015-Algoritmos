package br.ufg.inf.es.construcao.algoritmo4;

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
public class Algoritmo4Test {
    
    public Algoritmo4Test() {
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
    public void testAMenorQueZero() {
        int a = -1;
        int b = 0;
        Algoritmo4.produto(a, b);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBMenorQueZero() {
        int a = 0;
        int b = -1;
        Algoritmo4.produto(a, b);
    }
    
    /**
     * Test of produto method, of class Algoritmo4.
     */
    @Test
    public void testProduto() {
        int a = 5;
        int b = 5;
        int expResult = 25;
        int result = Algoritmo4.produto(a, b);
        assertEquals(expResult, result);
    }
    
}
