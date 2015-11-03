package br.ufg.inf.es.construcao.algoritmo21;

/**
 * Quadrado Perfeito.
 * @author eric
 */
public class Algoritmo21 {

    /**
     * Informa se um quadrado é perfeito, ou seja, se a raiz 
     * de sua area 'k' é a quantidade de numeros impares, a partir
     * do 1, consecutivos, cuja soma é a propria area 'k'.
     * @param k A area do quadrado, deve ser maior ou igual a 1.
     * @return  true, se o quadrado for perfeito,
     *          false, se o quadrado nao for perfeito.
     * @throws IllegalArgumentException Se o 'k' for invalido.
     */
    public static boolean quadradoPerfeito(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("O 'k' deve ser maior ou igual a 1.");
        }
        
        int i = 1;
        int q = 1; // quadrado perfeito
        
        while (q < k) {
            i = i + 2;
            q = q + i;
        }
        
        return q == k;
    }
}
