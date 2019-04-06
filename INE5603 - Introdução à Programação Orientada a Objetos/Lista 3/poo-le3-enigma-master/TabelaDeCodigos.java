/**
 * Um objeto desta classe representa uma Tabela de Codificação de caracteres. A tabela
 * armazena os caracteres que podem ser codificados e seus respectivos códigos.
 */
public class TabelaDeCodigos
{
    char[] caracteres;              // os caracteres
    char[] caracteresCodificados;   // os caracteres codificados

    /**
     * Cria uma Tabela de Códigos cujos caracteres e suas codificações são definidos
     * no próprio algoritmo.
     *
     */
    public TabelaDeCodigos() {
        caracteres            = new char [] {'a', 'á', 'à', 'ã', 'b', 'c', 'ç', 'd', 'e', 'é', 'f', 'g', 'h', 'i', 'í', 'j', 'k', 'l', 'm', 'n', 'o', 'ó', 'õ', 'p', 'q', 'r', 's', 't', 'u', 'ú', 'v', 'x', 'y', 'z', 'w', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', ',', '.', ';', '?', '!', '@', '#', '$', '%', '*', '(', ')', '-', '+', '='};
        caracteresCodificados = new char [] {'K', '3', 'M', 'z', '1', 'G', ',', 'P', '0', ' ', 'l', 'L', 'Z', '"', '2', 'e', 'D', '[', 'q', 'x', 'v', '7', '4', 'h', 'é', 'õ', 'à', 'ú', ':', 'y', 'a', 'w', '!', 'U', 'p', 'R', 's', 'S', ')', '*', 't', 'í', 'Ú', 'X', '5', '#', '{', '}', 'N', 'I', 'Í', 'Q', '@', 'g', '6', '+', '8', '_', '^', '<', '>'};
    };

    /**
     * Cria uma Tabela de Codificação a partir de um conjunto de caracteres e de um conjunto
     * de caracteres codificados.
     *
     * @param caracteres Os caracteres.
     * @param caracteresCodificados Os caracteres codificados.
     */
    public TabelaDeCodigos(char[] caracteres, char[] caracteresCodificados) {
        this.caracteres = caracteres;
        this.caracteresCodificados = caracteresCodificados;
    }

    /**
     * Determina a posição de um caracter dentro da tabela.
     *
     * @param c Um caracter não codificado.
     * @return Retorna a posição do caracter. Caso o caracter não faça parte
     * da tabela então retorna -1.
     */
    public int getPosicaoDoCaracter(char c) {
        return getPosicaoDoCaracterNoArray(c, caracteres);
    }

    /**
     * Determina a posição de um caracter codificado dentro da tabela.
     *
     * @param c Um caracter codificado.
     * @return Retorna a posição do caracter codificado. Caso o caracter não faça parte
     * da tabela então retorna -1.
     */
    public int getPosicaoDoCaracterCodificado(char c) {
        return getPosicaoDoCaracterNoArray(c, caracteresCodificados);
    }

    /**
     * Obtém o caracter que está em uma posição na tabela.
     *
     * @param posicao A posição do caracter na tabela.
     * @return Retorna o caracter.
     */
    public char getCaracter(int posicao) {
        return caracteres[posicao];
    }

    /**
     * Obtém o caracer codificado que está em uma posição na tabela.
     *
     * @param posicao A posição do caracter codificado na tabela.
     * @return Retorna o caracter codificado.
     */
    public char getCaracterCodificado(int posicao) {
        return caracteresCodificados[posicao];
    }

    /**
     * Obtém a posição de um caracter dentro de um array.
     *
     * @param c O caracter.
     * @param arrayDeCaracteres O array de caracteres.
     * @return Retorna a posição do caracter no array. Caso o caracter não esteja no array então
     * retorna -1.
     */
    private int getPosicaoDoCaracterNoArray(char c, char[] arrayDeCaracteres) {
        int posicao = 0;

        while (posicao < arrayDeCaracteres.length && arrayDeCaracteres[posicao] != c)
            posicao ++;

        if (posicao == arrayDeCaracteres.length)
            posicao = -1;

        return posicao;
    }

    /**
     * Verifica se a Tabela de Codificação é válida. Uma tabela é válida se for possível
     * codificar e decodificar corretamente qualquer um dos caracteres da tabela.
     *
     * @return Retorna true se a tabela for válida ou false caso contrário.
     */
    public boolean valide() {        
        String fraseOriginal = new String (caracteres);
        String fraseCodificada;
        String fraseDecodificada;

        Enigma e = new Enigma();
        fraseCodificada = e.codifique(fraseOriginal, this);
        fraseDecodificada = e.decodifique(fraseCodificada, this);

        return fraseOriginal.equals(fraseDecodificada);
    }
}
