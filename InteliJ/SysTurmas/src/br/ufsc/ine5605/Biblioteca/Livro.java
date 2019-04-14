package br.ufsc.ine5605.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Capitulo> capitulos = new ArrayList<>();


    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;

        incluirAutor(autor);
        incluirCapitulo(numeroCapitulo, tituloCapitulo);

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

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
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

    public void incluirCapitulo(int numeroCap, String tituloCap) {
        for (Capitulo capIn : capitulos)
            if (capIn.getNumero() == numeroCap || capIn.getTitulo().equals(tituloCap) || tituloCap == null)
                return;
        Capitulo capinc = new Capitulo(numeroCap, tituloCap);
        capitulos.add(capinc);
    }

    public void excluirCapitulo(String tituloCapitulo) {
        if (tituloCapitulo != null) {
            for (Capitulo capEx : capitulos) {
                if (tituloCapitulo.equals(capEx.getTitulo()))
                    capitulos.remove(capEx);
            }
        } else {
            System.out.println("Titulo está vazio");
        }
    }

    public void incluirAutor(Autor autor) {
        if(autor != null){
            for (Autor autorIn: autores) {
                if (autorIn.getCodigo()!=autor.getCodigo())
                    autores.add(autor);
            }
        }


    }

    public void excluirAutor(Autor autor) {
        if (autores.contains(autor)) {
            autores.remove(autor);
        }
    }

    public Capitulo findCapituloByTitulo(String capTitulo) {
        for (Capitulo capIn : capitulos) {
            if (capIn.getTitulo().equals(capTitulo))
                return capIn;
        }
        return null;
    }

}