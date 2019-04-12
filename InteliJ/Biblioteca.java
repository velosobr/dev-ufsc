biblioteca 

import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    
    public void incluirLivro(Livro livro){
        livros.add(livro);
    }
    
    public void excluirLivro(Livro livro){
        livros.remove(livro);
    }
    
}

