package br.ufg.inf.es.construcao.algoritmo12;

/**
 * Calculo de Maximo Divisor Comum - segunda maneira.
 *
 * @author eric
 */
public class Algoritmo12 {

    /**
     * Calcula o MDC entre dois inteiros de uma maneira diferente do Algoritmo
     * 11.
     *
     * @param termo1 Primeiro termo, deve ser maior ou igual ao segundo termo.
     * @param termo2 Segundo termo, deve ser maior que zero.
     * @return O maximo divisor comum.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static int mdc(int termo1, int termo2) {
        if (termo1 < termo2) {
            throw new IllegalArgumentException("O primeiro termo deve ser "
                    + "maior ou igual ao segundo termo.");
        }
        if (termo2 <= 0) {
            throw new IllegalArgumentException("O segundo termo deve ser "
                    + "maior que zero.");
        }

        while (termo1 != termo2) {
            if (termo1 > termo2) {
                termo1 = termo1 - termo2;
            } else {
                termo2 = termo2 - termo1;
            }
        }

        return termo1;
    }
}
