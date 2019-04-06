/**
 * Classe que descreve um navio.
 */
public class Navio
{
    // peso máximo suportado pelo navio
    int pesoMaximo;

    // peso de todos os containres (nunca pode ser superior ao pesoMaximo)
    int pesoAtual;

    // espaço para armazenar containers
    Container[] containers;

    // quantos containers o navio está carregando
    int numContainers;

    /**
     * Cria um navio a partir do peso máximo que pode carregar e da quantidade máxima de 
     * containers que pode levar.
     *
     * @param pesoMaximo O peso máximo que pode transportar.
     * @param qtdMaximaContainers A quantidade máxima de containers que pode levar.
     */
    public Navio(int pesoMaximo, int qtdMaximaContainers) {
        this.pesoMaximo = pesoMaximo;
        containers = new Container[qtdMaximaContainers];
        numContainers = 0;
        pesoAtual = 0;
    }

    /**
     * Obtém a capacidade máxima do navio, ou seja, o número máximo de containers que pode levar.
     *
     * @return Retorna a capacidade máxima do navio.
     */
    public int getCapacidadeMaxima() {
        return containers.length;
    }

    /**
     * Obtém o peso máximo que o navio consegue carregar sem afundar.
     *
     * @return Retorna o peso máximo.
     */
    public int getPesoMaximo() {
        return pesoMaximo;
    }

    /**
     * Obtém o número de containers que o navio está carregando.
     *
     * @return Retorna o número de containers que está levando.
     */
    public int getNumContainers() {
        return numContainers;
    }

    /**
     * Obtém o peso atual carregado, ou seja, o peso de todos os containers no navio.
     *
     * @return Retorna o peso dos containers.
     */
    public int getPesoAtual() {
        return pesoAtual;
    }

    /**
     * Tenta carregar um container no navio. Só consegue carregar se o container ainda não tiver sido 
     * carregado, se ainda houver espaço no navio e se o peso máximo suportado pelo navio não for ultrapassado com
     * o novo container.
     *
     * @param c O container a ser carregado.
     * @return Retorna true se foi possível carregar o container ou false caso contrário.
     */
    public boolean carregue(Container c) {
        // as três condições que precisam ser satisfeitas para poder carregar o container
        boolean podeCarregar = numContainers < containers.length && (pesoAtual + c.getPeso()) <= pesoMaximo && !estaCarregando(c.getCodigo());

        if (podeCarregar) {
            containers[encontrePosicaoLivre()] = c;
            numContainers++;
            pesoAtual = pesoAtual + c.getPeso();
        }

        return podeCarregar;
    }

    /**
     * Encontra uma posição disponível no array containers. Este método assume que sempre
     * haverá pelo menos uma posição disponível, isto é, que o navio não está cheio.
     *
     * @return A posição disponível no array.
     */
    private int encontrePosicaoLivre() {
        int posicao = 0;

        while (containers[posicao] != null)
            posicao++;

        return posicao;
    }

    /**
     * Tenta descarregar um container do navio a partir do código do container.
     *
     * @param codigo O código do container a ser descarregado.
     * @return Retorna o container descarregado ou null caso o navio não esteja levando
     * um container com o código informado.
     */
    public Container descarregue(String codigo) {
        int posicao = encontrePosicaoComCodigo(codigo);
        Container c;

        if (posicao == -1)
            c = null;
        else {
            c = containers[posicao];
            containers[posicao] = null;
            numContainers--;
            pesoAtual = pesoAtual - c.getPeso();
        }

        return c;
    }

    /**
     * Tenta encontrar a posição dentro do array do container que possui um determinado código.
     *
     * @param codigo O código do container.
     * @return Retorna a posição do container no array ou -1 caso não haja container com o código
     * informado.
     */
    private int encontrePosicaoComCodigo(String codigo) {
        int posicao = -1;
        int i = 0;
        int qtdEncontrados = 0;

        while (posicao == -1 && qtdEncontrados < numContainers) {
            while (containers[i] == null)
                i++;
            qtdEncontrados++;
            if (codigo.equals(containers[i].getCodigo()))
                posicao = i;
            else
                i++;
        }

        return posicao;
    }

    /**
     * Verifica se o navio está carregando um container a partir do seu código.
     *
     * @param codigo O código do container.
     * @return Retorna true se o navio estiver carregando o container ou false caso contrário.
     */
    public boolean estaCarregando(String codigo) {
        return encontrePosicaoComCodigo(codigo) != -1;
    }

    /**
     * Procura o código dos container cujo peso estejam abaixo de um peso limite.
     *
     * @param peso O peso limite.
     * @return Retorna o código dos containers.
     */
    public String[] procureCodigosAbaixoDePeso(int peso) {
        String[] temp = new String[numContainers];
        String[] codigos;
        int pos = 0;
        int qtdEncontrada = 0;

        for (int i = 1; i <= numContainers; i++) {
            while (containers[pos] == null)
                pos++;
            if (containers[pos].getPeso() < peso)
                temp[qtdEncontrada++] = containers[pos].getCodigo();
            pos++;
        }
        if (qtdEncontrada == numContainers)
            codigos = temp;
        else {
            codigos = new String[qtdEncontrada];
            for (int i = 0; i < qtdEncontrada; i++)
                codigos[i] = temp[i];
        }
        return codigos;
    }
}
