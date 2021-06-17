package br.ufsc.ine5605.sisorientacao;

public class Main {

    public static void main(String[] args) {
        System.out.println("professor e aluno");

        Aluno aluno1 = new Aluno("123", "aluno1");
        Aluno aluno2 = new Aluno("456", "aluno1");
        Aluno aluno3 = new Aluno("789", "aluno1");

        Professor professor1 = new Professor("prof1", "111");
        Professor professor2 = new Professor("prof2", "222");
        Professor professor3 = new Professor("prof3", "333");

        Orientacao orientacao1 = new Orientacao(professor1, aluno1, "TCC do Aluno 1");
        Orientacao orientacao2 = new Orientacao(professor1, aluno2, "TCC do Aluno 2");
        Orientacao orientacao3 = new Orientacao(professor1, aluno3, "TCC do Aluno 3");

        aluno1.setOrientacao(orientacao1);
        aluno2.setOrientacao(orientacao2);
        aluno3.setOrientacao(orientacao3);


        professor1.addOrientacao(orientacao1);
        //adicionando um outro bug: orientacao repetida
        professor1.addOrientacao(orientacao1);
        professor1.addOrientacao(orientacao1);


       //adicionando um bug
        professor1.addOrientacao(null);


        professor2.addOrientacao(orientacao2);
        professor3.addOrientacao(orientacao3);

        System.out.println("ORIENTACOES DO PROFESSOR 1");

        for (Orientacao orientacao : professor1.getOrientacao()) {
            System.out.println("Aluno matricula: " + orientacao.getOrientando().getMatricula());
        }

        System.out.println("Orientador do ALuno 1");

        System.out.println("Aluno " + aluno1.getMatricula() + " - orientador: " + aluno1.getOrientacao().getOrientador().getCodigoFuncional());


    }
}
