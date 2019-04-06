package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelDuplique extends PainelAbstratoSemParametro
{
    public PainelDuplique(ManipuladorDeArray ma)
    {
        super(ma, "Duplicar o Conteúdo do Arry", "Duplicar");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return 2 * TAM_RESULTADO_VARIAVEL;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        int[] duplicado = ma.dupliqueArray(numeros);

        return convertaArrayParaString(duplicado);
    }
}
