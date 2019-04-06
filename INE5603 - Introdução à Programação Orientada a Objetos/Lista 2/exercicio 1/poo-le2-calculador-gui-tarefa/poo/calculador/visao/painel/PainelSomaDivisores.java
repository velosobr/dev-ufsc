package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelSomaDivisores extends PainelAbstratoUmNumero
{
    public PainelSomaDivisores(Calculador c)
    {
        super(c, "Calcular a Soma dos Divisores", "Calcular");
    }

    @Override
    protected String executeCalculo(Calculador c, int numero) {
        return String.valueOf(c.calculeSomaDosDivisores(numero));
    }
}
