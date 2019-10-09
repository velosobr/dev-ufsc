package lista;

import java.awt.*;

public class Lista {

    //começa com a lista vazia como variavel global

    Caixa head;
    Caixa cursor;

    public Lista() {
        head = null;
    }

    //Verifica se está vazia

    //cursor/auxiliar fica dentro do metodo


    //inserir
    public void inserirNaFrente(int elemento) {
        Caixa caixaNova = new Caixa(elemento);

        if (head == null) {
            this.head = caixaNova;
        } else {
            caixaNova.setProx(head);
            this.head = caixaNova;
        }

    }

    public void inserirDepoisDeTodos(int elemento) {
        Caixa caixaNova = new Caixa(elemento);
        if (head == null) {
            this.head = caixaNova;
        } else {
            this.cursor = head;
            while (this.cursor.getProx() != null) {
                cursor = cursor.getProx();
            }
            cursor.setProx(caixaNova);

        }


    }

    public void inserirNaPosicao(int pos, int elemento) {
        Caixa caixaNova = new Caixa(elemento);

        Caixa caixaAuxLocalizada = buscaCaixa(pos);


    }

    private Caixa buscaCaixa(int pos) {
        Caixa caixaAux = head.getProx();
        int contador = 0;

        if (head.getProx() == null) {
            while (caixaAux.getProx() != null) {
            }
        }


        return caixaAux;
    }

    public void inserirDepoisDe(int refer, int elemento) {

    }
    //metodo de pé atrás
    //visão além do alcance, sempre olhando o getProximo antes de avançar
    public void inserirAntesDe(int refer, int elemento) {

    }

    //Remover
    public void removerDaFrente() {

    }

    public void removerUltimo() {

    }

    public void removerPosicao(int pos) {
    }

    public void remover(int refer) {

    }

    //busca
    public void busca(int refer) {

    }
}
