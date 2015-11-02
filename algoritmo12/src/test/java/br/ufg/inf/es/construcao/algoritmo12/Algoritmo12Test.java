package br.ufg.inf.es.construcao.algoritmo12;

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
public class Algoritmo12Test {
    
    public Algoritmo12Test() {
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
    public void testAMenorQueB() {
        int a = 10;
        int b = 12;
        Algoritmo12.mdc2(a, b);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBMenorOuIgualAZero() {
        int a = 10;
        int b = 0;
        Algoritmo12.mdc2(a, b);
    }
    
    @Test
    public void testMdcNumerosIguais() {
        int a = 10;
        int b = 10;
        int expResult = 10;
        int result = Algoritmo12.mdc2(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMdcNumerosDiferentes() {
        int a = 15;
        int b = 10;
        int expResult = 5;
        int result = Algoritmo12.mdc2(a, b);
        assertEquals(expResult, result);
    }
    
}
