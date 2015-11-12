package br.ufg.inf.es.construcao.algoritmo45;

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
public class Algoritmo45Test {

    public Algoritmo45Test() {
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
    public void testImprimeArray() {
        int[] array = {1,2,3,4,5};
        Algoritmo45.imprimeArray(array);
    }

}