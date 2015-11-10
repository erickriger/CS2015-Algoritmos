package br.ufg.inf.es.construcao.algoritmo23;

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
public class Algoritmo23Test {

    public Algoritmo23Test() {
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
        Algoritmo23.somaDivisores(0);
    }
    
    @Test
    public void testSomaDivisores() {
        int n = 6;
        int expResult = 6;
        int result = Algoritmo23.somaDivisores(n);
        assertEquals(expResult, result);
    }

}