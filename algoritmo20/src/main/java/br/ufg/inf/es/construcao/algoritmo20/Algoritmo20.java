package br.ufg.inf.es.construcao.algoritmo20;

/**
 * Razao Aurea.
 *
 * @author eric
 */
public class Algoritmo20 {

    /**
     * Calcula a razao aurea entre dois termos.
     *
     * @param termo1 Primeiro termo, deve ser maior que zero.
     * @param termo2 Segundo termo, deve ser maior que o primeiro termo.
     * @param fator Fator, deve ser maior que zero.
     * @return A razao aurea.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static double razaoAurea(int termo1, int termo2, int fator) {
        if (termo1 <= 0) {
            throw new IllegalArgumentException("O primeiro termo deve ser "
                    + "maior que zero.");
        }
        if (termo2 <= termo1) {
            throw new IllegalArgumentException("O segundo termo deve ser "
                    + "maior que o primeiro.");
        }
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator deve ser "
                    + "maior que zero.");
        }

        double termoCorrente = termo2;
        double termoAnterior = termo1;
        int i = 1;

        while (i <= fator) {
            termoCorrente += termoAnterior;
            termoAnterior = termoCorrente - termoAnterior;
            i++;
        }

        return termoCorrente / termoAnterior;
    }
}
