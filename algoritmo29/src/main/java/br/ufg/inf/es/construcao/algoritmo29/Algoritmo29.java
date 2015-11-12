package br.ufg.inf.es.construcao.algoritmo29;

/**
 * Raiz quadrada.
 *
 * @author eric
 */
public class Algoritmo29 {

    /**
     * Calcula a raiz a partir de um radicando e um indice fornecidos.
     *
     * @param n Radicando, deve ser maior que zero.
     * @param indice Indice da radiciacao, deve ser maior ou igual a zero.
     * @return Raiz, o resultado.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static double raiz(double n, int indice) {
        if (n <= 0) {
            throw new IllegalArgumentException("O radicando deve ser "
                    + "maior que zero.");
        }
        if (indice < 0) {
            throw new IllegalArgumentException("O indice deve ser "
                    + "maior ou igual a zero.");
        }

        double raiz = 1;

        while (indice >= 0) {
            raiz = (raiz + n / raiz) / 2;
            indice--;
        }

        return raiz;
    }
}
