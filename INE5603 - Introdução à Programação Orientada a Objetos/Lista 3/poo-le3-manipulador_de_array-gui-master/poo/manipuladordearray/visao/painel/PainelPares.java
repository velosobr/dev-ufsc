package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelPares extends PainelAbstratoSemParametro
{
    public PainelPares(ManipuladorDeArray ma) {
        super(ma, "Obter os Números pares", "Obter");
    }
    
    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_VARIAVEL;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
     int[] pares = ma.obtenhaPares(numeros);
     
     return convertaArrayParaString(pares);
    }
}
