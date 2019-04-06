/**
 * Classe especializada em gerar matrizes de inteiros com valores aleatórios.
 */
public class GeradorDeMatrizDeInt
{
    /**
     * Gera uma matriz de inteiros com dados aleatórios. Os dados estarão entre [0,max].
     *
     * @param numLinhas O número de linhas da matriz.
     * @param numColunas O número de colunas da matriz.
     * @param max O valor máximo a ser gerado como dado da matriz.
     * @return Retorna a matriz de inteiros.
     */
    public MatrizDeInt gere(int numLinhas, int numColunas, int max) {
        MatrizDeInt m = new MatrizDeInt(numLinhas, numColunas);
        java.util.Random r = new java.util.Random();
        max++;  // porque deve gerar números entre 0 e max
        
        for (int i = 1; i <= numLinhas; i++)
            for (int j = 1; j <= numColunas; j++)
                m.setValor(i, j, r.nextInt(max));

        return m;
    }
}
