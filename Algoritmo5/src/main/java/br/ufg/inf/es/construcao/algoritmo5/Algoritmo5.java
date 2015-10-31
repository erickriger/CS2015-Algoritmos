package br.ufg.inf.es.construcao.algoritmo5;

/**
 * Calculo de potencia.
 * @author eric
 */
public class Algoritmo5 {

    /**
     * Calcula a potencia entre dois numeros.
     * @param x Numero base, deve ser maior que zero.
     * @param y Numero expoente, deve ser maior ou igual a zero.
     * @return  Resultado da potenciacao.
     * @throws IllegalArgumentException Se 'x' ou 'y' forem invalidos.
     */
    public static int potencia(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("O 'x' deve ser maior que 0.");
        }
        if (y < 0) {
            throw new IllegalArgumentException("O 'y' deve ser maior ou igual"
                    + " a zero.");
        }
        
        int i = 1;
        int p = 1;
        
        while (i <= y) {
            p = p * x;
            i++;
        }
        
        return p;
    }
}
