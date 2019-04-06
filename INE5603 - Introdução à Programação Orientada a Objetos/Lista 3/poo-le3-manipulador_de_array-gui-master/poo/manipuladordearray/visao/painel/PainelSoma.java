package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelSoma extends PainelAbstratoSemParametro
{

    public PainelSoma(ManipuladorDeArray ma) {
        super(ma, "Somar Os Números do Array", "Somar");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return String.valueOf(ma.calculeSoma(numeros));
    }
}
