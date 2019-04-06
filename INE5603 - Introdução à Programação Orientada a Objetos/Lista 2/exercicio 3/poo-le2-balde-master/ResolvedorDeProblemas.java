public class ResolvedorDeProblemas
{
    public boolean resolvaDeixa2LitrosEmB() {
        Balde a = new Balde(5);
        Balde b = new Balde(3);

        a.fiqueCheio();
        a.derrameEm(b);
        b.fiqueVazio();
        a.derrameEm(b);

        return b.getQuantidade() == 2;
    }

    public boolean resolvaDeixaNLitrosEmB(int n) {
        Balde a = new Balde(5);
        Balde b = new Balde(3);

        if (n == 3)
            b.fiqueCheio();
        else
        if (n == 2) {
            a.fiqueCheio();
            a.derrameEm(b);
            b.fiqueVazio();
            a.derrameEm(b);

        } else { // n = 1
            b.fiqueCheio();
            a.recebaDe(b);
            b.fiqueCheio();
            a.recebaDe(b);
        }

        return b.getQuantidade() == n;

    }

    public boolean resolvaDeixa2LitrosEmA() {
        Balde a = new Balde(5);
        Balde b = new Balde(3);

        a.fiqueCheio();
        a.derrameEm(b);

        return a.getQuantidade() == 2;
    }

    public boolean resolvaDeixar4Litros() {
        Balde a = new Balde(5);
        Balde b = new Balde(3);

        b.fiqueCheio();
        a.recebaDe(b);
        b.fiqueCheio();
        a.recebaDe(b);
        a.fiqueVazio();
        a.recebaDe(b);
        b.fiqueCheio();
        a.recebaDe(b);

        return a.getQuantidade() == 4;
    }

    public boolean resolvaDeixar4LitrosVersao2() {
        Balde a = new Balde(5);
        Balde b = new Balde(3);

        a.fiqueCheio();
        b.recebaDe(a);
        b.fiqueVazio();
        a.derrameEm(b);
        a.fiqueCheio();
        a.derrameEm(b);

        return a.getQuantidade() == 4;
    }

    public boolean resolvaDeixarNLitrosEmBComCapacidades(int n, int capacidadeA, int capacidadeB) {
        Balde a = new Balde(capacidadeA);
        Balde b = new Balde(capacidadeB);

        //TODO Faça  Estruturas de Dados e Inteligência Artificial e depois volte aqui.
        

        return b.getQuantidade() == n;
    }
}
