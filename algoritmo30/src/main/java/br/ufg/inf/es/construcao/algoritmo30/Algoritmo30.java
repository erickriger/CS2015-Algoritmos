package br.ufg.inf.es.construcao.algoritmo30;

import br.ufg.inf.es.construcao.algoritmo5.Algoritmo5;

/**
 * Polinomio Simples
 * @author eric
 */
public class Algoritmo30 {

    /**
     * Calcula um polinomio simples a partir 
     * @param x Valor da variavel da funcao polinomial.
     * @param a Vetor de coeficientes do polinomio, do ultimo para o primeiro.
     *          Deve conter um ou mais elementos,
     *          e seu ultimo elemento deve ser diferente de zero.
     * @return  O resultado do polinomio.
     */
    public static int polSimples(int x, int[] a) {
        if (a.length < 1) {
            throw new IllegalArgumentException("O tamanho do vetor deve ser maior ou igual a 1.");
        }
        if (a[a.length - 1] == 0) {
            throw new IllegalArgumentException("O ultimo elemento do vetor deve ser diferente de zero.");
        }
        
        int t = Algoritmo5.potencia(x, a.length);
        int p = a[0];
        int i = 1;
        
        while (i <= a.length - 1) {
            t = Algoritmo5.potencia(x, i);
            p += a[i] * t;
            i++;
        }
        
        return p;
    }
}
