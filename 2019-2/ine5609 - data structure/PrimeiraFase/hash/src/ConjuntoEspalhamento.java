import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {

    private List<List<String>> tabela = new ArrayList<List<String>>();
    private int tamanho = 0;

    public ConjuntoEspalhamento() {
        for (int i = 0; i < 26; i++) {
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }

    private int calculaCodigoDeEspalhamento(@NotNull String palavra) {
        int codigo = 1;
        for (int i = 0; i < palavra.length(); i++) {
            codigo = 31 * codigo + palavra.charAt(i);
        }
        return codigo;
    }

    private int calculaIndiceDaTabela(String palavra) {
        int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();

    }
    private void redimensionaTabela(int novaCapacidade){
        this.tabela.clear();
        List<String> palavras = this.pegaTodas();

        for (int i = 0; i < novaCapacidade; i++) {
            this.tabela.add(new LinkedList<String>());
        }

        for (String palavra: palavras) {
            this.adiciona(palavra);
        }
    }

    private void verificaCarga(){
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;

        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        }
    }
    public void adiciona(String palavra) {
        if (!this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;
        }
    }


    public void remove(String palavra) {
        if (this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            System.out.println("O metódo remove foi invocado");
            System.out.println("Está é a palavra as ser removida: " + palavra);
            lista.remove(palavra);
            this.tamanho--;
        }
    }

    public boolean contem(String palavra) {
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);

        return lista.contains(palavra);

    }

    public List<String> pegaTodas() {
        List<String> palavras = new ArrayList<String>();

        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void imprimeTabela(){
        for(List<String> lista : this.tabela){
            System.out.println("[");
            for (int i = 0; i <lista.size(); i++) {
                System.out.println("*");
            }
            System.out.println("]");
        }
    }

}
