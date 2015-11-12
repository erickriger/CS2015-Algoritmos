package br.ufg.inf.es.construcao.algoritmo40;

import br.ufg.inf.es.construcao.algoritmo16.Algoritmo16;

/**
 * Soma de Fatoriais.
 *
 * @author eric
 */
public class Algoritmo40 {

    /**
     * Verifica se um numero e igual a soma dos fatoriais de seus digitos.
     *
     * @param n Numero no qual a propriedade sera verificada.
     * @return true, se atender a propriedade. False, se nao atender a
     * propriedade.
     */
    public static boolean atendeSomaFatoriais(int n) {

        int a = n / 100;
        int b = (n - 100) / 10;
        int c = n % 10;
        int soma = Algoritmo16.fatorial(a) + Algoritmo16.fatorial(b)
                + Algoritmo16.fatorial(c);

        return (soma == n);
    }
}
