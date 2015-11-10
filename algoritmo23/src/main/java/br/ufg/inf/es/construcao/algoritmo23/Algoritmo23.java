package br.ufg.inf.es.construcao.algoritmo23;

import br.ufg.inf.es.construcao.algoritmo27.Algoritmo27;

/**
 * Soma de divisores.
 * @author eric
 */
public class Algoritmo23 {
    
    /**
     * Calcula a soma dos divisores do numero fornecido.
     * @param n Numero do qual se deseja obter a soma dos divisores.
     *          Deve ser maior que zero.
     * @return  A soma dos divisores.
     * @throws IllegalArgumentException Se o parametro for menor ou igual a zero.
     * @see Algoritmo27
     */
    public static int somaDivisores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O parametro deve ser maior que zero.");
        }
        
        int d = 2;
        int s = 1;
        
        while (d <= n / 2) {
            if (Algoritmo27.mod(n, d) == 0) {
                s = s + d;
            }
            d++;
        }
        
        return s;
    }
}
