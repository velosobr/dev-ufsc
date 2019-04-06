package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public abstract class PainelAbstratoSemParametro extends PainelAbstrato
{
    public PainelAbstratoSemParametro(ManipuladorDeArray ma, String titulo, String nomeBotao) {
        super(ma, titulo, nomeBotao);
    }

    @Override
    protected void definaCampos() {
    }

    @Override
    protected boolean podeCalcular() {
        return true;
    }
}
