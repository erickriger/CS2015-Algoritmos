package br.ufg.inf.es.construcao.algoritmo15;

/**
 * Calculo do valor de Pi.
 * @author eric
 */
public class Algoritmo15 {
    
    /**
     * Calcula o valor de pi utilizando somatorio.
     * @param n Numero de somas. Quanto maior, mais preciso o resultado. Deve ser maior ou igual a um.
     * @return  O valor de pi.
     * @throws IllegalArgumentException Se 'n' for invalido.
     */
    public static double pi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a 1.");
        }
        
        int i = 1;
        int s = -1;
        int d = -1;
        double p = 0;
        
        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i++;
        }
        
        return p;
    }
}
