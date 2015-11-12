package br.ufg.inf.es.construcao.algoritmo38;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo38Test {
    
    @Test
    public void testHipotenusa() {
        double cateto1 = 3.0;
        double cateto2 = 4.0;
        double expResult = 5.0;
        double result = Algoritmo38.hipotenusa(cateto1, cateto2);
        assertEquals(expResult, result, 0.0);
    }

}