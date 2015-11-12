package br.ufg.inf.es.construcao.algoritmo31;

/**
 * Polinomios - Metodo de Horner
 * @author eric
 */
public class Algoritmo31 {

    /**
     * Calcula um polinomio atraves do Metodo de Horner.
     * @param x Valor da variavel da funcao polinomial.
     * @param a Vetor de coeficientes do polinomio, do ultimo para o primeiro.
     *          Deve conter um ou mais elementos.
     * @return  Resultado do polinomio.
     */
    public static int polHorner(int x, int[] a) {       
        if (a.length < 1) {
            throw new IllegalArgumentException("O vetor deve conter um ou mais elementos.");
        }
        
        int p = a[a.length - 1];
        int i = a.length - 2;
        
        while (i >= 0) {
            p = p * x + a[i];
            i--;
        }
        
        return p;
    }
}
