package br.ufg.inf.es.construcao.algoritmo47;

import br.ufg.inf.es.construcao.algoritmo46.Algoritmo46;

/**
 * Media do Array.
 *
 * @author eric
 */
public class Algoritmo47 {

    /**
     * Calcula a media entre os elementos de um array.
     *
     * @param array Array a ter a media calculada.
     * @return A media dos elementos do array.
     */
    public static double mediaArray(int[] array) {

        int soma = Algoritmo46.somaArray(array);

        return soma / array.length;
    }
}
