package br.ufg.inf.es.construcao.algoritmo4;

/**
 * Calculo do produto.
 * @author eric
 */
public class Algoritmo4 {
    
    /**
     * Calcula o produto entre dois numeros.
     * @param a Numero inteiro, maior ou igual a zero.
     * @param b Numero inteiro, maior ou igual a zero.
     * @return  O produto entre os numeros.
     * @throws IllegalArgumentException Se algum parametro for menor que zero.
     */
    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Nenhum parametro pode ser "
                    + "menor que 0.");
        }
        
        int i = 1;
        int s = 0;
        
        while (i <= b) {
            s = s + a;
            i++;
        }
        
        return s;
    }
}
