package br.ufg.inf.es.construcao.algoritmo33;

import br.ufg.inf.es.construcao.algoritmo27.Algoritmo27;

/**
 * Verificador de CPF 1.
 *
 * @author eric
 */
public class Algoritmo33 {

    /**
     * Verifica se o CPF e valido atraves da comparacao
     * entre o somatorio dos digitos e operacoes com os
     * digitos verificadores.
     * @param digitos   Vetor com os digitos do CPF.
     *                  Deve conter exatamente 11 elementos.
     * @return  true para CPF valido,
     *          false para CPF invalido.
     * @throws IllegalArgumentException Se o vetor de digitos
     *                                  conter um numero de elementos diferente de 11.
     */
    public static boolean verificaCpf(int[] digitos) {
        if (digitos.length != 11) {
            throw new IllegalArgumentException("O vetor deve conter 11 digitos.");
        }

        int somaVerif1 = digitos[1] + 2 * digitos[2] + 3 * digitos[3]
                + 4 * digitos[4] + 5 * digitos[5] + 6 * digitos[6]
                + 7 * digitos[7] + 8 * digitos[8] + 9 * digitos[9];

        int somaVerif2 = digitos[2] + 2 * digitos[3] + 3 * digitos[4]
                + 4 * digitos[5] + 5 * digitos[6] + 6 * digitos[7]
                + 7 * digitos[8] + 8 * digitos[9] + 9 * digitos[10];

        int verificador1 = Algoritmo27.mod(Algoritmo27.mod(somaVerif1, 11), 10);
        int verificador2 = Algoritmo27.mod(Algoritmo27.mod(somaVerif2, 11), 10);

        return verificador1 == digitos[9] && verificador2 == digitos[10];
    }
}
