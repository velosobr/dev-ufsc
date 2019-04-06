/**
 * Um objeto desta classe representa um cidadão.
 */
public class Cidadao
{
    int anoNascimento;
    int renda;
    
    
    /**
     * Cria um novo cidadão com base no seu ano de nascimento e renda.
     *
     * @param anoNascimento O ano de nascimento do cidadão.
     * @param renda A renda do cidadão.
     */
    public Cidadao(int anoNascimento, int renda) {
        this.anoNascimento = anoNascimento;
        this.renda = renda;
    }
    
    /**
     * Obtém o ano de nascimento do cidadão.
     *
     * @return Retorna o ano de nascimento do cidadão.
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    /**
     * Obtém a renda do cidadão.
     *
     * @return Retorna a renda do cidadão.
     */
    public int getRenda() {
        return renda;
    }
    
    /**
     * Calcula a idade do cidadão com base no ano atual.
     *
     * @param anoAtual O ano atual.
     * @return A idade do cidadão.
     */
    public int calculeIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
