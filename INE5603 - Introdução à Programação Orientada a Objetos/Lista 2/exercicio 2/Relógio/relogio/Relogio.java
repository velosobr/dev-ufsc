
/**
 * Escreva a descrição da classe relogio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Relogio{
    private int hr;
    private int min; 
    private int seg;
    
    public void setHr(int novaHr){
        this.hr=novaHr;
    }
    
    public void setMin (int novoMin){
        this.min = novoMin;
    }
     
    public void setSeg (int novoSeg){
        this.seg = novoSeg;
    }
    
    public int getHr (){
        return this.hr;
    }
    public int getMin(){
        return this.min;
    }
    
    public int getSeg(){
        return this.seg;
    }

}


