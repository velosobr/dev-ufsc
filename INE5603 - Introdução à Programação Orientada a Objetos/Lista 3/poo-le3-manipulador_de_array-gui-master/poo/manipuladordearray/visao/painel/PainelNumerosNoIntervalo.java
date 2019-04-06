package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelNumerosNoIntervalo extends PainelAbstratoDoisNumeros
{
    public PainelNumerosNoIntervalo(ManipuladorDeArray ma)
    {
        super(ma, "Obter Números no Intervalo", "Obter", "Lim. Inferior", "Lim. Superior");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int limInf, int limSup) {
        return convertaArrayParaString(ma.obtenhaNumerosNoIntervalo(numeros, limInf, limSup));
    }
}
