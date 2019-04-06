package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;
import java.text.DecimalFormat;

public class PainelMenorDeTres extends PainelAbstratoTresNumeros
{
 
    public PainelMenorDeTres(Calculador c) {
        super(c,"Encontrar Menor de Três Números", "Encontrar");
    }

    protected String executeCalculo(Calculador c, int n1, int n2, int n3) {
        int menor = c.encontreMenorDeTresNumeros(n1, n2, n3);
        DecimalFormat df = new DecimalFormat("#####");
        return df.format(menor);
    }
}
