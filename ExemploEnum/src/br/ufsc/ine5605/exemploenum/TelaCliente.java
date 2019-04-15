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
    
    public TelaCliente(){
    teclado = new Scanner(System.in);
}
    void incluiCliente() {
        System.out.println("---- INCLUSAO DE CLIENTE ----");
        
        System.out.println("Codigo: ");
        int codigo = recebeValorInteiro();
        System.out.println("Nome: ");
        String nome = recebeValorString();
        System.out.println("Saldo devedor: ");
        float saldo = recebeValorFloat();
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
    
}
