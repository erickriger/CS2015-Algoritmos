package br.ufg.inf.es.construcao.algoritmo21;

/**
 * Quadrado Perfeito.
 *
 * @author eric
 */
public class Algoritmo21 {

    /**
     * Informa se um quadrado é perfeito, ou seja, se a raiz de sua area é 
     * a quantidade de numeros impares, a partir do 1, consecutivos, cuja soma 
     * é a propria area.
     *
     * @param area A area do quadrado, deve ser maior ou igual a 1.
     * @return true, se o quadrado for perfeito, false, se o quadrado nao for
     * perfeito.
     * @throws IllegalArgumentException Se o 'k' for invalido.
     */
    public static boolean quadradoPerfeito(int area) {
        if (area < 1) {
            throw new IllegalArgumentException("A area deve ser "
                    + "maior ou igual a 1.");
        }

        int i = 1;
        int quadrado = 1;

        while (quadrado < area) {
            i = i + 2;
            quadrado = quadrado + i;
        }

        return quadrado == area;
    }
}
