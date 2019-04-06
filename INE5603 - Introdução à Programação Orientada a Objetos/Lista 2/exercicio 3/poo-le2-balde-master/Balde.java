/**
 * Classe que representa um balde. Um balde é um tipo de objeto que serve para armazenar água.
 */
public class Balde
{
    final int CAPACIDADE; // quantos litros de água o balde é capaz de armazenar.
    int quantidade; // quantos litros de água o balde contém.

    /**
     * Inicializa o balde com a sua capacidade, que não pode mais ser alterada, e inicialmente está vazio.
     *
     * @param capacidade A capacidade do balde.
     */
    public Balde(int capacidade) {
        CAPACIDADE = capacidade;
        quantidade = 0;
    }

    /**
     * Faz com que o balde fique vazio.
     *
     */
    public void fiqueVazio() {
        quantidade = 0;
    }

    /**
     * Faz com que o balde fique cheio.
     *
     */
    public void fiqueCheio() {
        quantidade = CAPACIDADE;
    }

    /**
     * Encontra a quantidade de água que o balde contém no momento.
     *
     * @return Retorna a quantidade de água existente no balde.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * O balde recebe a água existente no outro balde. Nesta operação não há desperdício de água.
     *
     * @param outroBalde O balde que doará sua água.
     */
    public void recebaDe(Balde outroBalde) {
        int disponivel = CAPACIDADE - quantidade;

        if (disponivel >= outroBalde.quantidade) {
            quantidade = quantidade + outroBalde.quantidade;
            outroBalde.quantidade = 0;
        }
        else {
            quantidade = CAPACIDADE;
            outroBalde.quantidade = outroBalde.quantidade - disponivel;
        }
    }

    /**
     * O balde derrama sua água em outro balde. Nesta operação não há desperdício de água.
     *
     * @param outroBalde O balde que receberá água.
     */
    public void derrameEm(Balde outroBalde) {
        outroBalde.recebaDe(this);
    }
}
