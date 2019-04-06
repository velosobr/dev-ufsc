package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPosicaoMaior extends PainelAbstratoSemParametro
{
    public PainelPosicaoMaior(ManipuladorDeArray ma) {
        super(ma, "Encontrar a Posição do Maior Número", "Encontrar");   
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return String.valueOf(ma.obtenhaPosicaoDoMaiorNumero(numeros));
    }

}
