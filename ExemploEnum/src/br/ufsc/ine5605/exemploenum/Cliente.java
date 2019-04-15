/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.exemploenum;

/**
 *
 * @author Linnety3
 */
public class Cliente {
    private int codigo;
    private String nome;
    private float saldoDevedor;

    public Cliente(int codigo, String nome, float saldoDevedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldoDevedor = saldoDevedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(float saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }
    
    
    
}
