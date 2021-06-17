package listaDuplamenteEncadeada;

public class Caixa {

    private int valor;
    private Caixa proximo;

    public Caixa(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public void setProx(Caixa topo) {
        this.proximo = topo;
    }

    public int getValor() {
        return this.valor;
    }

    public Caixa getProx() {
        return this.proximo;
    }
}
