package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelCopia extends PainelAbstratoSemParametro
{
    public PainelCopia(ManipuladorDeArray ma)
    {
        super(ma, "Obter Cópia do Array", "Obter");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return convertaArrayParaString(ma.obtenhaCopia(numeros));
    }
}
