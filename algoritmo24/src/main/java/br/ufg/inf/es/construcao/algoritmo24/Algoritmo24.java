package br.ufg.inf.es.construcao.algoritmo24;

/**
 * Divisão por meio de somas.
 * @author eric
 */
public class Algoritmo24 {

    /**
     * Calcula a divisao inteira de 'x' por 'y', somando quantas 
     * vezes 'x' pode ser duplicado até chegar em 'y'.
     * @param x O dividendo, deve ser maior ou igual a zero.
     * @param y O divisor, deve ser maior que zero.
     * @return  O quociente (resultado inteiro da divisão).
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static int divideSomas(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("O 'x' deve ser maior ou igual a zero.");
        }
        if (y <= 0) {
            throw new IllegalArgumentException("O 'y' deve ser maior que zero.");
        }
        
        int d = 0;
        int s = y;
        
        while (s <= x) {
            s = s + y;
            d++;
        }
        
        return d;
    }
}
