package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelSubstituiOcorrencias extends PainelAbstratoDoisNumeros
{
    public PainelSubstituiOcorrencias(ManipuladorDeArray ma)
    {
        super(ma, "Substitui Todas as Ocorrências de Número", "Substitua", "Número", "Substituir por");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero, int substituto) {
        ma.substituaTodasOcorrencias(numeros, numero, substituto);
        this.jtfNumeros.setText(convertaArrayParaString(numeros));
        return "ver acima";
    }
}
