package br.ufg.inf.es.construcao.algoritmo8;

/**
 * Calculo da propriedade do numero 153.
 *
 * @author eric
 */
public class Algoritmo8 {

    /**
     * Calcula se o numero fornecido possui a mesma propriedade do 153.
     *
     * @param n Numero maior ou igual a zero e menor ou igual a 999.
     * @return true se possuir a propriedade, false se nao possuir a
     * propriedade.
     * @throws IllegalArgumentException Se o parametro for invalido.
     */
    public static boolean propriedade153(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("O parametro deve ser "
                    + "maior ou igual a zero e menor ou igual a 999.");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        return (i * i * i) + (j * j * j) + (k * k * k) == n;
    }
}
