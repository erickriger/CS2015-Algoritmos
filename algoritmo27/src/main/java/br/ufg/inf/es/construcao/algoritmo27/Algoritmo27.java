package br.ufg.inf.es.construcao.algoritmo27;

/**
 * Calculo de Mod
 * @author eric
 */
public class Algoritmo27 {

    /**
     * Calcula o mod (resto da divisao) entre dois numeros.
     * @param x Dividendo, deve ser maior que zero.
     * @param y Divisor, deve ser maior ou igual zero.
     * @return  Resto da divisao.
     * @throws IllegalArgumentException Se algum parametro for invalido.
     */
    public static int mod(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("O 'x' deve ser maior que zero.");
        }
        if (y < 0) {
            throw new IllegalArgumentException("O 'y' deve ser maior ou igual a zero.");
        }
        
        int s = x;
        
        while (s >= y) {
            s = s - y;
        }
        
        return s;
    }
}
