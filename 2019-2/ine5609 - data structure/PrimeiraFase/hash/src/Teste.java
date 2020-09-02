import java.util.List;

public class Teste {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

        conjunto.adiciona("palavra");
        conjunto.adiciona("computador");
        conjunto.adiciona("apostila");
        conjunto.adiciona("instrutor");
        conjunto.adiciona("mesa");
        conjunto.adiciona("telefone");

        if (!conjunto.contem("apostila"))
            System.out.println("Erro: não tem a palavra: apostila");
        //remove
        conjunto.remove("apostila");

        if (conjunto.contem("apostila"))
            System.out.println("Erro: tem a palavra: apostila");

        if (conjunto.getTamanho() != 5)
            System.out.println("Erro: o tamanho do conjunto deveria ser 5");

        //pegatodas
        List<String> palavras = conjunto.pegaTodas();
        for (String palavra : palavras) {
            System.out.println("Esta é nossa lista de palavras: " + palavra);
        }

        System.out.println(conjunto.toString());


        //contem

        System.out.println("a lista com tem a palavra 'Apostila': " + conjunto.contem("apostila"));

        System.out.println("##############");
        System.out.println("######");
        System.out.println("######");
        System.out.println("##############");

        ConjuntoEspalhamento conjuntoTeste = new ConjuntoEspalhamento();

        for (int i = 0; i < 100; i++) {
            conjuntoTeste.adiciona("" +i);
        }

     //   conjuntoTeste.imprimeTabela();

        conjunto.imprimeTabela();

    }
}
