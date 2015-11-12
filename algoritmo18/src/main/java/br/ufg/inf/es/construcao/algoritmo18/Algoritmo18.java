package br.ufg.inf.es.construcao.algoritmo18;

import br.ufg.inf.es.construcao.algoritmo16.Algoritmo16;
import br.ufg.inf.es.construcao.algoritmo5.Algoritmo5;

/**
 * Logaritmo Natural Simples
 *
 * @author eric
 */
public class Algoritmo18 {

    /**
     * Calcula o logaritmo natural simples
     *
     * @param n Logaritmando, o numero do qual se deseja obter o logaritmo. 
     * Deve ser maior ou igual a um.
     * @param k Quantidade de termos da somatoria. Quanto maior, 
     * mais preciso e o resultado. Deve ser maior ou igual a dois.
     * @return O resultado do logaritmo.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static double logNatSimples(int n, int k) {
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

        while (i <= k) {
            int p = Algoritmo5.potencia(n, i);
            int f = Algoritmo16.fatorial(i);
            expoente = expoente + p / f;
            i++;
        }

        return expoente;
    }
}
