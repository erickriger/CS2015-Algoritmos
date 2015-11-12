package br.ufg.inf.es.construcao.algoritmo7;

/**
 * Calculo de numeros com a propriedade do 3025.
 *
 * @author eric
 */
public class Algoritmo7 {

    /**
     * Calcula se um numero possui a mesma propriedade do 3025.
     *
     * @param n Numero maior ou igual a zero e menor ou igual a 9999.
     * @return true se possuir a propriedade, false se nao possuir a
     * propriedade.
     * @throws IllegalArgumentException Se o parametro for invalido.
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O parametro deve ser "
                    + "maior ou igual a zero e menor ou igual a 9999.");
        }

        int digMaisSignific = n / 100;
        int digMenosSignific = n % 100;

        return (digMaisSignific + digMenosSignific) * 
                (digMaisSignific + digMenosSignific) == n;
    }
}
