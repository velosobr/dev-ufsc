package poo.manipuladordearray.modelo;

/**
 * Um objeto desta classe é especializado em realizar diversas operações envolvendo arrays de números inteiros.
 */

public class ManipuladorDeArray
{
    /**
     * Obtém a soma dos números do array.
     *
     * @param numeros O array contendo os números.
     * @return Retorna a soma dos números. Se o array estiver vazio retorna zero.
     */
    public int calculeSoma(int[] numeros) {
        int resultSoma = 0;
        for(int numero: numeros){
        resultSoma = resultSoma + numero;
    }
        return resultSoma;
    }

    /**
     * Obtém os números que estão em posições ímpares, ou seja, retorna os números das posições 1, 3, 5, etc.
     *
     * @param numeros Os números.
     * @return Retorna os números que estão em posições ímpares.
     */
    public int[] encontreEmPosicoesImpares(int[] numeros) {
        int [] retorna = new int [numeros.length /2];
            for(int i = 1 ; i < numeros.length;i+=2)
                retorna[i/2] = numeros[i];
                        
        return retorna;
    }

    /**
     * Obtém o primeiro e o último número do array.
     *
     * @param numeros Os números.
     * @return Retorna um array de tamanho 2 onde o primeiro número é o primeiro número do array numeros e o segundo número é
     * o último número do array numeros. Caso o array tenha menos de dois números então retorna um array de tamanho zero.
     */
    public int[] obtenhaPrimeiroEUltimo(int[] numeros) {
        int tam;
        int[] primeiroEUltimo;
            if(numeros.length>=2){
                tam=2;
                primeiroEUltimo = new int[tam];
                primeiroEUltimo[0] = numeros[0];
                primeiroEUltimo[1]= numeros[numeros.length-1];
            }else{
            tam =0;
            primeiroEUltimo = new int[tam];
        }
        return primeiroEUltimo;
    }

    /**
     * Conta quantas vezes um número aparece em um array.
     *
     * @param numeros Os números.
     * @param numero O número.
     * @return Retorna quantas vezes o numero aparece no array numeros.
     */
    public int conteQuantasOcorrencias(int[] numeros, int numero) {
        int vezes = 0;
         for(int i=0;i<numeros.length;i++)
             if(numeros[i]==numero)
             vezes++;
        
        
        return vezes;
    }

    /**
     * Obtém o maior número do array. Considere que o array sempre possui pelo menos um número.
     *
     * @param numeros Os números.
     * @return Retorna o maior número do array numeros.
     */
    public int obtenhaMaiorNumero(int[] numeros) {
        int valor = obtenhaPosicaoDoMaiorNumero(numeros);
    }

    /**
     * Obtém a posição do maior número no array.
     *
     * @param numeros Os números.
     * @return Retorna  a posição do maior número no array numeros. Se o array tiver tamanho zero
     * então retorna -1.
     */
    public int obtenhaPosicaoDoMaiorNumero(int[] numeros) {
        return 0;
    }

    /**
     * Conta quantos números no array são maiores que um número limite.
     *
     * @param numeros Os números.
     * @param limite O limite.
     * @return Retorna a quantidade de números acima de limite.
     */
    public int conteQuantidadeAcimaDeLimite(int[] numeros, int limite) {
        return 0;
    }

    /**
     * Calcula a média simples dos números. Considere que o array sempre tem pelo menos um número.
     *
     * @param numeros Os números.
     * @return Retorna a média dos números.
     */
    public float calculeMedia(int[] numeros) {
        return 0.0f;
    }

    /**
     * Calcula quantos números estão dentro de um intervalo. Exemplo: se o intervalo for [10,40] então estarão no intervalo
     * os números que forem maiores ou iguais a 10 e menores ou iguais a 40.
     *
     * @param numeros Os números.
     * @param limiteInferior O limite inferior do intervalo.
     * @param limiteSuperior O limite superior do intervalo.
     * @return Retorna a quantidade de números dentro do intervalo.
     */
    public int retorneQuantosNoIntervalo(int[] numeros, int limiteInferior, int limiteSuperior) {
        return 0;
    }

