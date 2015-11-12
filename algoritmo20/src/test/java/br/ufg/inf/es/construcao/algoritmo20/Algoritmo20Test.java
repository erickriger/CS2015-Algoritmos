package br.ufg.inf.es.construcao.algoritmo20;

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
public class Algoritmo20Test {

    public Algoritmo20Test() {
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
    public void testPrimeiroMenorOuIgualAZero() {
        Algoritmo20.razaoAurea(0, 1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoMenorOuIgualPrimeiro() {
        Algoritmo20.razaoAurea(10, 10, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFatorMenorOuIgualAZero() {
        Algoritmo20.razaoAurea(10, 15, 0);
    }
    
    @Test
    public void testRazaoAurea() {
        int termo1 = 20;
        int termo2 = 35;
        int fator = 11;
        double expResult = 1.6;
        double result = Algoritmo20.razaoAurea(termo1, termo2, fator);
        assertEquals(expResult, result, 0.1);
    }

}