package br.ufg.inf.es.construcao.algoritmo42;

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
public class Algoritmo42Test {

    public Algoritmo42Test() {
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
        Algoritmo42.somaNaturais(n);
    }

    @Test
    public void testSomaNaturaisNIgualAUm() {
        int n = 1;
        int expResult = 1;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaNaturaisNMaiorQueUm() {
        int n = 10;
        int expResult = 55;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }

}