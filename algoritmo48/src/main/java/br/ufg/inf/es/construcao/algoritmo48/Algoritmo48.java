package br.ufg.inf.es.construcao.algoritmo48;

/**
 * Bubble Sort.
 * @author eric
 */
public class Algoritmo48 {

    /**
     * Ordena um vetor de numeros utilizando a tecnica bubble sort.
     * @param array O vetor a ser ordenado. Deve conter zero ou mais elementos.
     * @return      O vetor ordenado.
     * @throws IllegalArgumentException Se o vetor tiver menos de zero elementos.
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length < 0) {
            throw new IllegalArgumentException("O vetor deve conter 0 ou mais posicoes.");
        }
        
        int p = array.length - 1;
        
        while (p >= 0) {
            int i = 0;
            
            while (i < p) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                
                i++;
            }
            
            p--;
        }
        
        return array;
    }
}
