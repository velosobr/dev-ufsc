package br.ufsc.ine5605.sisorientacao;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private String matricula;
    private Orientacao orientacao;

    public Aluno(String nome, String matricula, Orientacao orientacao) {
        super(nome);
        this.matricula = matricula;
        this.orientacao = orientacao;

    }

    public Aluno(String matricula, String nome){
        super(nome);
        this.matricula = matricula;
        this.orientacao = null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Orientacao getOrientacao() {
        return this.orientacao;
    }

    public void setOrientacao(Orientacao orientacao) {
        this.orientacao = orientacao;
    }
}
