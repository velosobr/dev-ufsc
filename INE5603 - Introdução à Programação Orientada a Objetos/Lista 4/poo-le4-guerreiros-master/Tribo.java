/**
 * Representa uma tribo de guerreiros.
 */
public class Tribo
{
    // o nome da tribo
    String nome;

    // os guerreiros
    Guerreiro[] guerreiros;

    // a quantidade de guerreiros vivos
    int qtdVivos;

    // a quantidade de guerreiros mortos
    int qtdMortos;

    // a quantidade máxima de vidas que um guerreiro da tribo pode ter
    final int MAX_VIDAS_GUERREIRO;

    /**
     * Cria uma tribo. Inicialmente a tribo não possui guerreiros.
     *
     * @param nome O nome da tribo.
     * @param qtdGuerreiros A quantidade máxima de guerreiros que a tribo pode ter.
     * @param maxVidasGuerreiro A quantidade máxima de vidas dos guerreiros desta tribo.
     */
    public Tribo(String nome, int qtdGuerreiros, int maxVidasGuerreiro) {
        this.nome = nome;
        guerreiros = new Guerreiro[qtdGuerreiros];
        qtdVivos = 0;
        qtdMortos = 0;
        MAX_VIDAS_GUERREIRO = maxVidasGuerreiro;
    }

    /**
     * Obtém o nome da tribo.
     *
     * @return Retorna o nome da tribo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém a quantidade de guerreiros vivos.
     *
     * @return Retorna a quantidade de guerreiros vivos.
     */
    public int getQtdVivos() {
        return qtdVivos;
    }

    /**
     * Obtém a quantidade de guerreiros mortos.
     *
     * @return Retorna a quantidade de guerreiros mortos.
     */
    public int getQtdMortos() {
        return qtdMortos;
    }

    /**
     * Obtém a quantidade total de guerreiros, incluindo vivos e mortos.
     *
     * @return Retorna a quantidade total de guerreiros.
     */
    public int getQtdGuerreiros() {
        return qtdVivos + qtdMortos;
    }

    /**
     * Obtém a quantidade máxima de guerreiros que a tribo pode ter.
     *
     * @return A quantidade máxima de guerreiros da tribo.
     */
    public int getQtdMaximaDeGuerreiros() {
        return guerreiros.length;
    }

    /**
     * Tenta adicionar um guerreiro para a tribo.
     *
     * @param codigo O código do guerreiro a ser adicionado.
     * @return Retorna: 0 se o guerreiro foi adicionado; 
     * 1 se não adicionou porque já existe um guerreiro, vivo ou morto,
     * com o código informado; 
     * 2 se não adicionou porque não há mais lugar na tribo (incluindo vivos e mortos).
     */
    public int adicioneGuerreiro(String codigo) {
        final int OK = 0;
        final int JA_EXISTE = 1;
        final int SEM_LUGAR = 2;
        int resultado;
        int posicao;

        if (qtdVivos + qtdMortos == guerreiros.length)
            resultado = SEM_LUGAR;
        else {
            posicao = encontrePosicaoDeGuerreiro(codigo);
            if (posicao != -1)
                resultado = JA_EXISTE;
            else {
                adicioneGuerreiro(new Guerreiro(codigo, MAX_VIDAS_GUERREIRO));
                qtdVivos++;
                resultado = OK;
            }
        }

        return resultado;
    }
     /**
     * Adiciona um guerreiro na primeira posição disponível no array. Este método assume que sempre
     * haverá pelo menos um lugar vazio no array.
     *
     * @param g O guerreiro a ser adicionado.
     */
    private void adicioneGuerreiro(Guerreiro g) {
        int i = 0;

        while (guerreiros[i] != null)
            i++;
        guerreiros[i] = g;
    }

    /**
     * Tenta remover um guerreiro, vivo ou morto, da tribo.
     *
     * @param codigo O código do guerreiro a ser removido.
     * @return Retorna true se o guerreiro foi removido ou false se não houver guerreiro com o código informado.
     */
    public boolean removaGuerreiro(String codigo) {
        boolean removido = false;
        int posicao;

        posicao = encontrePosicaoDeGuerreiro(codigo);
        if (posicao == -1)
            removido = false;
        else {
            if (guerreiros[posicao].estaVivo())
                qtdVivos--;
            else
                qtdMortos--;
            guerreiros[posicao] = null;
            removido = true;
        }

        return removido;
    }

