package br.ufg.inf.es.construcao.algoritmo2;

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
public class Algoritmo2Test {
    
    public Algoritmo2Test() {
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

    /**
     * Test of paridade method, of class Algoritmo2.
     */
    @Test
    public void testParidade() {
        int n = 0;
        boolean expResult = true;
        boolean result = Algoritmo2.paridade(n);
        assertEquals(expResult, result);
    }
    
}
