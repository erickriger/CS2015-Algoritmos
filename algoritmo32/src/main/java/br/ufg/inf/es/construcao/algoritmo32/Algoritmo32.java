package br.ufg.inf.es.construcao.algoritmo32;

/**
 * Sequencia de Fibonacci.
 * @author eric
 */
public class Algoritmo32 {

    /**
     * Calcula o n-esimo numero na sequencia de Fibonacci.
     * @param n Numero da posicao, deve ser maior ou igual a zero.
     * @return  O valor do n-esimo numero da sequencia.
     * @throws IllegalArgumentException Se 'n' for invalido.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a zero.");
        }
        
        int a = 0; // termo anterior
        int c = 1; // termo corrente
        
        if (n == 0 || n == 1) {
            return n;
        }
        
        int i = 2; //Aqui, n >= 2.
        int t;
        
        while (i <= n) {
            t = c;
            c = c + a;
            a = t;
            i++;
        }
        
        return c;
    }
}
