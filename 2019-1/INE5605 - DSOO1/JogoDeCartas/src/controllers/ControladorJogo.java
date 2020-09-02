package controllers;

import Enum.TipoPersonagem;
import Interfaces.IControladorJogo;
import java.util.ArrayList;
import java.util.List;
import jogodecartas.Carta;
import jogodecartas.Jogador;
import jogodecartas.Mesa;
import jogodecartas.Personagem;

/**
 *
 * @author Linnety3
 */
public class ControladorJogo implements IControladorJogo {

    private List<Personagem> personagens = new ArrayList<>();
    private List<Carta> baralho = new ArrayList<>();
    private List<Jogador> jogadores = new ArrayList<>();
    private Jogador jogadorVencedor = null;

    @Override
    public Personagem incluiPersonagemNaLista(int energia, int habilidade, int velocidade, int resistencia, TipoPersonagem tipo) {
        Personagem personagem = new Personagem(energia, habilidade, velocidade, resistencia, tipo);
        personagens.add(personagem);
        return personagem;

    }

    @Override
    public Carta incluiCartaNoBaralho(Personagem personagem) {
        Carta novaCarta = new Carta(personagem);
        baralho.add(novaCarta);
        return novaCarta;
    }

    @Override
    public Jogador incluiJogador(String nome) {
        Jogador novoJogador = new Jogador(nome);
        jogadores.add(novoJogador);
        return novoJogador;
    }

    @Override
    public void iniciaJogo(Jogador jogador1, Jogador jogador2) {
        int numeroCarta = 0;

        for (int i = 0; i < 10; i += 2) {
            numeroCarta = (int) (Math.random() * (baralho.size() - 1));
            Carta cartaSelecionada = baralho.get(numeroCarta);
            baralho.remove(cartaSelecionada);
            jogador1.incluiCartaNaMao(cartaSelecionada);

            numeroCarta = (int) (Math.random() * (baralho.size() - 1));
            cartaSelecionada = baralho.get(numeroCarta);
            baralho.remove(cartaSelecionada);
            jogador2.incluiCartaNaMao(cartaSelecionada);

        }
    }

    @Override
    public Jogador jogada(Mesa mesa) {
        System.out.println("ENTROU NA JOGADA");

        if (mesa.getJogador2().getMao().isEmpty() == true) {
            this.jogadorVencedor = mesa.getJogador1();
            return jogadorVencedor;
        }

        if (mesa.getJogador1().getMao().isEmpty() == true) {
            this.jogadorVencedor = mesa.getJogador2();
            return jogadorVencedor;
        }

        if (mesa.getCartajogador1().getValorTotalCarta() < mesa.getCartajogador2().getValorTotalCarta()) {
            mesa.getJogador2().incluiCartaNaMao(mesa.getCartajogador1());

        } else if (mesa.getCartajogador1().getValorTotalCarta() > mesa.getCartajogador2().getValorTotalCarta()) {
            mesa.getJogador1().incluiCartaNaMao(mesa.getCartajogador2());

        }
        return null;

    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(List<Carta> baralho) {
        this.baralho = baralho;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

}
