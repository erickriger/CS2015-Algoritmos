package br.ufg.inf.es.construcao.algoritmo37;

/**
 * Funcao de Ackermann.
 *
 * @author eric
 */
public class Algoritmo37 {

    /**
     * Calcula a funcao de Ackermann para as entradas fornecidas.
     *
     * @param x Numero maior ou igual a zero.
     * @param y Numero maior ou igual a zero.
     * @return Resultado da funcao.
     * @throws IllegalArgumentException Se algum parametro for menor que zero.
     */
    public static long ackermann(long x, long y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Os parametros devem ser "
                    + "maiores ou igual a zero.");
        }

        if (x == 0) {
            return y + 1;
        }

        if (y == 0) {
            return ackermann(x - 1L, 1L);
        }

        return ackermann(x - 1L, ackermann(x, y - 1L));
    }
}
