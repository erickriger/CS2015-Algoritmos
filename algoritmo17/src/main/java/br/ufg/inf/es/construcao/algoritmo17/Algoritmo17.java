package br.ufg.inf.es.construcao.algoritmo17;

import br.ufg.inf.es.construcao.algoritmo4.Algoritmo4;

/**
 * Fatorial atraves de soma.
 * @author eric
 */
public class Algoritmo17 {

    /**
     * Calcula o fatorial de um numero utilizando o metodo produto
     * do Algoritmo4.
     * O metodo produto, por sua vez, utiliza somas para realizar
     * a multiplicacao. Sendo assim, o fatorial e calculado, 
     * indiretamente, atraves de soma.
     * @param n O fatorando, o numero que se deseja obter o fatorial.
     *          Deve ser maior ou igual a um.
     * @return  O resultado do fatorial.
     * @throws IllegalArgumentException Se o fatorando for menor que um.
     * @see Algoritmo4
     */
    public static int fatorialSoma(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a 1.");
        }
        
        int i = 2;
        int f = 1;
        
        while (i <= n) {
            f = Algoritmo4.produto(f, i);
            i++;
        }
        
        return f;
    }
}
