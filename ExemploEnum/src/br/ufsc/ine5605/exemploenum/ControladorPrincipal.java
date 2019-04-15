/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.exemploenum;

import java.util.ArrayList;

/**
 *
 * @author Linnety3
 */
public class ControladorPrincipal {

    private ArrayList<Cliente> clientes;
    private TelaCliente telaCliente;
    public ControladorPrincipal() {
        this.clientes = new ArrayList<>();
        telaCliente = new TelaCliente();
    }
    public void inicia() {
        //simplificando para ir direto para a tela de inclusão de clientes
        telaCliente.incluiCliente();
    }
    
    public void insereCLiente(int codigo, String nome, float saldoDevedor){
        Cliente cliente = new Cliente(codigo, nome, saldoDevedor);
        
        //Verificar se o cliente já existe na lista, se codigo !=0, se..., se saldo devedor não é nulo ou negativo;
        clientes. add(cliente);
    }
    
    
}
