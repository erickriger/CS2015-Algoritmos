package br.ufg.inf.es.construcao.algoritmo15;

/**
 * Calculo do valor de Pi.
 *
 * @author eric
 */
public class Algoritmo15 {

    /**
     * Calcula o valor de pi utilizando somatorio.
     *
     * @param n Numero de somas. Quanto maior, mais preciso o resultado. Deve
     * ser maior ou igual a um.
     * @return O valor de pi.
     * @throws IllegalArgumentException Se o parametro for menor que um.
     */
    public static double pi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O parametro deve ser "
                    + "maior ou igual a 1.");
        }

        int i = 1;
        int soma = -1;
        int d = -1;
        double pi = 0;

        while (i <= n) {
            d = d + 2;
            soma = -1 * soma;
            pi = pi + 4 * soma / d;
            i++;
        }

        return pi;
    }
}
