package poo.calculador.principal;

import poo.calculador.modelo.Calculador;
import poo.calculador.visao.InterfaceComUsuario;

public class Programa
{
    public static void main(String[] args) {
        Calculador calculador = new Calculador();
        InterfaceComUsuario iu = new InterfaceComUsuario(calculador);
        iu.interaja();
    }
}
