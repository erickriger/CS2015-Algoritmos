package br.ufg.inf.es.construcao.algoritmo12;

/**
 * Calculo de Maximo Divisor Comum - segunda maneira.
 * @author eric
 */
public class Algoritmo12 {

    /**
     * Calcula o MDC entre dois inteiros de uma maneira diferente
     * do Algoritmo 11.
     * @param a Numero maior ou igual a 'b'.
     * @param b Numero maior que zero.
     * @return  O maximo divisor comum.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static int mdc2(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("O 'a' deve ser maior ou igual a 'b'.");
        }
        if (b <= 0) {
            throw new IllegalArgumentException("O 'b' deve ser maior que zero.");
        }
        
        while (a != b) {
            if (a > b) {
                a = a - b;
            } 
            else {
                b = b - a;
            }
        }
        
        return a;
    }
}
