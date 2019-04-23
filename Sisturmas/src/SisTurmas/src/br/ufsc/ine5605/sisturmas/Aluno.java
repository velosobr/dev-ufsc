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
public class Aluno {
    
    private String matricula;
    private ArrayList<Turma> turmas; 
            
    public Aluno(String matricula){
        this.matricula = matricula;
        this.turmas  = new ArrayList<>();
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void addTurma (Turma turma){
        turmas.add(turma);
    }
    
    public ArrayList getTurmas(){
        return turmas;
    }
}
