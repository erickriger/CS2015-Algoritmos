package br.ufg.inf.es.construcao.algoritmo9;

/**
 * Calculo de numeros primos.
 *
 * @author eric
 */
public class Algoritmo9 {

    /**
     * Calcula se o numero fornecido e primo.
     *
     * @param n Numero que sera verificado. Deve ser maior que um.
     * @return true se for primo, false se nao for primo.
     * @throws IllegalArgumentException Se o parametro for invalido.
     */
    public static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("O parametro deve ser "
                    + "maior que 1.");
        }

        int i = 2;

        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}
