package br.ufg.inf.es.construcao.algoritmo32;

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
public class Algoritmo32Test {
    
    public Algoritmo32Test() {
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
    public void testNMenorQueZero() {
        int n = -1;
        Algoritmo32.fibonacci(n);
    }
    
    @Test
    public void testFibonacciZero() {
        int n = 0;
        int expResult = 0;
        int result = Algoritmo32.fibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibonacciUm() {
        int n = 1;
        int expResult = 1;
        int result = Algoritmo32.fibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibonacciDois() {
        int n = 2;
        int expResult = 1;
        int result = Algoritmo32.fibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibonacciMaiorQueDois() {
        int n = 10;
        int expResult = 55;
        int result = Algoritmo32.fibonacci(n);
        assertEquals(expResult, result);
    }
    
}
