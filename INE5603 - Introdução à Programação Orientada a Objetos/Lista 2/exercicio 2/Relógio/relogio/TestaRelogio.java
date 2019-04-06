
/**
 * Escreva a descrição da classe TestaRelogio aqui.
 Quantos atributos existe na classe relógio? 3;
 
 
 */
public class TestaRelogio{
    public static void main (String [] args){

        Relogio relogioDoLino = new Relogio();
        
        //relogioDoLino.setHr(15);
        System.out.println("Agora são exatamente: "+relogioDoLino.getHr()+":"+relogioDoLino.getMin()+":"+relogioDoLino.getSeg());
        System.out.println("Oi...");    
    }
}