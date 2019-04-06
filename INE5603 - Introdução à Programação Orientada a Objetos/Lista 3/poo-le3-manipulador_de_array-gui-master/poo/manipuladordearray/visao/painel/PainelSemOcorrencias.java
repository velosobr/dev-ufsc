package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelSemOcorrencias extends PainelAbstratoUmNumero
{
    public PainelSemOcorrencias(ManipuladorDeArray ma)
    {
        super(ma, "Obter Array Sem Ocorrências de Número", "Obter", "Número");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero) {
        return convertaArrayParaString(ma.obtenhaSemOcorrencias(numeros, numero));
    }
}
