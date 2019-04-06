package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelParte extends PainelAbstratoDoisNumeros
{
    public PainelParte(ManipuladorDeArray ma)
    {
        super(ma, "Obter Uma Parte do Array", "Obter", "Quantidade", "Posição");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int qtd, int posicao) {
        int[] parte = ma.obtenhaParte(numeros, qtd, posicao);
        return convertaArrayParaString(parte);
    }
}
