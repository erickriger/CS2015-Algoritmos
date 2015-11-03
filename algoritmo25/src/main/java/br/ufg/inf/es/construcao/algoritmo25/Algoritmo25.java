package br.ufg.inf.es.construcao.algoritmo25;

/**
 * Divisao por meio de subtracoes.
 * @author eric
 */
public class Algoritmo25 {

    /**
     * Calcula a divisao inteira de 'x' por 'y' atraves de subtracoes.
     * O algoritmo conta quantas vezes e possivel subtrair 'y' de 'x'.
     * Dessa forma, o quociente corresponde ao valor do contador.
     * @param x Dividendo, deve ser maior ou igual a zero.
     * @param y Divisor, deve ser maior que zero.
     * @return  Quociente, o resultado inteiro da divisao.
     */
    public static int divideSubtracoes(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("O 'x' deve ser maior ou igual a zero.");
        }
        if (y <= 0) {
            throw new IllegalArgumentException("O 'y' deve ser maior que zero.");
        }
        
        int d = 0;
        int s = x;
        
        while (s >= y) {
            s = s - y;
            d++;
        }
        
        return d;
    }
}
