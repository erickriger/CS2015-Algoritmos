package br.ufg.inf.es.construcao.algoritmo13;

/**
 * Calculo de Numero Harmonico.
 *
 * @author eric
 */
public class Algoritmo13 {

    /**
     * Calcula o n-esimo numero harmonico, ignorando a primeira posicao.
     *
     * @param n Numero que representa a posicao na serie harmonica, deve ser
     * maior ou igual a 1.
     * @return Numero harmonico de posicao 'n'.
     * @throws IllegalArgumentException Se 'n' for invalido.
     */
    public static double numeroHarmonico(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O numero deve ser "
                    + "maior ou igual a 1.");
        }

        int i = 2;
        double soma = 1;

        while (i <= n) {
            soma = soma + (1 / i);
            i++;
        }

        return soma;
    }
}
