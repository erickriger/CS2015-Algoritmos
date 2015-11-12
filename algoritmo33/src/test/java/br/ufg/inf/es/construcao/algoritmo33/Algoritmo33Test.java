package br.ufg.inf.es.construcao.algoritmo33;

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
public class Algoritmo33Test {

    public Algoritmo33Test() {
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
    public void testVetorTamanhoDiferenteDe11() {
        int[] digitos = new int[10];
        Algoritmo33.verificaCpf(digitos);
    }
    
    @Test
    public void testVerificaCpfInvalido() {
        int[] digitos = {2,3,5,6,7,5,5,4,4,1,1};
        boolean expResult = false;
        boolean result = Algoritmo33.verificaCpf(digitos);
        assertEquals(expResult, result);
    }

}