package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelSubstituiUltimaOcorrencia extends PainelAbstratoDoisNumeros
{
    public PainelSubstituiUltimaOcorrencia(ManipuladorDeArray ma) 
    {
        super(ma, "Substitui Primeira Ocorrência de Número", "Substitua", "Número", "Substituir por");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero, int substituto) {
        ma.substituaUltimaOcorrencia(numeros, numero, substituto);
        this.jtfNumeros.setText(convertaArrayParaString(numeros));
        return "ver acima";
    }
}
