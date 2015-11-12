package br.ufg.inf.es.construcao.algoritmo5;

/**
 * Calculo de potencia.
 *
 * @author eric
 */
public class Algoritmo5 {

    /**
     * Calcula a potencia entre dois numeros.
     *
     * @param base Base, deve ser maior que zero.
     * @param expoente Expoente, deve ser maior ou igual a zero.
     * @return Resultado da potenciacao.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static int potencia(int base, int expoente) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que 0.");
        }
        if (expoente < 0) {
            throw new IllegalArgumentException("O expoente deve ser "
                    + "maior ou igual a zero.");
        }

        int i = 1;
        int produto = 1;

        while (i <= expoente) {
            produto = produto * base;
            i++;
        }

        return produto;
    }
}