    /**
     * Multiplica cada número do array por um determinado fator.
     *
     * @param numeros Os números.
     * @param fator O fator.
     */
    public void multipliquePorFator(int[] numeros, int fator) {
    }

    /**
     * Obtém uma cópia do array contendo os números multiplicados por um determinado fator. Exemplo:
     * se o array for [8,3,1] e o fator for 3 então retorna o novo array [24,9,3].
     *
     * @param numeros Os números.
     * @param fator O fator.
     * @return Retorna um array contendo os números multiplicados pelo fator.
     */
    public int[] obtenhaMultiplicadoPorFator(int[] numeros, int fator) {
        return new int[] {};
    }

    /**
     * Obtém uma cópia dos n primeiros números do array. Se n for maior que a quantidade
     * de números do array então obtém uma cópia de todos os números do array.
     *
     * @param numeros Os números.
     * @param n A quantidade de números a serem copiados.
     * @return Retorna a cópia dos n primeiros números.
     */
    public int[] copieNPrimeiros(int[] numeros, int n) {
        return new int[] {};
    }

    /**
     * Obtém uma cópia dos números do array.
     *
     * @param numeros Os números
     * @return Retorna uma cópia dos números.
     */
    public int[] obtenhaCopia(int[] numeros) {
        return new int[] {};
    }

    /**
     * Obtém todos os números do array que estão dentro de um intervalo.
     *
     * @param numeros Os números.
     * @param limiteInferior O limite inferior do intervalo.
     * @param limiteSuperior O limite superior do intervalo.
     * @return Retorna os números que estão no intervalo.
     */
    public int[] obtenhaNumerosNoIntervalo(int[] numeros, int limiteInferior, int limiteSuperior) {
        return new int[] {};
    }

    /**
     * Une dois arrays. Exemplo: se os arrays forem [5,2] e [9,1,2] então o método retorna [5,2,9,1,2].
     *
     * @param a1 O primeiro array.
     * @param a2 O segundo array.
     * @return Retorna um array contendo os números dos arrays a1 e a2.
     */
    public int[] unaArrays(int[] a1, int[] a2) {
        return new int[] {};
    }

    /**
     * Obtém os números pares contidos no array.
     *
     * @param numeros Os números.
     * @return Retorna os números pares existentes no array numeros.
     */
    public int[] obtenhaPares(int[] numeros) {
        return new int[] {};
    }

    /**
     * Obtém um array contendo duas ocorrências de cada número. Exemplo: se o array for formado pelos
     * números [7,2,6] então o método retorna o array [7,7,2,2,6,6].
     *
     * @param numeros Os números.
     * @return Retorna o array contendo duas ocorrências de cada número existente em numeros.
     */
    public int[] dupliqueArray(int[] numeros) {
        return new int[] {};
    }

    /**
     * Verifica se o array possui pelo menos um número par.
     *
     * @param numeros Os números.
     * @return Retorna true se o array possui pelo menos um número par ou false caso contrário.
     */
    public boolean possuiNumeroPar(int[] numeros) {
        return false;
    }

    /**
     * Obtém a posição da primeira ocorrência de um número dentro de um array. Se o número não estiver no
     * array então o método retorna a posição -1. Exemplo: se o array for [7,3,2,3,8] e o número for 3 então
     * o método retorna 1. Se o número for 4 então o método retorna -1.
     *
     * @param numeros Os números.
     * @param n Um número.
     * @return Retorna a posição da primeira ocorrência do número n no array numeros.
     */
    public int obtenhaPrimeiraPosicaoDeNumero(int[] numeros, int n) {
        return 0;
    }

