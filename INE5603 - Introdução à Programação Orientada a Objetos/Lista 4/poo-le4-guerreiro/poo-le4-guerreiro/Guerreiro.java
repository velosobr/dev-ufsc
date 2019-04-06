
/**
 * Escreva a descrição da classe Guerreiro aqui.
ok Ao ser cirado sabe-se o código de identificação do guerreiro (exemplo: "G001") 
e a quantidade máxima de vidas que o guerreiro pode ter. Ao nascer, o guerreiro possui 
a quantidade máxima de vidas.
Informar o código do guerreiro.
ok Informar quantas vidas o guerreiro tem no momento.
OK Informar se o guerreiro está vivo ou não. Um guerreiro está vivo ser possuir pelo menos uma vida.
OK Ganhar uma vida, respeitando a quantidade máxima de vidas.
ok Perder uma vida, sabendo que o limite é zero vidas.
Obter um clone do guerreiro, ou seja, gerar um novo guerreiro contendo exatamente as mesmas informações.
 */
public class Guerreiro{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String codigo;
    int numVidas;
    final int maxVidas;

    /**
     * Construtor para objetos da classe Guerreiro
     */
    public Guerreiro(String codigo, int maxVidas){
        this.codigo = codigo;
        this.numVidas = maxVidas;
        this.maxVidas = maxVidas;

    }

    private Guerreiro(String codigo, int maxVidas, int numVidas){
        this.codigo= codigo;
        this.maxVidas= maxVidas;
        this.numVidas= numVidas;
    }

    /** 
     * Informar o código do guerreiro 
     */
    public String getCodigo(){
        return codigo;
    }

    /**
     * Informar quantas vidas o guerreiro tem no momento.
     */
    public int getNumVidas(){
        return numVidas;
    }

    /** 
     * Informar se o guerreiro está vivo ou não. Um guerreiro está vivo ser possuir pelo menos uma vida.
     */
    public boolean estaVivo(){
        return numVidas>0;
    }

    /**
     * Ganhar uma vida, respeitando a quantidade máxima de vidas.
     */
    public void ganheVida(){
        if(numVidas<maxVidas)
            numVidas++;
    }

    /** 
     * Perder uma vida, sabendo que o limite é zero vidas.
     */
    public void perdeVida(){
        if(estaVivo())
            numVidas--;
    }

    /** 
     * Obter um clone do guerreiro, ou seja, gerar um novo guerreiro contendo exatamente 
     * as mesmas informações.
     */
    public Guerreiro clone(){
        return new Guerreiro(codigo, maxVidas, numVidas);
    }

}
