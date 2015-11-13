package br.ufg.inf.es.construcao.algoritmo33;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo33Test {

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoDiferenteDeOnze() {
        int[] digitos = new int[10];
        Algoritmo33.verificaCpf(digitos);
    }

    @Test
    public void testVerificaCpfInvalido() {
        int[] digitos = {2, 3, 5, 6, 7, 5, 5, 4, 4, 1, 1};
        boolean expResult = false;
        boolean result = Algoritmo33.verificaCpf(digitos);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerificaCpfValido() {
        int[] digitos = {7, 8, 6, 6, 4, 7, 3, 5, 4, 4, 1};
        boolean expResult = true;
        boolean result = Algoritmo33.verificaCpf(digitos);
        assertEquals(expResult, result);
    }

}
