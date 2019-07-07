package jogodecartas;

import Interfaces.IJogador;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Linnety3
 */
public class Jogador implements IJogador {

    private String nome;
    private ArrayList<Carta> mao = new ArrayList<>();

    public Jogador(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;

    }

    /**
     * Retira uma das cartas do Jogador. Esta operacao eh utilizada para
     * realizar uma jogada (baixar uma carta na mesa) A carta sai da mao (ou
     * seja, a carta sai da lista das cartas que o jogador possui)
     *
     * @return Retorna a Carta qiue foi retirada da mao do jogador (lista das
     * cartas que ele possui)
     */
    @Override
    public Carta baixaCartaDaMao() {
        int numeroDaCarta = (int) (Math.random() * (mao.size() - 1));
        Carta cartaDaMao = mao.get(numeroDaCarta);
        this.removeCartaNaMao(mao.get(numeroDaCarta));

        return cartaDaMao;
    }

    /**
     *
     * @return Retorna a mao atual do jogador (lista das cartas que ele possui)
     */
    @Override
    public ArrayList<Carta> getMao() {
        return this.mao;

    }

    /**
     * Inclui na mao do jogador a carta passada como parametro
     *
     * @param carta Carta que sera incluida na mao do jogador
     */
    @Override
    public void incluiCartaNaMao(Carta carta) {
        mao.add(carta);
    }

    /**
     * Retira da mao do jogador a carta passada como parametro.
     *
     * @param carta Carta que sera retirada da mao do jogador (lista das cartas
     * que ele possui)
     */
    @Override
    public void removeCartaNaMao(Carta carta) {
        mao.remove(carta);

    }

}
