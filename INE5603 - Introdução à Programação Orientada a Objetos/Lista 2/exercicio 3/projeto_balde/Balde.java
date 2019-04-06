public class Balde
{
    int capacidade, qtd;
    
    
    public Balde(int qtd){
        this.capacidade = qtd;
    }
      public Balde(){
       }
    
    public void fiqueCheio(){
        qtd=capacidade;
    }
    
    public boolean estaCheio(){
        return capacidade == qtd;
    }   
    
    public void fiqueVazio(){
     qtd=0;
    }
    
    public void addLitros(int litros){
        this.qtd+=litros;
    }
    
    public boolean estaVazio(){
     return qtd ==0;
    }
    public int getQuantidade(){
        return qtd;
    }
    
    public int qtdAdd(){
        /* int quantidadeAnterior = this.qtd;
        
        this.qtd = capacidade;
        
        return capacidade - quantidadeAnterior;
       */ 
        
        
          int resultado = capacidade - qtd;
          this.qtd+=resultado;
          
          return resultado;
         
    }
    
    
}
