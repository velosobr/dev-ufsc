package interfaces_exercicio05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Linnety3
 */
public class CategoriaProduto implements ICategoriaProduto {

    private int Codigo;
    private String nome;

    public CategoriaProduto(int Codigo, String nome) {
        this.Codigo = Codigo;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodito() {
    return this.Codigo;
    }

}
