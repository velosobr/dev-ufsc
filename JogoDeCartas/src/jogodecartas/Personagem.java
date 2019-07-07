package jogodecartas;

import Enum.TipoPersonagem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Linnety3
 */
public class Personagem {

    int energia;
    int habilidade;
    int velocidade;
    int resistencia;
    TipoPersonagem tipo;

    public Personagem(int energia, int habilidade, int velocidade, int resistencia, TipoPersonagem tipo) {
        this.energia = energia;
        this.habilidade = habilidade;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public int getEnergia() {
        return energia;

    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

}
