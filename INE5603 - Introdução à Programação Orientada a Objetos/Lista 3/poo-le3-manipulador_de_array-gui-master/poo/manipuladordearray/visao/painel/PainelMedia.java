package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelMedia extends PainelAbstratoSemParametro
{
    public PainelMedia(ManipuladorDeArray ma) {
        super(ma, "Calcular a Média dos Números", "Calcular");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return String.valueOf(ma.calculeMedia(numeros));
    }
}
