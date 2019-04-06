package poo.calculador.modelo;

/*
 * Um objeto desta classe é especializado em realizar
 * diversos cálculos matemáticos.
 */
public class Calculador
{
    /**
     * Encontra o menor de três números inteiros.
     * 
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @param n3 O terceiro número.
     * @return Retorna o menor dos três números.
     */
    public int encontreMenorDeTresNumeros(int n1, int n2, int n3) {
int menor = n1;
        
        if(n2<menor){
            menor=n2;
        }
        if(n3<menor){
            menor = n3;
        }
        return menor;
    }

    /**
     * Calcula a média de três números inteiros.
     * DICA 1: em Java, a expressão "5 / 2 " vale  2  e não 2,5. É preciso ao menos 1 float na divisão para que 
     * o resultado seja 2,5. Exemplo: 5 / 2.0f valerá 2,5.
     * DICA 2: em Java, a expressão "5 * 2.0f" vale 10.0f, ou seja, inteiro multiplicado por float dá float.
     *
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @param n3 O terceiro número.
     * @return Retorna a média dos três números.
     */
    public float calculeMediaDeTresNumeros(int n1, int n2, int n3) {
        return (n1+n2+n3)/3f;
    }

    /**
     * Calcula a soma de três números.
     *
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @param n3 O terceiro número.
     * @return Retorna a soma dos três números.
     */
    public int calculeSomaDeTresNumeros(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    /**
     * Verifica se um número é par.
     * DICA: em Java, a expressão "5 % 3" vale 2 pois 2 é o resto da divisão inteira de 5 por 3.
     *
     * @param n O número.
     * @return Retorna true se o número n for par ou false se o número for ímpar.
     */
    public boolean ehPar(int n) {
        return n%2==0;
    }

    /**
     * Verifica se um número é maior que outro número.
     *
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @return Retorna true se o primeiro número for maior que o segundo número ou false caso contrário.
     */
    public boolean ehMaiorQue(int n1, int n2) {
        return n1>n2;
    }

    /**
     * Verifica se um número inteiro positivo é divisível por outro número inteiro maior que zero.
     * DICA: Um número é divisível por outro se o resto da divisão dele pelo outro for zero
     *
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @return Retorna true se o primeiro número for divisível pelo segundo número ou false se não for.
     */
    public boolean ehDivisivelPor(int n1, int n2) {
        return n1 % n2 == 0;
    }

    /**
     * Multiplica dois números inteiros positivos sem utilizar o símbolo "*".
     * DICA: Você precisará usar um comando de repetição.
     *
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @return Retorna o resultado da multiplicação dos dois números.
     */
    public int multiplique(int n1, int n2) {
        int soma=0;
        for(int i=0;i<n2;i++ ){
        soma +=n1;
        };
        return soma;
    }

    /**
     * Faz a divisão inteira de dois números inteiros positivos sem usar o símbolo "/". Considera que o segundo 
     * número sempre é maior que zero. Exemplos: dividir 6 por 3 deve resultar 2; dividir 7 por 4 deve resultar 1;
     * dividir 27 por 38 deve resultar 0.
     * DICA: Você deverá usar um comando de repetição.
     *
     * @param n1 O primeiro número (dividendo).
     * @param n2 O segundo número (divisor).
     * @return Retorna o resultado da divisão inteira do primeiro número pelo segundo número.
     */
    public int divida(int n1, int n2) {
        int res =0;
        int dividendo=n1;
        for (int i =0; dividendo>0;i++){
            dividendo-=n2;
            res++;
        }
        return res;
    }

    /**
     * Verifica se um ano é bissexto.
     * DICA 1: Um ano é bissexto se for divisível por 400 ou então se for divisível por 4 e não for divisível por 100.
     * DICA 2: Pesquise na internet sobre os operadores lógicos "ou" (representado em Java por "||") e "e" 
     * (representado em Java por "&&").
     * 
     * @param ano O ano.
     * @return Retorna true se o ano for bissexto ou false caso contrário.
     */
    public boolean ehBissexto(int ano) {
       return ano % 400==0||(ano % 4==0 && ano%100!=0);
        }

    /**
     * Calcula o Máximo Divisor Comum entre dois números inteiros positivos.
     * DICA: Use o método das divisões sucessivas explicado 
     * em http://www.mundoeducacao.com/matematica/mdc-divisoes-sucessivas.htm
     *
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @return Retorna o máximo divisor comum entre os dois números.
     */
    public int calculeMDC(int n1, int n2) {
        int resto=n2;
        while(resto!=0){
            resto =n1%n2;
            n1=n2;
            n2=resto;
        }return n1;
    }

    /**
     * Calcula a soma dos divisores de um número inteiro positivo.
     * Exemplo: A soma dos divisores de 6 é 12 pois os divisores de 6 são 1, 2, 3 e 6.
     *
     * @param n O número.
     * @return A soma dos divisores do número n.
     */
    public int calculeSomaDosDivisores(int n) {
        int soma = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            soma+=i;
            }
        }
        return soma;
    }

    /**
     * Verifica se dois números são amigos.
     * DICA: Leia sobre números amigos em http://www.matematica.br/historia/namigos.html
     * 
     * @param n1 O primeiro número.
     * @param n2 O segundo número.
     * @return Retorna true se os dois números são amigos ou false se não são.
     */
    public boolean saoAmigos(int n1, int n2) {
        return false;
    }

    /**
     * Verifica se um número maior que 1 é primo.
     * Um número é primo se só tiver dois divisores: 1 e ele próprio.
     *
     * @param n O número.
     * @return Retorna true se o número for primo ou false caso contrário.
     */
    public boolean ehPrimo(int n) {
        
        return false;
    }

    /**
     * Verifica se um número maior que 1 é composto.
     * Um número é composto se tiver mais de 2 divisores.
     *
     * @param n O número.
     * @return Retorna true se o número for composto ou false caso contrário.
     */
    public boolean ehComposto(int n) {
        return false;
    }
}
