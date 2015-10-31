package br.ufg.inf.es.construcao.algoritmo3;

/**
 * Soma de numeros naturais.
 * @author eric
 */
public class Algoritmo3 {

    /**
     * Calcula a soma dos n primeiros numeros naturais.
     * @param n O numero de naturais a serem somados.
     * @return  O resultado da soma.
     * @throws IllegalArgumentException Se 'n' for menor que 1.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O 'n' deve ser maior que 0.");
        }
        
        int i = 2;
        int s = 1;
        
        while (i <= n) {
            s = s + i;
            i++;
        }
        
        return s;
    }
}
