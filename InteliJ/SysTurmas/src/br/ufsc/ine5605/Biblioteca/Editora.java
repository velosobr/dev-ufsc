package br.ufsc.ine5605.Biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Editora {
    private String codigo;
    private String nome;
    private ArrayList<Livro> livros;

    public Editora(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
