package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelMultiplicadoPorFator extends PainelAbstratoUmNumero
{
    public PainelMultiplicadoPorFator(ManipuladorDeArray ma) {
        super(ma, "Obter Cópia Multiplicada por Fator", "Obter", "Fator");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int fator) {
        int[] numerosMultiplicados = ma.obtenhaMultiplicadoPorFator(numeros, fator);
        return convertaArrayParaString(numerosMultiplicados);
    }

}
