package br.ufg.inf.es.construcao.algoritmo38;

/**
 * Hipotenusa.
 * @author eric
 */
public class Algoritmo38 {

    /**
     * Calcula a hipotenusa, dados dois catetos.
     * @param cateto1 Primeiro cateto.
     * @param cateto2 Segundo cateto.
     * @return        A hipotenusa.
     */
    public static double hipotenusa(double cateto1, double cateto2) {
        
        double x = cateto1 * cateto1;
        double y = cateto2 * cateto2;
        double raiz = Math.sqrt(x + y);
        
        return raiz;
    }
}
