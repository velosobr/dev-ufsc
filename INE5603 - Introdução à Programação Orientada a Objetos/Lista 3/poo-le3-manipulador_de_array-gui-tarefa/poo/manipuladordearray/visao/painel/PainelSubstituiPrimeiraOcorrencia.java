package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelSubstituiPrimeiraOcorrencia extends PainelAbstratoDoisNumeros
{

    public PainelSubstituiPrimeiraOcorrencia(ManipuladorDeArray ma)
    {
        super(ma, "Substitui Primeira Ocorrência de Número", "Substitua", "Número", "Substituir por");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero, int substituto) {
        ma.substituaPrimeiraOcorrencia(numeros, numero, substituto);
        this.jtfNumeros.setText(convertaArrayParaString(numeros));
        return "ver acima";
    }

}
