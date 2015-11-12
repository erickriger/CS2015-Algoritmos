package br.ufg.inf.es.construcao.algoritmo11;

/**
 * Calculo de Maximo Divisor Comum (MDC).
 *
 * @author eric
 */
public class Algoritmo11 {

    /**
     * Calcula o MDC entre dois inteiros.
     *
     * @param termo1 Primeiro termo, deve ser maior ou igual ao segundo termo.
     * @param termo2 Segundo termo, deve ser maior que zero.
     * @return O Maximo Divisor Comum.
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

        while (termo2 != 0) {
            int mod = termo1 % termo2;
            termo1 = termo2;
            termo2 = mod;
        }

        return termo1;
    }
}
