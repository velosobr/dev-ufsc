
/**
 * Write a description of class ProgramaTestaBalde here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProgramaTestaBalde
{
    public static void main (String [] args){
    Balde a = new Balde(5);
    Balde b = new Balde();
    
    System.out.println(a.estaVazio());
    System.out.println(a.getQuantidade());
    System.out.println(a.qtdAdd());
}
}
