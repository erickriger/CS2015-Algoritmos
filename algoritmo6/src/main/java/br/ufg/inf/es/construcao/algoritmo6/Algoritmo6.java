package br.ufg.inf.es.construcao.algoritmo6;

import br.ufg.inf.es.construcao.algoritmo4.Algoritmo4;

/**
 * Potenciacao atraves de soma.
 * @author eric
 */
public class Algoritmo6 {

    /**
     * Calcula a potencia atraves da utilizacao do metodo produto,
     * do Algoritmo4.
     * O metodo produto, por sua vez, utiliza somas para realizar
     * a multiplicacao. Sendo assim, a potenciacao e calculada, 
     * indiretamente, atraves de soma.
     * @param x Base, deve ser maior que zero.
     * @param y Expoente, deve ser maior ou igual a um.
     * @return  O resultado da potenciacao.
     * @throws IllegalArgumentException Se algum dos parametros for invalido.
     * @see Algoritmo4
     */
    public static int potenciaSoma(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("O 'x' deve ser maior que zero.");
        }
        if (y < 1) {
            throw new IllegalArgumentException("O 'y' deve ser maior ou igual a 1.");
        }
        
        int i = 1;
        int p = x;
        
        while (i < y) {
            p = Algoritmo4.produto(p, x);
            i++;
        }
        
        return p;
    }
}
