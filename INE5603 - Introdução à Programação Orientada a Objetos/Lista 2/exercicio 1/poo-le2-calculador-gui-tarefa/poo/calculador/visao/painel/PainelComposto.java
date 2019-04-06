package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelComposto extends PainelAbstratoUmNumero
{
    public PainelComposto(Calculador c) {
        super(c, "Verificar se Número É Composto", "Verificar");
    }
    
    @Override
    protected String executeCalculo(Calculador c, int numero) {
        return c.ehComposto(numero) ? "SIM" : "NÃO";
    }
}
