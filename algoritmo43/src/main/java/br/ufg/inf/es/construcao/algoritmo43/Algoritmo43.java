package br.ufg.inf.es.construcao.algoritmo43;

/**
 * Permutacao.
 *
 * @author eric
 */
public class Algoritmo43 {

    /**
     * Realiza a permutacao dos caracteres de uma string.
     *
     * @param prefixo String auxiliar onde os caracteres permutados
     * serao acrescidos.
     * @param s String que se deseja permutar.
     */
    public static void permutacao(String prefixo, String s) {
        if (s.length() == 1) {
            System.out.println(prefixo + s);
        } else {
            for (int i = 1; i < s.length(); i++) {
                String ultimoCaracter = s.substring(s.length() - i);
                String sSubstring = s.substring(0, s.length() - i);
                String prefixoAcrescido = prefixo + ultimoCaracter;

                permutacao(prefixoAcrescido, sSubstring);
            }
        }
    }
}
