package br.ufg.inf.es.construcao.algoritmo45;

/**
 * Impressao de Arrays.
 * @author eric
 */
public class Algoritmo45 {

    /**
     * Imprime um array de numeros na tela.
     * @param array Array para ser impresso.
     * @throws IllegalArgumentException Se o array tiver tamanho menor que zero.
     */
    public static void imprimeArray(int[] array) {
        
        int i = 1;
        
        while (i <= array.length - 1) {
            System.out.println(array[i]);
            i++;
        }
    }
}
