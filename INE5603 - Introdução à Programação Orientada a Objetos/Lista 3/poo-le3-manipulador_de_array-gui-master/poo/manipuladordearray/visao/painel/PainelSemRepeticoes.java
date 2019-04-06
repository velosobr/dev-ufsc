package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelSemRepeticoes extends PainelAbstratoSemParametro
{
    public PainelSemRepeticoes(ManipuladorDeArray ma)
    {
        super(ma, "Verificar Se Não Possui Números Repetidos", "Verificar");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return ma.semRepeticoes(numeros) ? "SIM" : "NAO";
    }
}
