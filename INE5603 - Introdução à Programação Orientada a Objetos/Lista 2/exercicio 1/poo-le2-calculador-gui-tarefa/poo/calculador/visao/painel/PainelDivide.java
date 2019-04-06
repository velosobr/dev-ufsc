package poo.calculador.visao.painel;


import poo.calculador.modelo.Calculador;

public class PainelDivide extends PainelAbstratoDoisNumeros
{
    public PainelDivide(Calculador c) {
     super(c, "Dividir Dois Números", "Dividir");   
    }
    
    @Override
    protected String executeCalculo(Calculador c, int n1, int n2) {
        return n2 == 0 ? "ERRO" : String.valueOf(c.divida(n1, n2));
    }
}
