package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelMultiplica extends PainelAbstratoDoisNumeros
{
    public PainelMultiplica(Calculador c) {
     super(c, "Multiplicar Dois Números", "Multiplicar");   
    }
    
    @Override
    protected String executeCalculo(Calculador c, int n1, int n2) {
        return String.valueOf(c.multiplique(n1, n2));
    }
}
