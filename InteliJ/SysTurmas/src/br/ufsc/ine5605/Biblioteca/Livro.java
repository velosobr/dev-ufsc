package br.ufsc.ine5605.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private List<Autor> autores = new ArrayList<>();
    private List<Capitulo> capitulos = new ArrayList<>();


    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;

        incluirAutor(autor);
        incluirCapitulo(numeroCapitulo, tituloCapitulo);

    }

    public void incluirCapitulo(int numeroCapitulo, String tituloCapitulo) {
        for (Capitulo cap : capitulos) {
            if (cap.getTitulo().equals(tituloCapitulo) || cap.getNumero() == numeroCapitulo || cap.getTitulo() == null) {
                if (cap.getTitulo().equals(tituloCapitulo) || cap.getNumero() == numeroCapitulo)
                    System.out.println("Capitulo já existe");
                if (cap.getTitulo() == null)
                    System.out.println("Você enviou um titulo vazio");
                return;

            } else {

                Capitulo capitulo = new Capitulo(numeroCapitulo, tituloCapitulo);
                capitulos.add(capitulo);
            }

        }

    }

    public void excluirCapitulo(String tituloCapitulo) {
        if (tituloCapitulo != null) {
            for (Capitulo capEx : capitulos) {
                if (tituloCapitulo.equals(capEx.getTitulo()))
                    capitulos.remove(capEx);
            }
        }
    }

    public void incluirAutor(Autor autor) {
        autores.add(autor);
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
