package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPosicoesImpares extends PainelAbstratoSemParametro
{

    public PainelPosicoesImpares(ManipuladorDeArray ma) {
        super(ma, "Obter Números em Posições Ímpares", "Obter");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }

    @Override 
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return convertaArrayParaString(ma.encontreEmPosicoesImpares(numeros));
    }
}
