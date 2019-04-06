package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPosicoes extends PainelAbstratoUmNumero
{
    public PainelPosicoes(ManipuladorDeArray ma)
    {
        super(ma, "Obter As Posições do Número no Array", "Obter", "Número");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero) {
        return convertaArrayParaString(ma.obtenhaPosicoesDeNumero(numeros, numero));
    }

}
