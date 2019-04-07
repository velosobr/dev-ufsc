public abstract class Mamifero extends Animal {
    private int volumeSom;

    public Mamifero(int volumeSom, int tamanhoPasso) {
        super(tamanhoPasso);
        setVolumeSom(volumeSom);
    }

    public String produzirSom() {
        return "MAMIFERO: " + super.produzirSom() + this.volumeSom + " ";
    }

    public int getVolumeSom() {
        return volumeSom;
    }

    public void setVolumeSom(int volumeSom) {
        this.volumeSom = volumeSom;
    }
}
