package br.ufg.inf.es.construcao.algoritmo10;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo10Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQue2() {
        Algoritmo10.crivoEratostenes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoInvalido() {
        int[] a = new int[1];
        Algoritmo10.crivoEratostenes(a, 2);
    }

    @Test
    public void testSeDoisEPrimo() {
        int[] a = new int[3];
        Algoritmo10.crivoEratostenes(a, 2);
        Assert.assertEquals(0, a[2]);
    }

    @Test
    public void testSeNoveNaoEPrimo() {
        int[] a = new int[10];
        Algoritmo10.crivoEratostenes(a, 9);
        Assert.assertEquals(1, a[9]);
    }

    @Test
    public void testSeCemNaoEPrimo() {
        int[] a = new int[101];
        Algoritmo10.crivoEratostenes(a, 100);
        Assert.assertEquals(1, a[100]);
        Assert.assertEquals(0, a[17]);
        Assert.assertEquals(0, a[31]);
    }
    
}
