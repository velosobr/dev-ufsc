public class Tabuleiro
{
    char[][] casas;         // as casas do tabuleiro
    final char CASA_VAZIA;  // caracter que representa uma casa vazia (não marcada)
    final char X;           // caracter que representa o jogador que marca com 'X'
    final char O;           // caracter que representa o jogador que marca com 'O'

    /**
     * Cria um tabuleiro com todas as casas vazias.
     *
     */
    public Tabuleiro() {
        CASA_VAZIA = ' ';
        X = 'X';
        O = 'O';
        casas = new char [][] {{CASA_VAZIA, CASA_VAZIA, CASA_VAZIA},
            {CASA_VAZIA, CASA_VAZIA, CASA_VAZIA},
            {CASA_VAZIA, CASA_VAZIA, CASA_VAZIA}};
    }

    /**
     * Identifica o caracter que representa uma casa vazia no tabuleiro.
     *
     * @return O caracter que representa uma casa vazia (em branco).
     */
    public char getMarcaCasaVazia() {
        return CASA_VAZIA;
    }

    /**
     * Identifica o caracter usado pelo jogador que marca com 'X'. Tipicamente será 'X';
     *
     * @return O caracter usado pelo jogador.
     */
    public char getMarcaJogadorX() {
        return X;
    }

    /**
     * Identifica o caracter usado pelo jogador que marca com 'O'. Tipicamente será 'O';
     *
     * @return O caracter usado pelo jogador.
     */
    public char getMarcaJogadorO() {
        return O;
    }

    /**
     * Retorna a marca que existe em uma posição do tabuleiro.
     *
     * @param linha Uma linha do tabuleiro. O valor deve ser entre 1 e 3.
     * @param coluna Uma coluna do tabuleiro. O valor deve ser entre 1 e 3.
     * @return A marca contida na linha e coluna.
     */
    public char getMarca(int linha, int coluna) {
        return casas[linha-1][coluna-1];
    }

    /**
     * Tenta marcar com 'X' uma determinada casa do tabuleiro. A operação só é realizada com sucesso
     * se a casa estiver vazia.
     *
     * @param linha Uma linha do tabuleiro.
     * @param coluna Uma coluna do tabuleiro.
     * @return Retorna true se conseguiu marcar (a casa estava vazia) ou false caso contrário.
     */
    public boolean setMarcaX(int linha, int coluna) {
        return setCasa(linha-1, coluna-1, X);
    }

    /**
     * Tenta marcar com 'O' uma determinada casa do tabuleiro. A operação só é realizada com sucesso
     * se a casa estiver vazia.
     *
     * @param linha Uma linha do tabuleiro.
     * @param coluna Uma coluna do tabuleiro.
     * @return Retorna true se conseguiu marcar (a casa estava vazia) ou false caso contrário.
     */
    public boolean setMarcaO(int linha, int coluna) {
        return setCasa(linha-1, coluna-1, O);
    }

    /**
     * Tenta preencher uma casa com uma marca. A operação só é realizada com sucesso se a casa
     * estiver vazia.
     *
     * @param i A linha da casa. O valor deve ser entre 0 e 2.
     * @param j A coluna da casa. O valor deve ser entre 0 e 2.
     * @param marca A marca.
     * @return Retorna true se conseguiu marcar (a casa estava vazia) ou false caso contrário.
     */
    private boolean setCasa(int i, int j, char marca) {
        boolean marcou;

        if (casas[i][j] == CASA_VAZIA) {
            marcou = true;
            casas[i][j] = marca;
        }
        else
            marcou = false;

        return marcou;
    }

    /**
     * Verifica se há algum vencedor no tabuleiro.
     *
     * @return Retorna true se houver algum vencedor ou false caso contrário.
     */
    public boolean haVencedor() {
        return jogadorXVenceu() || jogadorOVenceu();
    }

    /**
     * Verifica se existe pelo menos uma casa vazia no tabuleiro.
     *
     * @return Retorna true se houver pelo menos uma casa vazia ou false caso contrário.
     */
    public boolean existeCasaVazia() {
        boolean existe = false;
        int i,j;
        i = 0;
        while (!existe && i <= 2) {
            j = 0;
            while (!existe && j <= 2)
                existe = casas[i][j++] == CASA_VAZIA;
            i++;
        }

        return existe;
    }

    /**
     * Verifica se o jogador que marca com 'X' venceu.
     *
     * @return Retorna true se 'X' venceu ou false caso contrário.
     */
    public boolean jogadorXVenceu() {
        return jogadorVenceuNaLinha(X) || jogadorVenceuNaColuna(X) || jogadorVenceuNaDiagonal(X);
    }

    /**
     * Verifica se o jogador que marca com 'O' venceu.
     *
     * @return Retorna true se 'O' venceu ou false caso contrário.
     */
    public boolean jogadorOVenceu() {
        return jogadorVenceuNaLinha(O) || jogadorVenceuNaColuna(O) || jogadorVenceuNaDiagonal(O);
    }

    /**
     * Verifica se o jogador que usa a marca venceu pois preencheu uma linha inteira.
     *
     * @param marca A marca.
     * @return Retorna true se a marca aparece 3 vezes em alguma linha ou false caso contrário.
     */
    private boolean jogadorVenceuNaLinha(char marca) {
        boolean venceu = false;
        int linha = 0;

        while (!venceu && linha <= 2)
            venceu = marcaPreencheuLinha(linha++,marca);

        return venceu;
    }

    /**
     * Verifica se a marca preencheu uma linha, ou seja, aparece 3 vezes em uma linha.
     *
     * @param i A linha. O valor deve ser entre 0 e 2.
     * @param marca A marca.
     * @return Retorna true se a marca aparece 3 vezes na linha i.
     */
    private boolean marcaPreencheuLinha(int i, char marca) {
        return casas[i][0] == marca && casas[i][1] == marca && casas[i][2] == marca;
    }

    /**
     * Verifica se o jogador que usa a marca venceu pois preencheu uma coluna inteira.
     *
     * @param marca A marca.
     * @return Retorna true se a marca aparece 3 vezes em alguma coluna ou false caso contrário.
     */
    private boolean jogadorVenceuNaColuna(char marca) {
        boolean venceu = false;
        int coluna = 0;

        while (!venceu && coluna <= 2)
            venceu = marcaPreencheuColuna(coluna++,marca);

        return venceu;
    }

    /**
     * Verifica se a marca preencheu uma coluna, ou seja, aparece 3 vezes em uma coluna.
     *
     * @param i A coluna. O valor deve ser entre 0 e 2.
     * @param marca A marca.
     * @return Retorna true se a marca preencheu ou false caso contrário.
     */
    private boolean marcaPreencheuColuna(int i, char marca) {
        return casas[0][i] == marca && casas[1][i] == marca && casas[2][i] == marca;
    }

    /**
     * Verifica se o jogador que usa a marca venceu pois preencheu uma das diagonais.
     *
     * @param marca A marca.
     * @return Retorna true se uma das diagonais foi preenchida com a marca ou false caso contrário.
     */
    private boolean jogadorVenceuNaDiagonal(char marca) {
        return casas[0][0] == marca && casas[1][1] == marca && casas[2][2] == marca ||
        casas[0][2] == marca && casas[1][1] == marca && casas[2][0] == marca;
    }
}
