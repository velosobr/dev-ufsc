package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelMDC extends PainelAbstratoDoisNumeros
{
    public PainelMDC(Calculador c) {
        super(c, "Calcular o Máximo Divisor Comum", "Calcular");
    }
    
    @Override
    protected String executeCalculo(Calculador c, int n1, int n2) {
     return String.valueOf(c.calculeMDC(n1,n2));   
    }
}
