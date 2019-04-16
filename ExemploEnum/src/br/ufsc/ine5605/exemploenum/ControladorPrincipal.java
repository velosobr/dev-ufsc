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

    //constantes
    

    /**
     *public static final String[] TIPOSCLIENTES = {"ESPECIAL", "COMUM", "INADIMPLENTE"};
     * substituindo static final String por ENUM
     */
    public enum TIPOSCLIENTES {ESPECIAL, COMUM, INADIMPLENTE};
    private ArrayList<Cliente> clientes;
    private TelaCliente telaCliente;
    
    public ControladorPrincipal() {
        this.clientes = new ArrayList<>();
        telaCliente = new TelaCliente(this);
    }
    public void inicia() {
        //simplificando para ir direto para a tela de inclusão de clientes
        telaCliente.incluiCliente();
    }
    
    public void insereCliente(int codigo, String nome, float saldoDevedor, TIPOSCLIENTES tipoCliente){
        Cliente cliente = new Cliente(codigo, nome, saldoDevedor, tipoCliente);
        
        //Cliente Especial = 25% desconto
        if (cliente.getTipoCliente().equals(TIPOSCLIENTES.ESPECIAL)){
            cliente.setDescontoPadrao(25);
        } else if(cliente.getTipoCliente().equals(TIPOSCLIENTES.COMUM)){ //Cliente Comum = 10% desconto
            cliente.setDescontoPadrao(10);
        }else if (cliente.getTipoCliente().equals(TIPOSCLIENTES.INADIMPLENTE)){  //Cliente Inadimplente = 0% desconto
            cliente.setDescontoPadrao(0);
        }
        
        
        telaCliente.exibeDadosCliente(cliente.getCodigo(), cliente.getNome(), 
                cliente.getSaldoDevedor(), cliente.getDescontoPadrao(), cliente.getTipoCliente());
        //Verificar se o cliente já existe na lista, se codigo !=0, se..., se saldo devedor não é nulo ou negativo;
        clientes. add(cliente);
    }

    
}
