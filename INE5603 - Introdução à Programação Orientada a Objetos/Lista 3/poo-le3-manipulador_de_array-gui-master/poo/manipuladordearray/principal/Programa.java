package poo.manipuladordearray.principal;

import poo.manipuladordearray.visao.InterfaceComUsuario;
import poo.manipuladordearray.modelo.ManipuladorDeArray;


public class Programa
{
    public static void main(String[] args) {
        ManipuladorDeArray ma = new ManipuladorDeArray();
        InterfaceComUsuario igu = new InterfaceComUsuario(ma);
        
        igu.interaja();
    }
}
