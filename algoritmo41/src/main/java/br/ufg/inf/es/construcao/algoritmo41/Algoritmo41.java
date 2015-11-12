package br.ufg.inf.es.construcao.algoritmo41;

/**
 * Inversor de Caracteres.
 * @author eric
 */
public class Algoritmo41 {

    /**
     * Inverte os caracteres de uma string atraves de uma funcao recursiva.
     * @param s String cujos caracteres se deseja inverter.
     *          Nao deve estar vazia.
     * @return  A string invertida.
     * @throws IllegalArgumentException Se a string estiver vazia.
     */
    public static String inverteCaracteres(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("String vazia.");
        }
        
        if (s.length() == 1) {
            return s;
        } else {
            char c = s.charAt(s.length() - 1);
            String subString = s.substring(0, s.length() - 1);
            return c + inverteCaracteres(subString);
        }       
    }
}
