/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.exemploenum;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Linnety3
 */
class TelaCliente {
    private Scanner teclado;
    private ControladorPrincipal controladorPrincipal;
    
    public TelaCliente(ControladorPrincipal controladorPrincipal){
    teclado = new Scanner(System.in);
    this.controladorPrincipal = controladorPrincipal;
    
}

    void incluiCliente() {
        System.out.println("---- INCLUSAO DE CLIENTE ----");
        
        System.out.println("Codigo: ");
        int codigo = recebeValorInteiro();
        System.out.println("Nome: ");
        String nome = recebeValorString();
        System.out.println("Saldo devedor: ");
        float saldo = recebeValorFloat();
        System.out.println("Tipo do Cliente [0 - Especial, 1 - Comum, 2 - Inadimplente]: ");
        
        //escolha do tipo
        int escolhaTipo = recebeValorInteiro();
        ControladorPrincipal.TIPOSCLIENTES tipo;
        
        switch(escolhaTipo){
            case 0: tipo = ControladorPrincipal.TIPOSCLIENTES.ESPECIAL;
            break;
            case 1: tipo = ControladorPrincipal.TIPOSCLIENTES.COMUM;
            break;
            case 2: tipo = ControladorPrincipal.TIPOSCLIENTES.INADIMPLENTE;
            break;
            default: tipo = ControladorPrincipal.TIPOSCLIENTES.COMUM;
            break;
        }
                
        controladorPrincipal.insereCliente(codigo, nome, saldo, tipo);
    }

    private int recebeValorInteiro() {
        int valor = 0;
        
        try{
            valor = teclado.nextInt();
            teclado.nextLine();
        } catch (Exception e){
            System.out.println("Valor invalido! Digite um numero inteiro");
        }
        return valor;
   }

    private String recebeValorString() {
        return teclado.nextLine();
    }

    private float recebeValorFloat() {
       float valor = 0;
        
        try{
            valor = teclado.nextFloat();
            teclado.nextLine();
        } catch (Exception e){
            System.out.println("Valor invalido! Digite um numero com virgula");
        }
        return valor;
    }

    public void exibeDadosCliente(int codigo, String nome, float saldoDevedor, int descontoPadrao, ControladorPrincipal.TIPOSCLIENTES tipoDoCliente) {
        System.out.println("---- DADOS DO CLIENTE ----");
        System.out.println("Codigo: "+ codigo);
        System.out.println("Nome: "+ nome);
        System.out.println("Saldo devedor: "+ saldoDevedor);
        System.out.println("Tipo cliente: "+ tipoDoCliente);
     
        System.out.println("Desconto Padrao: "+descontoPadrao);
    }
    
}
