package br.ufg.inf.es.construcao.algoritmo14;

/**
 * Calculo de um somatorio.
 * @author eric
 */
public class Algoritmo14 {
    
    /**
     * Calcula o somatorio de 1 / (1 + i ^ 2), por n vezes.
     * @param n Numero de somas, deve ser maior ou igual a 1. 
     * @return  O resultado da somatoria.
     */
    public static double somatorio(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a 1.");
        }
        
        int i = 1;
        double s = 0;
        double d;
        while (i <= n) {
            d = 1 + i * i;
            s = s + 1 / d;
            i++;
        }
        
        return s;
    }
}
