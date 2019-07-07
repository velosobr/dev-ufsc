/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodecartas;

import Interfaces.ICarta;

/**
 *
 * @author Linnety3
 */
public class Carta implements ICarta {

    private Personagem personagem;

    public Carta(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public int getValorTotalCarta() {

        return (personagem.getEnergia() + personagem.getHabilidade() + personagem.getVelocidade() + personagem.getResistencia());

    }

    @Override
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;

    }

    @Override
    public Personagem getPersonagem() {
        return this.personagem;

    }

}
