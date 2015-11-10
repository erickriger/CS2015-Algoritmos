package br.ufg.inf.es.construcao.algoritmo17;

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
public class Algoritmo17Test {

    public Algoritmo17Test() {
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
        Algoritmo17.fatorialSoma(0);
    }

    @Test
    public void testFatorialSoma() {
        int n = 5;
        int expResult = 120;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }

}