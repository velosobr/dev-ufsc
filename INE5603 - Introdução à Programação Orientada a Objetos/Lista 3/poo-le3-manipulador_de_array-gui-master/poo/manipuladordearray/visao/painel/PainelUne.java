package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelUne extends PainelAbstratoUmArray
{
    public PainelUne(ManipuladorDeArray ma)
    {
        super(ma, "Unir Dois Arrays", "Unir", "Unir com");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL * 2;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros1, int[] numeros2) {
        int[] unidos = ma.unaArrays(numeros1, numeros2);
        return convertaArrayParaString(unidos);
    }
}
