package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelEmPosicoes extends PainelAbstratoUmArray
{
    public PainelEmPosicoes(ManipuladorDeArray ma)
    {
        super(ma, "Obter Números em Posições", "Obter", "Posições");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int[] posicoes) {
        int[] resultado = ma.obtenhaDasPosicoes(numeros, posicoes);
        return convertaArrayParaString(resultado);
    }

}
