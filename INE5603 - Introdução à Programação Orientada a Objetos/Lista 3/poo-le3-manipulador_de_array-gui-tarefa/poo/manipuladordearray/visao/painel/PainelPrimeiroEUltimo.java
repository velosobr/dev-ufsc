package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPrimeiroEUltimo extends PainelAbstratoSemParametro
{
    public PainelPrimeiroEUltimo(ManipuladorDeArray ma) {
        super(ma, "Obter Primeiro e Último Números", "Obter");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO * 2;
    }

    @Override 
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return convertaArrayParaString(ma.obtenhaPrimeiroEUltimo(numeros));
    }
}
