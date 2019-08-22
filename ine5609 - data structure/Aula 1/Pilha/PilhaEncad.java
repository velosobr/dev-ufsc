package Pilha;

public class PilhaEncad {

    Caixinha topo;

    public PilhaEncad() {
        this.topo = null;
    }

    void push(int valor) {
        Caixinha nova;
        nova = new Caixinha(valor);
        nova.setProx(topo);
        topo = nova;
    }

    public int pop() {
        int temp = 0;
        if (this.topo != null) {
            temp = topo.getValor();
            topo = topo.getProx();
        }
        return temp;
    }

    /*
    Ca/ixinha returnElementos(){
    }*/
}

