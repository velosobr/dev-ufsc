/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 07787552905
 */
public class Controle {

    private Scanner teclado;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Controle() {
        teclado = new Scanner(System.in);
        turmas = new ArrayList<>();
        alunos = new ArrayList<>();

    }

    public void inicia() {
        int opcao;
        do {
            System.out.println("---------SISTURMAS---------");
            System.out.println("Opções: ");
            System.out.println("1 - Incluir Turmas");
            System.out.println("2 - Incluir Alunos");
            System.out.println("3 - Listar Turmas");
            System.out.println("4 - Listar Alunos");
            System.out.println("0 - Encerra o Sistema");
            System.out.println("5 - Matricula na turma");
            System.out.println("6 - Lista turmas matriculadas");
            System.out.println("---------------------------");

            System.out.println("opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcao) {
                case (1):
                    incluiTurma();
                    break;
                case (2):
                    incluiAluno();
                    break;
                case (3):
                    listaTurmas();
                    break;
                case (4):
                    listaAlunos();
                    break;
                case (5):
                    matriculaAluno();
                case (6):
                    listaTurmaMatriculada();
            }

        } while (opcao != 0);

    }

    private void incluiTurma() {
        System.out.println("----------INSERINDO TURMA ------------");
        System.out.println("Codigo: ");
        String codigoTurma = teclado.nextLine();
        Turma turma = new Turma(codigoTurma);
        turmas.add(turma);
    }

    private void incluiAluno() {
        System.out.println("----------INSERINDO ALUNO ------------");
        System.out.println("Matricula: ");
        String matriculaAluno = teclado.nextLine();
        Aluno aluno = new Aluno(matriculaAluno);
        alunos.add(aluno);
    }

    private void listaTurmas() {
        System.out.println("----------LISTANDO TURMAS ------------");
        for (Turma turma : turmas) {
            System.out.println("Turmas: " + turma.getCodigo());
        }
    }

    private void listaAlunos() {
        System.out.println("----------LISTANDO ALUNOS ------------");
        for (Aluno aluno : alunos) {
            System.out.println("Alunos: " + aluno.getMatricula());
        }
    }

    private void matriculaAluno() {
        
        System.out.println("----------MATRICULANDO NA TURMA ------------");
        System.out.println("Insira a matrícula do aluno: ");
        String matricula = teclado.nextLine();
        Aluno aluno1 = findMatricula(matricula) ;
        if(aluno1==null){
            
            System.out.println("Matrícula Invalida!");
        }else{
            
            System.out.println("Insira o código da turma: ");
            String codigoTurma = teclado.nextLine();
            Turma turma1 = findCodigoTurma(codigoTurma);
            if(findCodigoTurma(codigoTurma)==null){
                System.out.println("Codigo da turma invalido!");
            } else {
                turma1.addAluno(aluno1);
                aluno1.addTurma(turma1);
            }
        }
    }
    
    private void listaTurmaMatriculada(){
        System.out.println("Insira a matricula do aluno:");
        //for(Turma turma: aluno)
    }
    
    public Aluno findMatricula(String matricula){
        for(Aluno aluno: alunos){
           if(matricula.equals(aluno.getMatricula())){
               return aluno;
           } 
        }
        return null;
    }
    
    public Turma findCodigoTurma(String codigoTurma){
        for(Turma turma: turmas){
            if(codigoTurma.equals(turma.getCodigo())){
                return turma;
            }
        }
        return null;
    }
}
