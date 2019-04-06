package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

public class PainelQuantidadeAcimaLimite extends PainelAbstratoUmNumero
{
    public PainelQuantidadeAcimaLimite(ManipuladorDeArray ma) {
        super(ma, "Calcular Quantidade Acima de Limite", "Calcular", "Limite");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int limite) {
        return String.valueOf(ma.conteQuantidadeAcimaDeLimite(numeros, limite));
    }
}
