package br.ufg.inf.es.construcao.algoritmo26;

import br.ufg.inf.es.construcao.algoritmo25.Algoritmo25;

/**
 * Mod Simples
 * @author eric
 */
public class Algoritmo26 {

    /**
     * Calcula o mod entre dois numeros, utilizando o metodo
     * divideSubtracoes do Algoritmo25.
     * @param x Primeiro numero, deve ser maior que zero.
     * @param y Segundo numero, deve ser maior que zero.
     * @return  O mod (resto da divisao).
     * @throws IllegalArgumentException Se os parametros forem menores ou iguais a zero.
     * @see Algoritmo25
     */
    public static int modSimples(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Os parametros devem ser maiores que zero.");
        }
        
        int divisao = Algoritmo25.divideSubtracoes(x, y);
        
        return x - divisao * y;
    }
}
