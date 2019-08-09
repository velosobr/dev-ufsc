/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaprincipal;

/**
 *
 * @author Linnety3
 */
public class ControladorClientes {

    private static ControladorClientes instancia;

    public static ControladorClientes getInstancia(){
        if(instancia == null)
            instancia = new ControladorClientes();
        return instancia;
    }
}
