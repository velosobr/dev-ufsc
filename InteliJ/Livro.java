//classe livro
import java.util.ArrayList;

public class Livro {
    
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private ArrayList<Autor> autores = new ArrayList<Autor>();
    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();


    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        
        incluirAutor(autor);
        incluirCapitulo(numeroCapitulo, tituloCapitulo);
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public ArrayList<Autor> getAutores(){
        return autores;
    }
    
    public void incluirAutor(Autor autor){
        if(autor != null){
            for(Autor autorIn : autores){
                if(autorIn.getCodigo() == autor.getCodigo()){
                    return;
                }
            }
            autores.add(autor);
        }
    }
    
    public void excluirAutor(Autor autor){
        if(autores.contains(autor)){
            autores.remove(autor);
        }	 	  	  		      	      	 	     	     	        	 	
    }
    
    
    public void incluirCapitulo(int numero, String tituloCapitulo){
        for(Capitulo capIn : capitulos){
            if(capIn.getTitulo().equals(tituloCapitulo) || tituloCapitulo == null){
                return;
            }
        }
        
        Capitulo capitulo = new Capitulo(numero, tituloCapitulo);
        capitulos.add(capitulo);
    }
    
    public void excluirCapitulo(String tituloCapitulo){
        if(tituloCapitulo != null){
            for(Capitulo capIn : capitulos){
                if(tituloCapitulo.equals(capIn.getTitulo())){
                    capitulos.remove(capIn);
                    
                }
            }
        }
    }
    
    
    public Capitulo findCapituloByTitulo(String tituloCapitulo){
        for(Capitulo capIn : capitulos){
            if(capIn.getTitulo().equals(tituloCapitulo)){
                return capIn;
            }
        }
        return null;
    }
    
    
    
