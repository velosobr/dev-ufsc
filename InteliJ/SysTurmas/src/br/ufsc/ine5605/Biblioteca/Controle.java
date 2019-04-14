package br.ufsc.ine5605.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {

    private Scanner teclado;
    private ArrayList<Livro> livros;
    private ArrayList<Editora> editoras;
    private ArrayList<Autor> autores;
    private ArrayList<Capitulo> capitulos;

    public Controle() {
        teclado = new Scanner(System.in);
        livros = new ArrayList<>();
        editoras = new ArrayList<>();
        autores = new ArrayList<>();
        capitulos = new ArrayList<>();
    }

    public void inicia() {
        int opcao;

        do {
            System.out.println("---------Biblioteca---------");
            System.out.println("Opções: ");
            System.out.println("1 - Incluir Livro");
            System.out.println("2 - Incluir Autor");
            System.out.println("3 - Incluir Editora");
            System.out.println("4 - Listar Livros");
            System.out.println("5 - Listar Autor");
            System.out.println("6 - Listar Editora");

            System.out.println("0 - Encerra o Sistema");
            System.out.println("---------------------------");
            System.out.println("Opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case (1):
                    incluirLivro();
                    break;
                case (2):

                    incluiAutor();
                    break;
                case (3):

                    incluiEditora();
                    break;
                case (4):

                    listaLivros();
                    break;
                case (5):

                    listaAutores();
                case (6):
                    listaEditora();
                case (7):
                    getEditoraById();
            }
        } while (opcao != 0);
    }

    private void listaLivros() {

    }

    private void listaAutores() {
    }

    private void incluiEditora() {
        System.out.println("---------- INSERINDO EDITORA ----------");
        System.out.println("Digite o ID da Editora: ");
        String codigoEditora = teclado.nextLine();
        System.out.println("Digite o Nome da Editora: ");
        String nomeEditora = teclado.nextLine();
        Editora editora = new Editora(codigoEditora, nomeEditora);
        editoras.add(editora);
    }

    private void listaEditora(){
        for (Editora edIn:
             editoras) {
            System.out.println("Nome: "+edIn.getNome() +"\nID: "+ edIn.getCodigo());

        }
    }
    private String getEditoraById(){
        System.out.println("---------- BUSCANDO EDITORA PELO ID ----------");
        System.out.println("Digite o id da editora: ");
        String idEditora = teclado.nextLine();
        for (Editora edIn: editoras)
            if (idEditora != null)
                if (edIn.getCodigo().equals(idEditora))
                    System.out.println(edIn.getNome());

        return null;
    }

    private void incluiAutor() {
        System.out.println("---------- INSERINDO AUTOR ----------");
        System.out.println("id do autor: ");
        String codigoAutor= teclado.nextLine();
        System.out.println("Nome do autor: ");
        String nomeAutor = teclado.nextLine();
        Autor autor= new Autor(codigoAutor, nomeAutor);
        autores.add(autor);
    }

    private void incluirLivro() {
    }
}