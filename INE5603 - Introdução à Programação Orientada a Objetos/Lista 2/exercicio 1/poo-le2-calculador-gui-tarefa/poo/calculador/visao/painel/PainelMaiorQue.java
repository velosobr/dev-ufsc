package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelMaiorQue extends PainelAbstratoDoisNumeros
{

    public PainelMaiorQue(Calculador c) {
        super(c, "Verificar Se Número É Maior Que Outro", "Verificar");   
    }

    @Override
    protected String executeCalculo(Calculador c, int n1, int n2) {
        return c.ehMaiorQue(n1, n2) ? "SIM" : "NÃO";
    }
}
