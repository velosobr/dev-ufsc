package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelMaior extends PainelAbstratoSemParametro
{

    public PainelMaior(ManipuladorDeArray ma) {
        super(ma, "Encontrar o Maior Número do Array", "Encontrar");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return String.valueOf(ma.obtenhaMaiorNumero(numeros));
    }
}