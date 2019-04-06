
public class TabuleiroJV
{

    char[][] casas;
    char vazia;
    char casaX;
    char casaO;

    public TabuleiroJV(){
        vazia = 'V';
        casaX = 'X';
        casaO = 'O';
        casas = new char[3][3];
        for (int l=0; l<3;l++)
            for(int c=0; c<3;c++)
                casas[l][c]= vazia;
    }

    public int getCaracterVazio(){
        return vazia;
    }

    public int getCaracterX(){
        return casaX;

    }

    public int getCaracterO(){
        return casaO;

    }

    public char getMarca(int linha, int coluna){
        return casas[linha -1][coluna-1];
    }
    
    private boolean marqueCom(int linha, int coluna, char marca){
        boolean marcou;
        if (getMarca(linha,coluna)!= casaVazia)
            marcou = false;
        else {
            casas[linha-1][coluna-1];
            marcou = true;
        }
    }

}