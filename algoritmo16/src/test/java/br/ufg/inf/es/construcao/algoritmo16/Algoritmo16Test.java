package br.ufg.inf.es.construcao.algoritmo16;

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
public class Algoritmo16Test {
    
    public Algoritmo16Test() {
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
        Algoritmo16.fatorial(n);
    }
    
    @Test
    public void testFatorial() {
        int n = 5;
        int expResult = 120;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
}
