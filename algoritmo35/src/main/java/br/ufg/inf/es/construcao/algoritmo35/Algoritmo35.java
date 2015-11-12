package br.ufg.inf.es.construcao.algoritmo35;

import br.ufg.inf.es.construcao.algoritmo27.Algoritmo27;

/**
 * Algoritmo de Luhn.
 * @author eric
 */
public class Algoritmo35 {

    /**
     * Calcula o Algoritmo de Luhn, gerando um digito de checagem a partir de um vetor de numeros.
     * @param n Array de numeros, deve conter dois ou mais elementos.
     * @return  Digito de checagem.
     */
    public static int luhn(int n[]) {
        if (n.length < 2) {
            throw new IllegalArgumentException("O vetor deve ter dois ou mais elementos.");
        }
        
        int impares = 0;
        int pares = 0;
        int l = n.length - 1; // Retira o digito verificador.
        boolean a = false;
        
        while (l > 0) {
            if (a) {
                pares += n[l];
            } else {
                int t = n[l] * 2;
                impares += (t / 10) + Algoritmo27.mod(t, 10);
            }
            
            l--;
            a = !a;
        }
        
        return 10 - Algoritmo27.mod(impares + pares, 10);
    }
}
