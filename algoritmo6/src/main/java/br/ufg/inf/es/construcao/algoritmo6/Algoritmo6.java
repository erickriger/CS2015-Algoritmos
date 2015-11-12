package br.ufg.inf.es.construcao.algoritmo6;

import br.ufg.inf.es.construcao.algoritmo4.Algoritmo4;

/**
 * Potenciacao atraves de soma.
 *
 * @author eric
 */
public class Algoritmo6 {

    /**
     * Calcula a potencia atraves da utilizacao do metodo produto, do
     * Algoritmo4. O metodo produto, por sua vez, utiliza somas para realizar a
     * multiplicacao. Sendo assim, a potenciacao e calculada, indiretamente,
     * atraves de soma.
     *
     * @param base Base, deve ser maior que zero.
     * @param expoente Expoente, deve ser maior ou igual a um.
     * @return O resultado da potenciacao.
     * @throws IllegalArgumentException Se algum dos parametros for invalido.
     * @see Algoritmo4
     */
    public static int potenciaSoma(int base, int expoente) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser "
                    + "maior que zero.");
        }
        if (expoente < 1) {
            throw new IllegalArgumentException("O expoente deve ser "
                    + "maior ou igual a 1.");
        }

        int i = 1;
        int produto = base;

        while (i < expoente) {
            produto = Algoritmo4.produto(produto, base);
            i++;
        }

        return produto;
    }
}
