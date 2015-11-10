package br.ufg.inf.es.construcao.algoritmo6;

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
public class Algoritmo6Test {

    public Algoritmo6Test() {
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
    public void testXMenorOuIgualaZero() {
        Algoritmo6.potenciaSoma(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorQueUm() {
        Algoritmo6.potenciaSoma(2, 0);
    }
    
    @Test
    public void testPotenciaSoma() {
        int x = 2;
        int y = 3;
        int expResult = 8;
        int result = Algoritmo6.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }

}