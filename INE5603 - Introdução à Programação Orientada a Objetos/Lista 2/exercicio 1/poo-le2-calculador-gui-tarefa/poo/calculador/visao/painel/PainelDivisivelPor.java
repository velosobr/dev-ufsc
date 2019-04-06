package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelDivisivelPor extends PainelAbstratoDoisNumeros
{
    public PainelDivisivelPor(Calculador c)
    {
        super(c, "Verificar se É Divisível Por", "Verificar");
    }

    @Override
    protected String executeCalculo(Calculador c, int n1, int n2) {
        return c.ehDivisivelPor(n1, n2) ? "SIM" : "NÃO";
    }
}
