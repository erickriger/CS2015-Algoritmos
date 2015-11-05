package br.ufg.inf.es.construcao.algoritmo42;

/**
 * Soma de naturais.
 * @author eric
 */
public class Algoritmo42 {

    /**
     * Calcula a soma dos n primeiros numeros naturais.
     * @param n Quantidade dos primeiros numeros a
     *          serem somados. Deve ser maior ou igual a um.
     * @return  Resultado da soma.
     * @throws IllegalArgumentException Se 'n' for menor que um.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a 1.");
        }
        
        if (n == 1) {
            return 1;
        } else {
            return somaNaturais(n - 1) + n;
        }
    }
}
