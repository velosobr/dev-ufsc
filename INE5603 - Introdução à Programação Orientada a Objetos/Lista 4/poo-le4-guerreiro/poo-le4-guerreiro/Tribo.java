
/**
 * Escreva a descrição da classe Tribo aqui.
Ao ser criada, a tribo sabe o seu nome (exemplo: "Tribo 51"), a quantidade máxima de 
guerreiros que pode haver e a quantidade máxima de vidas que cada guerreiro da tribo 
pode ter.

Informar o nome da tribo.

Informar quantos guerreiros estão vivos.

Informar quantos guerreiros estão mortos.

Informar a quantidade de guerreiros existentes (incluindo vivos e mortos)

Informar a quantidade máxima de guerreiros que pode haver na tribo.

Adicionar um guerreiro na tribo sabendo-se o seu código. As respostas possíveis devem ser: 
0 - ok, guerreiro foi adicionado; 
1 - guerreiro não foi adicionado porque já existe um guerreiro, vivo ou morto, com o código informado; 
2 - guerreiro não foi adicionado porque a tribo já está completa (não há mais lugar para novos guerreiros, incluindo vivos e mortos).

Remover um guerreiro da tribo sabendo-se o seu código. 
A resposta deve ser true se foi possível remover o guerreiro (estando ele vivo ou morto) 
ou false caso não exista guerreiro, vivo ou morto, com o código informado.

Curar um guerreiro sabendo-se o seu código. Curar significa dar uma vida ao guerreiro. 
Assim, um guerreiro morto pode voltar a ficar vivo. O método deve retornar true indicando 
que foi possível curar o guerreiro ou false indicando que não há guerreiro com o código 
informado.

Ferir um guerreiro sabendo-se o seu código. Ferir significa tirar uma vida do guerreiro. 
Assim, um guerreiro vivo pode ficar morto. O método deve retornar true se foi possível 
ferir o guerreiro ou false indicando que não há guerreiro com o código informado.

Informar todos os guerreiros que estão vivos. Deve ser retornado um array contendo uma 
cópia (clone) dos guerreiros vivos.

Informar todos os guerreiros que estão mortos. Deve ser retornado um array 
contendo uma cópia (clone) dos guerreiros mortos.
 */
public class Tribo{

    //Nome da Tribo
    String nome;

    //Criação dos guerreiros
    Guerreiro[] guerreiros;

    //quantidade de guerreiros vivos
    int qtdVivos;

    //quantidade de guerreiros mortos
    int qtdMortos;

    //maximo de vidas de um guerreiro
    final int MAX_VIDAS;

    public Tribo(String nome, int qtdGuerreiros, int maxVidas){
        this.nome = nome;
        guerreiros = new Guerreiro[qtdGuerreiros];
        qtdVivos = 0;
        qtdMortos = 0;
        MAX_VIDAS = maxVidas;
    }   

    /**
     * Obtém o nome da tribo.
     *
     * @return Retorna o nome da tribo.
     */

    public String getNome(){
        return nome;
    }

    /**
     * Informar quantos guerreiros estão vivos.
     */
    public int getVivos(){
        return qtdVivos;
    }

    /**
     * Informar quantos guerreiros estão mortos.
     */
    public int getMortos(){
        return qtdMortos;
    }

    /**
     * Informar a quantidade de guerreiros existentes (incluindo vivos e mortos)
     */
    public int getTotal(){
        return qtdMortos+qtdVivos;
    }

    /**
     * Informar a quantidade máxima de guerreiros que pode haver na tribo.
     */
    public int getQtdGuerreiros(){
        return guerreiros.length;
    }

    /**
     * Encontra a posição de um guerreiro dentro do array de guerreiros.
     *
     * @param codigo O código do guerreiro desejado.
     * @return Retorna a posição do guerreiro dentro do array. 
     * Deve retornar -1 se não houver guerreiro
     * com o código solicitado.
     */
    
    public int encontrePosicacaoDeGuerreiro(String codigo){
        int posicao = -1;
        int qtdExistente = qtdMortos+qtdVivos;
        int i = 0;
        int qtdAchados;
        // enquanto a posição não foi encontrada e ainda houver guerreiros a serem analisados...
        while(posicao == -1 && qtdAchados<qtdExistente){
            //percorrer array até encontrar um guerreiro
            while(guerreiros[i] == null)
            i++;
            qtdAchados++;
            if(guerreiros[i].getCodigo().equals(codigo))
            posicao=i;
            else
            i++;
            
        }
        return posicao;
    }

    /**
     * Adicionar um guerreiro na tribo sabendo-se o seu código. 
     * As respostas possíveis devem ser: 
     * 0 - ok, guerreiro foi adicionado; 
     * 1 - guerreiro não foi adicionado porque já existe um guerreiro, vivo ou morto, 
     * com o código informado; 
     * 2 - guerreiro não foi adicionado porque a tribo já está completa 
     * (não há mais lugar para novos guerreiros, incluindo vivos e mortos).
     */

    public void adicionaGuerreiro(int codigo)

}
