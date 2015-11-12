package br.ufg.inf.es.construcao.algoritmo19;

/**
 * Logaritmo Natural.
 *
 * @author eric
 */
public class Algoritmo19 {

    /**
     * Calcula o logaritmo natural.
     *
     * @param n Logaritmando, o numero do qual se deseja obter o logaritmo. 
     * Deve ser maior ou igual a um.
     * @param k Quantidade de termos da somatoria. Quanto maior, 
     * mais preciso e o resultado. Deve ser maior ou igual a dois.
     * @return O resultado do logaritmo.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static double logn(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser "
                    + "maior ou igual a 1.");
        }
        if (k < 2) {
            throw new IllegalArgumentException("O 'k' deve ser "
                    + "maior ou igual a 2.");
        }

        int i = 2;
        double expoente = n + 1;
        double temp = n;

        while (i <= k) {
            temp = temp * n / i;
            expoente += temp;
            i++;
        }

        return expoente;
    }
}
