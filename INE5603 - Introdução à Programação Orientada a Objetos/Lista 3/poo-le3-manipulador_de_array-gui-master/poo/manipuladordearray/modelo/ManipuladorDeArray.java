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
        int soma = 0;
        for (int numero : numeros)
            soma = soma + numero;

        return soma;
    }

    /**
     * Obtém os números que estão em posições ímpares, ou seja, retorna os números 
     * das posições 1, 3, 5, etc.
     *
     * @param numeros Os números.
     * @return Retorna os números que estão em posições ímpares.
     */
    public int[] encontreEmPosicoesImpares(int[] numeros) {
        int[] valores = new int [numeros.length / 2];
        for (int i = 1; i < numeros.length; i = i + 2){
            valores[i/2] = numeros[i];
        }
        return valores;
    }

    /**
     * Obtém o primeiro e o último número do array.
     *
     * @param numeros Os números.
     * @return Retorna um array de tamanho 2 onde o primeiro número é o primeiro número do array numeros e o segundo número é
     * o último número do array numeros. Caso o array tenha menos de dois números então retorna um array de tamanho zero.
     */
    public int[] obtenhaPrimeiroEUltimo(int[] numeros) {
        int primeiroEUltimo[];

        if (numeros.length < 2)
            primeiroEUltimo = new int[0];
        else
            primeiroEUltimo = new int[] {numeros[0], numeros[numeros.length-1]};

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
        int qtd = 0;

        for (int num : numeros)
            if (num == numero)
                qtd++;

        return qtd;
    }

    /**
     * Obtém o maior número do array. Considere que o array sempre possui pelo menos um número.
     *
     * @param numeros Os números.
     * @return Retorna o maior número do array numeros.
     */
    public int obtenhaMaiorNumero(int[] numeros) {
        return numeros[obtenhaPosicaoDoMaiorNumero(numeros)];
    }

    /**
     * Obtém a posição do maior número no array.
     *
     * @param numeros Os números.
     * @return Retorna  a posição do maior número no array numeros. Se o array tiver tamanho zero
     * então retorna -1.
     */
    public int obtenhaPosicaoDoMaiorNumero(int[] numeros) {
        int posicao = -1;

        if (numeros.length > 0) {
            int maior = numeros[0];
            posicao = 0;

            for (int i = 1; i < numeros.length; i++)
                if (numeros[i] > maior) {
                    maior = numeros[i];
                    posicao = i;
                }
        }

        return posicao;
    }

    /**
     * Conta quantos números no array são maiores que um número limite.
     *
     * @param numeros Os números.
     * @param limite O limite.
     * @return Retorna a quantidade de números acima de limite.
     */
    public int conteQuantidadeAcimaDeLimite(int[] numeros, int limite) {
        int qtd = 0;

        for (int numero : numeros)
            if (numero > limite)
                qtd++;

        return qtd;
    }

    /**
     * Calcula a média simples dos números. Considere que o array sempre tem pelo menos um número.
     *
     * @param numeros Os números.
     * @return Retorna a média dos números.
     */
    public float calculeMedia(int[] numeros) {
        return calculeSoma(numeros) * 1.0f / numeros.length;
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
        int qtd = 0;

        for (int numero : numeros)
            if (numero >= limiteInferior && numero <= limiteSuperior)
                qtd++;

        return qtd;
    }

    /**
     * Multiplica cada número do array por um determinado fator.
     *
     * @param numeros Os números.
     * @param fator O fator.
     */
    public void multipliquePorFator(int[] numeros, int fator) {
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = numeros[i] * fator;
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
        int[] copia = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++)
            copia[i] = numeros[i] * fator;

        return copia;
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
        int[] copia;

        if (n > numeros.length)
            n = numeros.length;

        copia = new int[n];

        for (int i = 0; i < n; i++)
            copia[i] = numeros[i];

        return copia;
    }

    /**
     * Obtém uma cópia dos números do array.
     *
     * @param numeros Os números
     * @return Retorna uma cópia dos números.
     */
    public int[] obtenhaCopia(int[] numeros) {
        return copieNPrimeiros(numeros, numeros.length);
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
        int[] temp = new int[numeros.length];
        int[] noIntervalo;
        int qtd = 0;

        for (int numero : numeros)
            if (numero >= limiteInferior && numero <= limiteSuperior)
                temp[qtd++] = numero;

        if (qtd == numeros.length)
            noIntervalo = temp;
        else
            noIntervalo = copieNPrimeiros(temp, qtd);

        return noIntervalo;
    }

    /**
     * Une dois arrays. Exemplo: se os arrays forem [5,2] e [9,1,2] então o método retorna [5,2,9,1,2].
     *
     * @param a1 O primeiro array.
     * @param a2 O segundo array.
     * @return Retorna um array contendo os números dos arrays a1 e a2.
     */
    public int[] unaArrays(int[] a1, int[] a2) {
        int[] unidos = new int[a1.length + a2.length];
        int i = 0;

        for (int numero : a1)
            unidos[i++] = numero;
        for (int numero : a2)
            unidos[i++] = numero;

        return unidos;
    }

    /**
     * Obtém os números pares contidos no array.
     *
     * @param numeros Os números.
     * @return Retorna os números pares existentes no array numeros.
     */
    public int[] obtenhaPares(int[] numeros) {
        int[] temp = new int[numeros.length];
        int[] pares;
        int qtd = 0;

        for (int numero : numeros)
            if (numero % 2 == 0)
                temp[qtd++] = numero;

        if (qtd == numeros.length)
            pares = temp;
        else
            pares = copieNPrimeiros(temp, qtd);

        return pares;
    }

    /**
     * Obtém um array contendo duas ocorrências de cada número. Exemplo: se o array for formado pelos
     * números [7,2,6] então o método retorna o array [7,7,2,2,6,6].
     *
     * @param numeros Os números.
     * @return Retorna o array contendo duas ocorrências de cada número existente em numeros.
     */
    public int[] dupliqueArray(int[] numeros) {
        int[] duplicados = new int[numeros.length * 2];        

        for (int i = 0; i < numeros.length; i++) {
            duplicados[2*i] = numeros[i];
            duplicados[2*i+1] = numeros[i];
        }

        return duplicados;
    }

    // solução alternativa do método dupliqueArray
    public int[] dupliqueArray2(int[] numeros) {
        int[] duplicados = new int[numeros.length * 2];
        int i = 0;

        for (int numero : numeros) {
            duplicados[i++] = numero;
            duplicados[i++] = numero;
        }

        return duplicados;
    }

    /**
     * Verifica se o array possui pelo menos um número par.
     *
     * @param numeros Os números.
     * @return Retorna true se o array possui pelo menos um número par ou false caso contrário.
     */
    public boolean possuiNumeroPar(int[] numeros) {
        boolean possuiPar = false;
        int i = 0;

        while (!possuiPar && i < numeros.length)
            possuiPar = numeros[i++] % 2 == 0;

        return possuiPar;
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
        int pos = 0;

        while (pos < numeros.length && numeros[pos] != n)
            pos++;

        if (pos == numeros.length)
            pos =  -1;
        return pos;
    }

    /**
     * Obtém as posições em que um número aparece dentro de um array. Exemplo: para o array [9,12,6,9] o número 9 aparece nas posições 0 e 3.
     *
     * @param numeros Os números.
     * @param n O número.
     * @return As posições de n no array numeros.
     */
    public int[] obtenhaPosicoesDeNumero(int[] numeros, int n) {
        int[] temp = new int[numeros.length];
        int qtd = 0;
        int[] posicoes;

        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] == n)
                temp[qtd++] = i;

        if (qtd == numeros.length)
            posicoes = temp;
        else
            posicoes = copieNPrimeiros(temp, qtd);

        return posicoes;
    }

    /**
     * Verifica se o array não possui números repetidos.
     *
     * @param numeros Os números.
     * @return Retorna true se o array numeros não possui números repetidos ou false caso contrário.
     */
    public boolean semRepeticoes(int[] numeros) {
        boolean naoRepete = true;
        int i = 0;
        int ultimoIndice = numeros.length - 1;
        int j;

        while (naoRepete && i < ultimoIndice) {
            j = i + 1;
            while (naoRepete && j < numeros.length)
                if (numeros[i] == numeros[j])
                    naoRepete = false;
                else
                    j++;
            i++;
        }

        return naoRepete;
    }

    /**
     * Obtém um array sem ocorrências de um determinado número. Exemplo: se o array for [8,2,3,2] e o número for 2 então retorna [8,3].
     *
     * @param numeros Os números.
     * @param n Um número.
     * @return Retorna um array onde n foi removido do array numeros.
     */
    public int[] obtenhaSemOcorrencias(int[] numeros, int n) {
        int[] semOcorrencias;
        int[] temp = new int[numeros.length];
        int qtd = 0;

        for (int numero : numeros)
            if (numero != n)
                temp[qtd++] = numero;

        if (qtd == numeros.length)
            semOcorrencias = temp;
        else
            semOcorrencias = copieNPrimeiros(temp, qtd);

        return semOcorrencias;
    }

    /**
     * Substitui todas as ocorrências de um número por outro número.
     *
     * @param numeros Os números.
     * @param numero O número a ser substituído.
     * @param substituto O número que ficará no lugar do numero.
     */
    public void substituaTodasOcorrencias(int[] numeros, int numero, int substituto) {
        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] == numero)
                numeros[i] = substituto;
    }

    /**
     * Substitui a primeira ocorrência de um número por outro número.
     *
     * @param numeros Os números.
     * @param numero O número a ser substituído.
     * @param substituto O número que ficará no lugar do numero.
     */
    public void substituaPrimeiraOcorrencia(int[] numeros, int numero, int substituto) {
        boolean substituiu = false;
        int i = 0;

        while (!substituiu && i < numeros.length)
            if (numeros[i] == numero) {
                numeros[i] = substituto;
                substituiu = true;
            } else
                i++;
    }

    /**
     * Substitui a última ocorrência de um número por outro número.
     *
     * @param numeros Os números.
     * @param numero O número a ser substituído.
     * @param substituto O número que ficará no lugar do numero.
     */
    public void substituaUltimaOcorrencia(int[] numeros, int numero, int substituto) {
        boolean substituiu = false;
        int i = numeros.length - 1;

        while (!substituiu && i >= 0)
            if (numeros[i] == numero) {
                numeros[i] = substituto;
                substituiu = true;
            } else
                i--;
    }

    /**
     * Obtém o array invertido. Exemplo: se o array for {7,4,5,1} então o array invertido é {1,5,4,7}
     *
     * @param numeros Os números.
     * @return Retorna um novo array numeros invertido.
     */
    public int[] inverta(int[] numeros) {
        int[] invertidos = new int [numeros.length];

        for (int i = 0; i < numeros.length; i++)
            invertidos[numeros.length-i-1] = numeros[i];

        return invertidos;
    }

    /**
     * Calcula a soma dos números em posições pares e dos números em posições ímpares.
     * Considera que o array sempre tem pelo menos dois numeros.
     *
     * @param numeros Os números.
     * @return Retorna array de tamanho 2 onde o primeiro número é a soma dos números em posições pares e o segundo número é a soma dos números em posições ímpares.
     */
    public int[] retorneSomaPosicoesParesPosicoesImpares(int[] numeros) {
        int[] somas = new int [2];

        for (int i = 0; i < numeros.length; i++) 
            somas[i % 2] = somas[i % 2] + numeros[i];

        return somas;
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
        int[] numerosEmPosicoes = new int [posicoes.length];

        int i = 0;

        for (int posicao : posicoes)
            numerosEmPosicoes[i++] = numeros[posicao];

        return numerosEmPosicoes;
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
        int[] parte;

        if (pos >= numeros.length)
            parte = new int[0];
        else {
            if (qtd > numeros.length - pos)
                qtd = numeros.length - pos;

            parte = new int[qtd];

            for (int i = 0; i < qtd; i++)
                parte[i] = numeros[pos+i];
        }

        return parte;
    }
}
