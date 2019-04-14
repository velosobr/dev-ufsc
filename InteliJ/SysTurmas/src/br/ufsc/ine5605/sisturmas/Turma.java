package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigoTurma;
    private List <Aluno> alunos;

    public Turma (String codigoTurma){

        this.codigoTurma = codigoTurma;
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return null;
    }

    public void addAluno(Aluno aluno1) {
    }
}

