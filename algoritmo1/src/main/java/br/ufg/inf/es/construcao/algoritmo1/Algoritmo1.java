package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Calculo de dia da semana.
 *
 * @author eric
 */
public class Algoritmo1 {

    /**
     * Calcula o dia da semana de uma determinada data.
     *
     * @param dia Dia do mes, entre 1 e 31, inclusive.
     * @param mes Mes do ano, entre 1 e 12, inclusive.
     * @param ano Ano, maior ou igual a 1753.
     * @return Numero correspondente ao dia da semana.
     * @throws IllegalArgumentException Se 'dia', 'mes' ou 'ano' forem
     * invalidos.
     */
    public static double diaSemana(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia invalido.");
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes invalido.");
        }
        if (ano < 1753) {
            throw new IllegalArgumentException("Ano invalido.");
        }

        if (mes == 1 || mes == 2) {
            mes = mes + 12;
            ano = ano - 1;
        }

        double s = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4
                - ano / 100 + ano / 400;
        return (s % 7);
    }
}
