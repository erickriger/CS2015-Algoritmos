package br.ufg.inf.es.construcao.algoritmo22;

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
public class Algoritmo22Test {

    public Algoritmo22Test() {
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
    public void testNMenorOuIgualAZero() {
        Algoritmo22.amigos(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMMenorOuIgualAZero() {
        Algoritmo22.amigos(1, 0);
    }
    
    @Test
    public void testAmigosFalse() {
        int n = 70;
        int m = 149;
        boolean expResult = false;
        boolean result = Algoritmo22.amigos(n, m);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAmigosTrue() {
        int n = 220;
        int m = 284;
        boolean expResult = true;
        boolean result = Algoritmo22.amigos(n, m);
        assertEquals(expResult, result);
    }

}