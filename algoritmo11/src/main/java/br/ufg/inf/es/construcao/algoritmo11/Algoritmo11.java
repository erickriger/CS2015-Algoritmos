package br.ufg.inf.es.construcao.algoritmo11;

/**
 * Calculo de Maximo Divisor Comum (MDC).
 * @author eric
 */
public class Algoritmo11 {

    /**
     * Calcula o MDC entre dois inteiros.
     * @param a Numero maior ou igual a 'b'.
     * @param b Numero maior que zero.
     * @return  O Maximo Divisor Comum.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static int mdc(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("O 'a' deve ser maior ou igual a 'b'.");
        }
        if (b <= 0) {
            throw new IllegalArgumentException("O 'b' deve ser maior que zero.");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        
        return a;
    }
}
