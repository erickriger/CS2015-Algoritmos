package br.ufg.inf.es.construcao.algoritmo38;

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
public class Algoritmo38Test {

    public Algoritmo38Test() {
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
    public void testHipotenusa() {
        double cateto1 = 3.0;
        double cateto2 = 4.0;
        double expResult = 5.0;
        double result = Algoritmo38.hipotenusa(cateto1, cateto2);
        assertEquals(expResult, result, 0.0);
    }

}