package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Calculo de dia da semana.
 * @author eric
 */
public class Algoritmo1 {

    /**
     * Calcula o dia da semana de uma determinada data.
     * 
     * @param d Dia do mes, entre 1 e 31, inclusive.
     * @param m Mes do ano, entre 1 e 12, inclusive.
     * @param a Ano, maior ou igual a 1753.
     * @return  Numero correspondente ao dia da semana.
     * @throws IllegalArgumentException Se 'd', 'm' ou 'a' forem invalidos. 
     */
    public static double diaSemana(int d, int m, int a) {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Parametro 'd' invalido.");
        }
        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Parametro 'm' invalido.");
        }
        if (a < 1753) {
            throw new IllegalArgumentException("Parametro 'a' invalido.");
        }        
        
        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }
        
        double s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;
        return (s % 7);
    }
}
