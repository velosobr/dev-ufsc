package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPrimeiraPosicao extends PainelAbstratoUmNumero
{
    public PainelPrimeiraPosicao(ManipuladorDeArray ma)
    {
        super(ma, "Obter a Primeira Posição de Um Número", "Obter", "Número");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero) {
        return String.valueOf(ma.obtenhaPrimeiraPosicaoDeNumero(numeros, numero));
    }

}
