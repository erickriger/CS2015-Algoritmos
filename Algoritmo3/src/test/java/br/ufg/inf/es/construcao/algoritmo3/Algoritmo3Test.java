package br.ufg.inf.es.construcao.algoritmo3;

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
public class Algoritmo3Test {
    
    public Algoritmo3Test() {
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
        Algoritmo3.somaNaturais(n);
    }
    
    @Test
    public void testSomaNaturais() {
        int n = 10;
        int expResult = 55;
        int result = Algoritmo3.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
}
