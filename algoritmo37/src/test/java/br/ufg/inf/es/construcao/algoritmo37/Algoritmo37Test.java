package br.ufg.inf.es.construcao.algoritmo37;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo37Test {

    @Test(expected = IllegalArgumentException.class)
    public void testXMenorQueZero() {
        long x = -1L;
        long y = 0L;
        Algoritmo37.ackermann(x, y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorQueZero() {
        long x = 0L;
        long y = -1L;
        Algoritmo37.ackermann(x, y);
    }

    @Test
    public void testAckermannXIgualAZero() {
        long x = 0L;
        long y = 2L;
        long expResult = 3L;
        long result = Algoritmo37.ackermann(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAckermannYIgualAZero() {
        long x = 3L;
        long y = 0L;
        long expResult = 5L;
        long result = Algoritmo37.ackermann(x, y);
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testAckermannXeYMaioresQueZero() {
        long x = 3L;
        long y = 2L;
        long expResult = 29L;
        long result = Algoritmo37.ackermann(x, y);
        assertEquals(expResult, result);
    }

}
