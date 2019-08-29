package Pilha;

public class Caixinha {

    private int valor;
    private Caixinha proximo;

    public Caixinha(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public void setProx(Caixinha topo) {
        this.proximo = topo;
    }

    public int getValor() {
        return this.valor;
    }

    public Caixinha getProx() {
        return this.proximo;
    }
}
