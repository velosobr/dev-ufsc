public abstract class Animal {
    private int tamanhoPasso;

    public Animal(int tamanhoPasso) {
        setTamanhoPasso(tamanhoPasso);
    }

    public int getTamanhoPasso() {
        return tamanhoPasso;
    }

    public void setTamanhoPasso(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }

    public String mover() {
        return "ANIMAL: DESLOCOU " + tamanhoPasso;
    }

    public String produzirSom() {
        return "PRODUZ SOM: ";
    }

}
