package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;
import java.text.DecimalFormat;

public class PainelMediaDeTres extends PainelAbstratoTresNumeros
{
 
    public PainelMediaDeTres(Calculador c) {
        super(c,"Calcular Média de Três Números", "Calcular");
    }

    protected String executeCalculo(Calculador c, int n1, int n2, int n3) {
        float media = c.calculeMediaDeTresNumeros(n1, n2, n3);
        DecimalFormat df = new DecimalFormat("########.##");
        return df.format(media);
    }
}