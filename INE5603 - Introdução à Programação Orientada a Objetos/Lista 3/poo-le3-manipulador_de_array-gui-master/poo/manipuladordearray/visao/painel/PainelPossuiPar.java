package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPossuiPar extends PainelAbstratoSemParametro
{
    public PainelPossuiPar(ManipuladorDeArray ma)
    {
        super(ma, "Verificar se Array Possui Número Par", "Verificar");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return ma.possuiNumeroPar(numeros) ? "SIM" : "NAO";
    }
}
