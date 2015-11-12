package br.ufg.inf.es.construcao.algoritmo26;

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
public class Algoritmo26Test {

    public Algoritmo26Test() {
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
    public void testXMenorOuIgualAZero() {
        Algoritmo26.modSimples(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorOuIgualAZero() {
        Algoritmo26.modSimples(1, 0);
    }
    
    @Test
    public void testModSimples() {
        int x = 5;
        int y = 2;
        int expResult = 1;
        int result = Algoritmo26.modSimples(x, y);
        assertEquals(expResult, result);
    }

}