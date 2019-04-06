package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelInverta extends PainelAbstratoSemParametro
{
    public PainelInverta(ManipuladorDeArray ma)
    {
        super(ma, "Inverter o Array", "Inverter");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        int[] invertidos = ma.inverta(numeros);
        return convertaArrayParaString(invertidos);
    }

}
