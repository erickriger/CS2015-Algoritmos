package br.ufg.inf.es.construcao.algoritmo40;

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
public class Algoritmo40Test {

    public Algoritmo40Test() {
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
    
    @Test
    public void testAtendeSomaFatoriais() {
        int n = 499;
        boolean expResult = false;
        boolean result = Algoritmo40.atendeSomaFatoriais(n);
        assertEquals(expResult, result);
    }

}