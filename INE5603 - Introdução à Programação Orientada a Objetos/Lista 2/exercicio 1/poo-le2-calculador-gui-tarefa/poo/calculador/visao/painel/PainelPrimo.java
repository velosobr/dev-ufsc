package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelPrimo extends PainelAbstratoUmNumero
{
    public PainelPrimo(Calculador c) {
        super(c, "Verificar Se Número É Primo", "Verificar");
    }

    @Override
    protected String executeCalculo(Calculador c, int numero) {
        return c.ehPrimo(numero) ? "SIM" : "NÃO";   
    }
}
