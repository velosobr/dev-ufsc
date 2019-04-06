package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelBissexto extends PainelAbstratoUmNumero
{

    public PainelBissexto(Calculador c) {
        super(c, "Verificar se Número é Ano Bissexto", "Verificar");
    }

    @Override
    protected String executeCalculo(Calculador c, int numero) {
        return c.ehBissexto(numero) ? "SIM" : "NÃO";
    }

}
