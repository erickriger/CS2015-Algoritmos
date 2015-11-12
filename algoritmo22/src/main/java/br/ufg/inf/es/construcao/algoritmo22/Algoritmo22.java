package br.ufg.inf.es.construcao.algoritmo22;

import br.ufg.inf.es.construcao.algoritmo23.Algoritmo23;

/**
 * Numeros Amigos.
 * @author eric
 */
public class Algoritmo22 {

    /**
     * Verifica se dois numeros sao amigos.
     * M e N sao amigos se a soma dos divisores de M for igual a N,
     * e a soma dos divisores de N for igual a M.
     * @param n Primeiro numero, deve ser maior que 0.
     * @param m Segundo numero, deve ser maior que 0.
     * @return  true se os numeros forem amigos,
     *          false se os numeros nao forem amigos.
     * @throws IllegalArgumentException Se os parametros forem menores ou iguais a zero.
     * @see Algoritmo23
     */
    public static boolean amigos(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("Ambos os parametros devem ser maiores que zero.");
        }
        
        int somaN = Algoritmo23.somaDivisores(n);
        int somaM = Algoritmo23.somaDivisores(m);
        
        return somaN == m && somaM == n;
    }
}
