package br.ufg.inf.es.construcao.algoritmo29;

/**
 * Raiz quadrada.
 * @author eric
 */
public class Algoritmo29 {

    /**
     * Calcula a raiz a partir de um radicando e um indice fornecidos. 
     * @param n Radicando, deve ser maior que zero.
     * @param i Indice da radiciacao, deve ser maior ou igual a zero.
     * @return  Raiz, o resultado.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static double raiz(double n, int i) {
        if (n <= 0) {
            throw new IllegalArgumentException("O 'n' deve ser maior que zero.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("O indice deve ser maior ou igual a zero.");
        }
        
        double r = 1;
        
        while (i >= 0) {
            r = (r + n / r) / 2;
            i--;
        }
        
        return r;
    }
}
