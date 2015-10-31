package br.ufg.inf.es.construcao.algoritmo10;

/**
 * Calculo do Crivo de Eratostenes.
 *
 * @author eric
 */
public class Algoritmo10 {

    /**
     * Calcula se um numero e primo de acordo com o crivo de Eratostenes.
     * @param a Vetor para calculo, deve ter tamanho maior que 'n'.
     * @param n Numero que se deseja descobrir se e primo, deve ser maior
     *          ou igual a 2.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static void crivoEratostenes(int a[], int n) {
        if (n < 2) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a 2.");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Tamanho do vetor invalido.");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException();
            }
        }

        int i = 2;
        int c;

        while (i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;

                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }
            i++;
        }
    }
}
