/*
 * Um objeto desta classe é capaz de gerar um conjunto de cidadãos. Os
 * cidadãos podem ser gerados com dados aleatórios ou definidos explicitamente
 * na própria classe.
 */
public class GeradorDePopulacao
{    
    /**
     * Gera um conjunto de cidadãos (objeto da classe Cidadao) com dados aleatórios.
     *
     * @param quantidade A quantidade de cidadãos desejada.
     * @param anoInicial O menor ano de nascimento possível.
     * @param anosDeVida A maior idade possível.
     * @param rendaMinima A renda mínima.
     * @param incrementoDaRenda O valor que pode ser incrementado à renda mínima.
     * @param faixasDeIncremento Quantas faixas de renda pode haver.
     * @return Um conjunto de cidadãos.
     */
    public Cidadao[] gereAleatoriamente(int quantidade, int anoInicial, int anosDeVida, int rendaMinima, 
                                        int incrementoDaRenda, int faixasDeIncremento) {
        Cidadao[] populacao = new Cidadao[quantidade];
        java.util.Random random = new java.util.Random();
        int anoNascimento;
        int renda;

        for (int i = 0; i < quantidade; i++) {
            anoNascimento = anoInicial + random.nextInt(anosDeVida);
            renda = rendaMinima + incrementoDaRenda * random.nextInt(faixasDeIncremento);
            populacao[i] = new Cidadao(anoNascimento, renda);
        }

        return populacao;
    }

    /**
     * Gera um conjunto de cidadãos manualmente.
     *
     * @return O conjunto de cidadãos.
     */
    public Cidadao[] gereManualmente() {
        return new Cidadao[] {
            new Cidadao(1987,4000),
            new Cidadao(2001,3500),
            new Cidadao(1974,1500),
            new Cidadao(1945, 900)
        };
    }
}
