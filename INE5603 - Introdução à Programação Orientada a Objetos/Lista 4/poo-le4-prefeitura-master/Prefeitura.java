/**
 * Um objeto desta classe representa uma prefeitura.
 */
public class Prefeitura
{
    Cidadao[] populacao;

    /**
     * Cria uma prefeitura para uma população de cidadãos.
     *
     * @param populacao A população da cidade.
     */
    public Prefeitura(Cidadao[] populacao) {
        this.populacao = populacao;
    }

    /**
     * Calcula quantos cidadãos são administrados pela prefeitura.
     *
     * @return Retorna a quantiadade de cidadãos.
     */
    public int getTamanhoDaPopulacao() {
        return populacao.length;
    }

    /**
     * Calcula qual seria o orçamento necessário para garantir uma renda mínima
     * para todos os cidadãos.
     *
     * @param rendaMinima A renda mínima.
     * @return Retorna o orçamento.
     */
    public int calculeOrcamentoParaRendaMinima(int rendaMinima) {
        int orcamento = 0;

        for (Cidadao c : populacao)
            if (c.getRenda() < rendaMinima)
                orcamento += rendaMinima - c.getRenda();

        return orcamento;
    }

    /**
     * Calcula a renda média da população
     *
     * @return Retorna a renda média da população.
     */
    public float calculeRendaMedia() {
        int rendaTotal = 0;

        for (Cidadao c : populacao)
            rendaTotal += c.getRenda();

        return rendaTotal / (1.0f * populacao.length);
    }

    /**
     * Calcula a renda média dos cidadãos que estão em uma determinada faixa etária.
     *
     * @param idadeInicial A idade inicial da faixa etária.
     * @param idadeFinal A iadde final da faixa etária.
     * @param anoAtual O ano atual.
     * @return Retorna a renda média.
     */
    public float calculeRendaMediaNaFaixaEtaria(int idadeInicial, int idadeFinal, int anoAtual) {
        int rendaNaFaixa = 0;
        int qtdNaFaixa = 0;
        float rendaMediaNaFaixa;

        for (Cidadao c : populacao)
            if (c.calculeIdade(anoAtual) >= idadeInicial && c.calculeIdade(anoAtual) <= idadeFinal) {
                rendaNaFaixa += c.getRenda();
                qtdNaFaixa++;
            }

        if (qtdNaFaixa == 0)
            rendaMediaNaFaixa = 0.0f;
        else
            rendaMediaNaFaixa = rendaNaFaixa / (1.0f * qtdNaFaixa);

        return rendaMediaNaFaixa;
    }

    /**
     * Calcula a quantidade de idosos na população.
     *
     * @param idadeIdoso A idade mínima para ser considerado idoso.
     * @param anoAtual O ano atual.
     * @return Retorna a quantidade de idosos.
     */
    public int calculeQtdIdosos(int idadeIdoso, int anoAtual) {
        int qtdIdosos = 0;

        for (Cidadao c : populacao)
            if (c.calculeIdade(anoAtual) >= idadeIdoso)
                qtdIdosos++;

        return qtdIdosos;
    }

    /**
     * Encontra todos os cidadãos cuja renda seja maior ou igual a uma renda limite.
     *
     * @param renda A renda limite.
     * @return Retorna o conjunto de cidadãos.
     */
    public Cidadao[] encontreCidadaosComRendaMaiorOuIgualA(int renda) {
        Cidadao[] cidadaos;
        int qtd = 0;
        Cidadao[] cidadaosAux = new Cidadao[populacao.length];

        for (Cidadao c : populacao)
            if (c.getRenda() >= renda)
                cidadaosAux[qtd++]= c;

        if (qtd == populacao.length)
            cidadaos = cidadaosAux;
        else {
            cidadaos = new Cidadao [qtd];
            for (int i = 0; i < qtd; i++)
                cidadaos[i] = cidadaosAux[i];
        }

        return cidadaos;
    }

    /**
     * Encontra os N primeiros cidadãos cuja renda seja inferior a uma renda limite.
     *
     * @param n A quandidade de cidadãos desejada.
     * @param renda A renda limite.
     * @return Retorna o conjunto de N cidadãos.
     */
    public Cidadao[] encontreNPrimeirosCidadaosComRendaInferiorA(int n, int renda) {
        Cidadao[] cidadaos;
        int qtd = 0;
        Cidadao[] cidadaosAux = new Cidadao[n];
        int i = 0;

        while (qtd < n && i < populacao.length) {
            if (populacao[i].getRenda() < renda)
                cidadaosAux[qtd++]= populacao[i];
            i++;
        }

        if (qtd == n)
            cidadaos = cidadaosAux;
        else {
            cidadaos = new Cidadao [qtd];
            for (int j = 0; j < qtd; j++)
                cidadaos[j] = cidadaosAux[j];
        }

        return cidadaos;
    }
}
