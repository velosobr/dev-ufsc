package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

public class PainelAmigos extends PainelAbstratoDoisNumeros
{
    public PainelAmigos(Calculador c) {
        super(c, "Verificar se Dois Números São Amigos", "Verificar");
    }
    
    @Override
    protected String executeCalculo(Calculador c, int n1, int n2) {
        return c.saoAmigos(n1, n2) ? "SIM" : "NÃO";
    }
}
