package br.ufg.inf.es.construcao.algoritmo32;

/**
 * Sequencia de Fibonacci.
 *
 * @author eric
 */
public class Algoritmo32 {

    /**
     * Calcula o n-esimo numero na sequencia de Fibonacci.
     *
     * @param n Numero da posicao, deve ser maior ou igual a zero.
     * @return O valor do n-esimo numero da sequencia.
     * @throws IllegalArgumentException Se 'n' for invalido.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O 'n' deve ser "
                    + "maior ou igual a zero.");
        }

        int termoAnterior = 0;
        int termoCorrente = 1;

        if (n == 0 || n == 1) {
            return n;
        }

        int i = 2;
        int temp;

        while (i <= n) {
            temp = termoCorrente;
            termoCorrente = termoCorrente + termoAnterior;
            termoAnterior = temp;
            i++;
        }

        return termoCorrente;
    }
}
