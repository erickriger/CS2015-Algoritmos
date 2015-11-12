package br.ufg.inf.es.construcao.algoritmo46;

/**
 * Soma de Array.
 * @author eric
 */
public class Algoritmo46 {

    /**
     * Soma todos os elementos contidos em um array.
     * @param array Array a ser somado.
     * @return      A soma dos elementos do array.
     */
    public static int somaArray(int[] array) {
        
        int soma = 0;
        int i = 0;
        
        while (i <= array.length - 1) {
            soma += array[i];
            i++;
        }
        
        return soma;
    }
}