    /**
     * Obtém as posições em que um número aparece dentro de um array. Exemplo: para o array [9,12,6,9] o número 9 aparece nas posições 0 e 3.
     *
     * @param numeros Os números.
     * @param n O número.
     * @return As posições de n no array numeros.
     */
    public int[] obtenhaPosicoesDeNumero(int[] numeros, int n) {
        return new int[] {};

    }

    /**
     * Verifica se o array não possui números repetidos.
     *
     * @param numeros Os números.
     * @return Retorna true se o array numeros não possui números repetidos ou false caso contrário.
     */
    public boolean semRepeticoes(int[] numeros) {
        return false;
    }

    /**
     * Obtém um array sem ocorrências de um determinado número. Exemplo: se o array for [8,2,3,2] e o número for 2 então retorna [8,3].
     *
     * @param numeros Os números.
     * @param n Um número.
     * @return Retorna um array onde n foi removido do array numeros.
     */
    public int[] obtenhaSemOcorrencias(int[] numeros, int n) {
        return new int[] {};
    }

    /**
     * Substitui todas as ocorrências de um número por outro número.
     *
     * @param numeros Os números.
     * @param numero O número a ser substituído.
     * @param substituto O número que ficará no lugar do numero.
     */
    public void substituaTodasOcorrencias(int[] numeros, int numero, int substituto) {
    }

    /**
     * Substitui a primeira ocorrência de um número por outro número.
     *
     * @param numeros Os números.
     * @param numero O número a ser substituído.
     * @param substituto O número que ficará no lugar do numero.
     */
    public void substituaPrimeiraOcorrencia(int[] numeros, int numero, int substituto) {
    }

    /**
     * Substitui a última ocorrência de um número por outro número.
     *
     * @param numeros Os números.
     * @param numero O número a ser substituído.
     * @param substituto O número que ficará no lugar do numero.
     */
    public void substituaUltimaOcorrencia(int[] numeros, int numero, int substituto) {
    }

    /**
     * Obtém o array invertido. Exemplo: se o array for {7,4,5,1} então o array invertido é {1,5,4,7}
     *
     * @param numeros Os números.
     * @return Retorna um novo array numeros invertido.
     */
    public int[] inverta(int[] numeros) {
        return new int[] {};
    }

    /**
     * Calcula a soma dos números em posições pares e dos números em posições ímpares.
     * Considera que o array sempre tem pelo menos dois numeros.
     *
     * @param numeros Os números.
     * @return Retorna array de tamanho 2 onde o primeiro número é a soma dos números em posições pares e o segundo número é a soma dos números em posições ímpares.
     */
    public int[] retorneSomaPosicoesParesPosicoesImpares(int[] numeros) {
        return new int[] {};
    }

    /**
     * Obtém os números que estão em algumas posições. Considera que as posiçoes sempre
     * sao validas.
     *
     * @param numeros Os números.
     * @param posicoes As posições.
     * @return Retorna os números que estão nas posições indicadas em posicoes.
     */
    public int[] obtenhaDasPosicoes(int[] numeros, int[] posicoes) {
        return new int[] {};
    }

    /**
     * Obtém uma parte de um array. Deve-se indicar a quantidade de números desejados e a posição onde a cópia deve iniciar.
     * Se a posição for maior ou igual ao tamanho do array então retorna um array vazio. Se a quantidade de números desejada
     * for maior que a quantidade de números existentes então retorna os números possíveis. Exemplo: considere o array {6,3,4,1,2}.
     * Se a quantidade for 2 e a posição for 1 então retorna {3,4}. Se a quantidade for 3 e a posição for 4 então retorna {2}.
     *
     * @param numeros Os números.
     * @param qtd A quantidade de números desejados.
     * @param pos A posição inicial da parte a ser copiada.
     * @return Retorna a parte do array copiada.
     */
    public int[] obtenhaParte(int[] numeros, int qtd, int pos) {
        return new int[] {};
    }
}
