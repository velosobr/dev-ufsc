package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;
import javax.swing.*;

public class PainelQuantasOcorrencias extends PainelAbstratoUmNumero
{

    public PainelQuantasOcorrencias(ManipuladorDeArray ma) {
        super(ma, "Contar Número de Ocorrências de Número em Array", "Contar", "Número");
    }

    @Override
    protected int definaTamanhoDoResultado() {
        return TAM_RESULTADO_FIXO;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero) {
        return String.valueOf(ma.conteQuantasOcorrencias(numeros, numero));
    }
}
