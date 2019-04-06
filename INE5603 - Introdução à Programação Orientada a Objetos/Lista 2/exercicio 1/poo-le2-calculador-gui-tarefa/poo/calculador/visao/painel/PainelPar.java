package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelPar extends PainelAbstratoUmNumero
{
    public PainelPar(Calculador c) {
        super(c, "Verificar se Número é par", "Verificar");

    }

    @Override
    protected String executeCalculo(Calculador c, int numero) {
        return c.ehPar(numero) ? "SIM" : "NÃO";
    }
}
