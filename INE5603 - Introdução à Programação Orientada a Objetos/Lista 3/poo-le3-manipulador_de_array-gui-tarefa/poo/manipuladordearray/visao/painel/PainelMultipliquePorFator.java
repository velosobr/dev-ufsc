package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelMultipliquePorFator extends PainelAbstratoUmNumero
{
    public PainelMultipliquePorFator(ManipuladorDeArray ma) {
        super(ma, "Multiplicar Array Por Fator", "Multiplicar", "Fator");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int fator) {
        ma.multipliquePorFator(numeros, fator);
        String numerosComoString = convertaArrayParaString(numeros);
        jtfNumeros.setText(numerosComoString);
        return "ver acima";
    }
}
