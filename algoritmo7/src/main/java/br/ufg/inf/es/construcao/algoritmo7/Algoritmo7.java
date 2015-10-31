package br.ufg.inf.es.construcao.algoritmo7;

/**
 * Calculo de numeros com a propriedade do 3025.
 * @author eric
 */
public class Algoritmo7 {

    /**
     * Calcula se um numero possui a mesma propriedade do 3025.
     * @param n Numero maior oou igual a zero e menor ou igual a 9999.
     * @return  true se possuir a propriedade, 
     *          false se nao possuir a propriedade.
     * @throws IllegalArgumentException Se o parametro for invalido.
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O 'n' deve ser maior ou igual a zero e menor ou igual a 9999.");
        }
        
        int i = n / 100; // dois digitos mais significativos
        int j = n % 100; // dois digitos menos significativos
        
        return (i + j) * (i + j) == n;
    }
}
