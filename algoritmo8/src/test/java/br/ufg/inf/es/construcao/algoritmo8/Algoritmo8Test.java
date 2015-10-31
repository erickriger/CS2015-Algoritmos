package br.ufg.inf.es.construcao.algoritmo8;

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
public class Algoritmo8Test {
    
    public Algoritmo8Test() {
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
        Algoritmo8.propriedade153(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMaiorQue999() {
        int n = 1000;
        Algoritmo8.propriedade153(n);
    }
    
    @Test
    public void testPropriedade153() {
        int n = 153;
        boolean expResult = true;
        boolean result = Algoritmo8.propriedade153(n);
        assertEquals(expResult, result);
    }
    
}
