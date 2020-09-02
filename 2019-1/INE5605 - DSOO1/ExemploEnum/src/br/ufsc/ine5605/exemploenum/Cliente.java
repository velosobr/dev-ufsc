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
    private int descontoPadrao;
    //private String tipoCliente;
    private ControladorPrincipal.TIPOSCLIENTES tipoCliente;
   
    public Cliente(int codigo, String nome, float saldoDevedor, ControladorPrincipal.TIPOSCLIENTES tipoCliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldoDevedor = saldoDevedor;
        this.descontoPadrao = 0;
        this.tipoCliente = tipoCliente;
    
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
    
    public int getDescontoPadrao() {
        return descontoPadrao;
    }

    public void setDescontoPadrao(int descontoPadrao) {
        this.descontoPadrao = descontoPadrao;
    }

    public ControladorPrincipal.TIPOSCLIENTES getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(ControladorPrincipal.TIPOSCLIENTES tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
    
}
