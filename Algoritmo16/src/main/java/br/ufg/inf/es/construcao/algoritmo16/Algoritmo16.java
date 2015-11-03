package br.ufg.inf.es.construcao.algoritmo16;

/**
 * Calculo de fatorial.
 * @author eric
 */
public class Algoritmo16 {

    /**
     * Calcula o fatorial do numero fornecido.
     * @param n Numero a ser calculado, deve ser maior ou igual a um.
     * @return  O fatorial.
     * @throws IllegalArgumentException Se 'n' for invalido.
     */
    public static int fatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a 1.");
        }
        
        int i = 2;
        int f = 1;
        
        while (i <= n) {
            f = f * i;
            i++;
        }
        
        return f;
    }
}
