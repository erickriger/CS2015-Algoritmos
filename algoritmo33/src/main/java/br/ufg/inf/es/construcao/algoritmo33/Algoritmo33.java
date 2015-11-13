package br.ufg.inf.es.construcao.algoritmo33;

/**
 * Verificador de CPF 1.
 *
 * @author eric
 */
public class Algoritmo33 {

    /**
     * Verifica se o CPF e valido atraves da comparacao entre o somatorio dos
     * digitos e operacoes com os digitos verificadores.
     *
     * @param digitos Vetor com os digitos do CPF. Deve conter exatamente 11
     * elementos.
     * @return true para CPF valido, false para CPF invalido.
     * @throws IllegalArgumentException Se o vetor de digitos conter um numero
     * de elementos diferente de 11.
     */
    public static boolean verificaCpf(int[] digitos) {
        if (digitos.length != 11) {
            throw new IllegalArgumentException("O vetor deve conter "
                    + "11 digitos.");
        }

        int somaVerif1 = digitos[0] + 2 * digitos[1] + 3 * digitos[2]
                + 4 * digitos[3] + 5 * digitos[4] + 6 * digitos[5]
                + 7 * digitos[6] + 8 * digitos[7] + 9 * digitos[8];

        int somaVerif2 = digitos[1] + 2 * digitos[2] + 3 * digitos[3]
                + 4 * digitos[4] + 5 * digitos[5] + 6 * digitos[6]
                + 7 * digitos[7] + 8 * digitos[8] + 9 * digitos[9];

        int verif1 = (somaVerif1 % 11) % 10;
        int verif2 = (somaVerif2 % 11) % 10;

        return verif1 == digitos[9] && verif2 == digitos[10];
    }
}