    /**
     * Tenta curar um guerreiro. Curar significa dar mais uma vida ao guerreiro. Se o guerreiro estiver morto ele 
     * volta a ficar vivo.
     * @param codigo O código do guerreiro que ganhará mais uma vida.
     * @return Retorna true se existir guerreiro com o código informado ou false caso contrário.
     */
    public boolean cureGuerreiro(String codigo) {
        boolean curou;
        int posicao = encontrePosicaoDeGuerreiro(codigo);

        if (posicao == -1)
            curou = false;
        else {
            if (!guerreiros[posicao].estaVivo()) {
                qtdMortos--;
                qtdVivos++;
            }
            guerreiros[posicao].ganheVida();
            curou = true;
        }

        return curou;
    }

    /**
     * Tenta ferir um guerreiro. Ferir significa tirar uma vida dele. Com isso um guerreiro pode morrer.
     *
     * @param codigo O código do guerreiro a ser ferido.
     * @return Retorna true se havia guerreiro com o código informado ou false caso contrário.
     */
    public boolean firaGuerreiro(String codigo) {
        boolean feriu;
        int posicao = encontrePosicaoDeGuerreiro(codigo);

        if (posicao == -1)
            feriu = false;
        else {
            boolean estavaVivo = guerreiros[posicao].estaVivo();
            guerreiros[posicao].percaVida();
            if (estavaVivo && !guerreiros[posicao].estaVivo()) {
                qtdVivos--;
                qtdMortos++;
            }
            feriu = true;
        }

        return feriu;
    }

    /**
     * Obtém uma cópia de todos os guerreiros vivos.
     *
     * @return Os guerreiros vivos.
     */
    public Guerreiro[] encontreVivos() {
        return encontreGuerreiros(true);   
    }

    /**
     * Obtém uma cópia de todos os guerreiros mortos.
     *
     * @return Os guerreiros mortos.
     */
    public Guerreiro[] encontreMortos() {
        return encontreGuerreiros(false);
    }

    /**
     * Obtém uma cópia dos guerreiros existentes.
     *
     * @param vivos Indica se é para copiar os vivos ou os mortos.
     * @return Retorna um array contendo uma copia dos guerreiros.
     */
    private Guerreiro[] encontreGuerreiros(boolean vivos) {
        int qtdExistente;
        Guerreiro[] resposta;
        int i = 0;

        if (vivos)
            qtdExistente = qtdVivos;
        else    
            qtdExistente = qtdMortos;

        resposta = new Guerreiro [qtdExistente];

        for (int k = 0 ; k < qtdExistente; k++) {
            while(guerreiros[i] == null || guerreiros[i].estaVivo() != vivos)
                i++;
            resposta[k] = guerreiros[i++].clone();
        }

        return resposta;
    }

    /**
     * Encontra a posição de um guerreiro dentro do array de guerreiros.
     *
     * @param codigo O código do guerreiro desejado.
     * @return Retorna a posição do guerreiro dentro do array. Deve retornar -1 se não houver guerreiro
     * com o código solicitado.
     */
    private int encontrePosicaoDeGuerreiro(String codigo) {
        int qtdExistente = qtdVivos + qtdMortos;
        int posicao = -1;       // a posição do guerreiro no array
        int qtdEncontrada = 0;  // quantidade de guerreiros encontrados
        int i = 0;              // posição no array a ser analisada

        // enquanto a posição não foi encontrada e ainda houver guerreiros a serem analisados...
        while (posicao == -1 && qtdEncontrada < qtdExistente) {
            // avançar dentro do array até encontrar um guerreiro
            while (guerreiros[i] == null)
                i++;
            qtdEncontrada++;
            if (guerreiros[i].getCodigo().equals(codigo))
                posicao = i;
            else
                i++;
        }

        return posicao;
    }

   
}
