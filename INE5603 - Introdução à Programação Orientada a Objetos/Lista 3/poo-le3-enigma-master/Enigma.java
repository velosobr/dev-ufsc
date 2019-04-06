/**
 * Um objeto desta classe é capaz de codificar e de decodificar frases
 * usando uma Tabela de Codificação.
 */
public class Enigma
{    
    /**
     * Codifica uma frase.
     *
     * @param frase A frase a ser codificada.
     * @param tabela A Tabela de Codificação usada para codificar.
     * @return Retorna a frase codificada ou null caso a frase a ser codificada contenha
     * algum caracter que não está presente na tabela de codificação.
     */
    public String codifique(String frase, TabelaDeCodigos tabela) {
        return gereNovaFrase(true, frase, tabela);
    }

    /**
     * Decodifica uma frase.
     *
     * @param fraseCodificada A frase a ser decodificada.
     * @param tabela A Tabela de Codificação usada para decodificar.
     * @return Retorna a frase decodificada ou null caso a frase a ser decodificada contenha
     * algum caracter que não está presente na tabela de codificação.
     */
    public String decodifique(String fraseCodificada, TabelaDeCodigos tabela) {
        return gereNovaFrase(false, fraseCodificada, tabela);
    }

    /**
     * Gera uma nova frase a partir de uma frase original. A frase original pode ser tanto uma frase
     * a ser codificada quanto uma frase a ser decodificada.
     *
     * @param codificar Indica se o objetivo é codificar ou decodificar a frase original.
     * @param fraseOriginal A frase a ser codificada ou decodificada.
     * @param tabela A Tabela de Codificação usada na codificação ou decodificação.
     * @return A frase resultante do processo de codificação ou de decodificação. O valor será null
     * caso a frase original não possa ser codificada ou decodificada.
     */
    private String gereNovaFrase(boolean codificar, String fraseOriginal, TabelaDeCodigos tabela) {
        String fraseResultante;
        boolean temCaracterInvalido;
        int posicaoDoCaracter;
        char[] caracteresDaFraseOriginal;
        char[] caracteresResultantes;
        int i;

        temCaracterInvalido = false;
        caracteresDaFraseOriginal = fraseOriginal.toCharArray();
        caracteresResultantes = new char [caracteresDaFraseOriginal.length];
        i = 0;

        while (!temCaracterInvalido && i < caracteresDaFraseOriginal.length) {
            if (codificar)
                posicaoDoCaracter = tabela.getPosicaoDoCaracter(caracteresDaFraseOriginal[i]);
            else
                posicaoDoCaracter = tabela.getPosicaoDoCaracterCodificado(caracteresDaFraseOriginal[i]);

            if (posicaoDoCaracter == -1)
                temCaracterInvalido = true;
            else
            if (codificar)    
                caracteresResultantes[i] = tabela.getCaracterCodificado(posicaoDoCaracter);
            else
                caracteresResultantes[i] = tabela.getCaracter(posicaoDoCaracter);

            i++;
        }

        if (temCaracterInvalido)
            fraseResultante = null;
        else
            fraseResultante = new String(caracteresResultantes);        

        return fraseResultante;
    }

}
