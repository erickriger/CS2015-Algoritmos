package br.ufg.inf.es.construcao.algoritmo34;

/**
 * Verificador de CPF 2.
 *
 * @author eric
 */
public class Algoritmo34 {

    /**
     * Verifica se um CPF e valido. Faz uso de um metodo diferente do utilizado
     * no Algoritmo 33.
     *
     * @param digitos Vetor com os digitos do CPF. Deve conter exatamente 11
     * elementos.
     * @return true se o CPF for valido, false se for invalido.
     * @throws IllegalArgumentException Se o vetor de digitos conter um numero
     * de elementos diferente de 11. 
     */
    public static boolean verificaCpf(int[] digitos) {
        if (digitos.length != 11) {
            throw new IllegalArgumentException("O vetor deve ter 11 digitos.");
        }

        int c = 7;
        int p = digitos[8];
        int s = digitos[8];

        while (c >= 0) {
            p = p + digitos[c];
            s = s + p;
            c--;
        }

        int j = (s % 11) % 10;
        int k = ((s - p + 9 * j) % 11) % 10;

        return j == digitos[9] && k == digitos[10];
    }
}
