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

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCodito() {
        return this.Codigo;
    }

    @Override
    public void setCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
