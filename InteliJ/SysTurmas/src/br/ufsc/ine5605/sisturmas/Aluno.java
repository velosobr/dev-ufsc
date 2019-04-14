package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private List<Turma> turmas;

    public Aluno (String matricula){
        this.matricula = matricula;
        this.turmas = new ArrayList<>();
    }

    public void getMatricula() {
    }

    public void addTurma(Turma turma1) {
    }
}
