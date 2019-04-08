package br.ufsc.ine5605.sisturmas;

import java.util.List;
import java.util.Scanner;

public class Controle {
    private Scanner teclado;
    private List<Turma> turmas;
    private List<Aluno> alunos;


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
            System.out.println("Opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
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

    private void incluiAluno() {
    }

    private void listaTurmas() {
    
    }

    private void listaAlunos() {
   
    }

    private void listaTurmaMatriculada() {
    
    }

    private void matriculaAluno() {
    
    }

    private void incluiTurma() {

    }
    
}
