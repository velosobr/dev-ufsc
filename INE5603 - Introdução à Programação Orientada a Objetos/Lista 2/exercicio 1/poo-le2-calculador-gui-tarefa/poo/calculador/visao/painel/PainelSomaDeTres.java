package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;
import java.text.DecimalFormat;

public class PainelSomaDeTres extends PainelAbstratoTresNumeros 
{
    public PainelSomaDeTres(Calculador c) {
        super(c,"Calcular a Soma de Três Números", "Calcular");
    }
    
    protected String executeCalculo(Calculador c, int n1, int n2, int n3) {
        int soma = c.calculeSomaDeTresNumeros(n1, n2, n3);
        DecimalFormat df = new DecimalFormat("#####");
        return df.format(soma);
    }
}
