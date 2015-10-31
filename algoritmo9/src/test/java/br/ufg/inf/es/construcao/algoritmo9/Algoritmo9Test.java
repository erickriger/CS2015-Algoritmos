package br.ufg.inf.es.construcao.algoritmo9;

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
public class Algoritmo9Test {
    
    public Algoritmo9Test() {
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
    public void testNMenorOuIgualAUm() {
        int n = 1;
        Algoritmo9.primo(n);
    }
    
    @Test
    public void testPrimo() {
        int n = 7;
        boolean expResult = true;
        boolean result = Algoritmo9.primo(n);
        assertEquals(expResult, result);
    }
    
}
