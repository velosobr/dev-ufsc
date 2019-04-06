package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelCopiaNPrimeiros extends PainelAbstratoUmNumero
{

    public PainelCopiaNPrimeiros(ManipuladorDeArray ma)
    {
        super(ma, "Obter Cópia dos N Primeiros Números", "Obter", "Quantidade");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int qtd) {
        int[] copia = ma.copieNPrimeiros(numeros, qtd);
        return convertaArrayParaString(copia);
    }
}
