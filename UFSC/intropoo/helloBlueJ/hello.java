
/**
 * Escreva a descrição da classe hello aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class hello
{
    public static void main (String [] args){
        System.out.println("Hello world, this is a git teste");
        
        
        
       
    }
    
    public int encontrePrimeiroPrimo(int n){
        while(!ehPrimo(n))
        n++;
        
        return n;
    }
}
