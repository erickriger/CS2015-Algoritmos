package br.ufg.inf.es.construcao.algoritmo43;

import org.junit.Test;

public class Algoritmo43Test {

    @Test
    public void testPermutacaoStringUmCaracter() {
        String prefixo = "";
        String s = "A";
        Algoritmo43.permutacao(prefixo, s);
    }
    
    @Test
    public void testPermutacao() {
        String prefixo = "";
        String s = "ABCD";
        Algoritmo43.permutacao(prefixo, s);
    }

}