/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;

/**
 *
 * @author 07787552905
 */
public class Turma {
    private String codigo;
    private ArrayList<Aluno> alunos;
    
    public Turma(String codigo){
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
