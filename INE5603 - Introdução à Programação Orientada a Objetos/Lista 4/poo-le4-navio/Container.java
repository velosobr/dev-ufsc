
/**
 * Escreva a descrição da classe Container aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Container
{
    int cod_identificacao;
    int peso_atual;

    public Container(int cod_id, int peso)
    {
        cod_identificacao = cod_id;
        peso_atual = peso;
    }

    public int getPeso()
    {
        return peso_atual;
    }
    public int getCodId(){
    return cod_identificacao;
    }
}
