

/**
 * Classe que representa um guerreiro.
 * 
 */
public class Guerreiro
{
    // código de identificação do guerreiro. Cada guerreiro possui um código único.
    String codigo;
    
    // quantas vidas o guerreiro possui
    int numVidas;
    
    // qual o número máximo de vidas que um guerreiro pode ter
    final int MAX_VIDAS;
     
   
    /**
     * Cria um guerreiro a partir do seu código e o número máximo de vidas que pode ter. Ele nasce
     * com o máximo de vidas possível.
     *
     * @param codigo O código do guerreiro.
     * @param maxVidas O número máximo de vidas que o guerreiro pode ter.
     */
    public Guerreiro(String codigo, int maxVidas)
    {
        this.codigo = codigo;
        this.numVidas = maxVidas;
        this.MAX_VIDAS = maxVidas;
    }

    
    /**
     * Método usado pelo guerreiro para criar uma cópia de si mesmo. Veja o método clone.
     */
    private Guerreiro(String codigo, int maxVidas, int numVidas) {
        this.codigo = codigo;
        this.numVidas = numVidas;
        this.MAX_VIDAS = maxVidas;
    }
    
    /**
     * Obtém o código de identificação do guerreiro.
     *
     * @return Retorna o código de identificação do guerreiro.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtém o número de vidas do guerreiro.
     *
     * @return Retorna o número de vidas do guerreiro.
     */
    public int getNumVidas() {
        return numVidas;
    }

    /**
     * Verifica se o guerreiro está vivo, ou seja, se possui pelo menos uma vida.
     *
     * @return Retorna true se estiver vivo ou false caso contrário.
     */
    public boolean estaVivo() {
        return numVidas > 0;
    }

    /**
     * Aumenta em um o número de vidas do guerreiro, limitado ao número máximo de vidas
     * que pode ter
     */
    public void ganheVida() {
        if (numVidas < MAX_VIDAS)
            numVidas++;
    }

    /**
     * Diminui em um o número de vidas do guerreiro, limitado a zero vidas.
     *
     */
    public void percaVida() {
        if (numVidas > 0)
            numVidas--;
    }
    
    /**
     * Obtém uma cópia idêntica do guerreiro.
     *
     * @return Retorna uma cópia do guerreiro.
     */
    public Guerreiro clone() {
        return new Guerreiro(codigo, MAX_VIDAS, numVidas);
    }
}
