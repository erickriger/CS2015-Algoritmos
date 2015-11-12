package br.ufg.inf.es.construcao.algoritmo41;

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
public class Algoritmo41Test {

    public Algoritmo41Test() {
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
    public void testStringVazia() {        
        Algoritmo41.inverteCaracteres("");
    }
    
    @Test
    public void testStringComUmCaracter() {
        String s = "A";
        assertEquals("A", s);
    }

    @Test
    public void testInverteCaracteres() {
        String s = "Teste";
        String expResult = "etseT";
        String result = Algoritmo41.inverteCaracteres(s);
        assertEquals(expResult, result);
    }

}