package br.ufg.inf.es.construcao.algoritmo21;

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
public class Algoritmo21Test {
    
    public Algoritmo21Test() {
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
    public void testKMenorQueUm() {
        int k = 0;
        Algoritmo21.quadradoPerfeito(k);
    }

    @Test
    public void testQuadradoPerfeitoTrue() {
        int k = 16;
        boolean expResult = true;
        boolean result = Algoritmo21.quadradoPerfeito(k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadradoPerfeitoFalse() {
        int k = 10;
        boolean expResult = false;
        boolean result = Algoritmo21.quadradoPerfeito(k);
        assertEquals(expResult, result);
    }
    
}
