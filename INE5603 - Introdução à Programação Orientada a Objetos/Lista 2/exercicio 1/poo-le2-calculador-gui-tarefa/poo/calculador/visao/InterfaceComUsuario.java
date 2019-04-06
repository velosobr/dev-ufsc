package poo.calculador.visao;

import poo.calculador.modelo.Calculador;
import poo.calculador.visao.painel.*;
import javax.swing.*;

public class InterfaceComUsuario extends JFrame
{
    Calculador c;

    enum Opcao {
        MENOR_DE_TRES,
        MEDIA_DE_TRES,
        SOMA_DE_TRES,
        MAIOR_QUE,
        DIVISIVEL_POR,
        PAR,
        BISSEXTO,
        MULTIPLICA,
        DIVIDE,
        MDC,
        SOMA_DIVISORES,
        AMIGOS,
        PRIMO,
        COMPOSTO
    }

    public InterfaceComUsuario(Calculador c) {
        super("POO - Programa Calculador");

        this.c = c;

        JPanel p = new JPanel();
        p.add(new JLabel("Este é o programa que realiza cálculos diversos."));
        setContentPane(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setJMenuBar(definaBarraDeMenu());
        pack();
    }

    private JMenuBar definaBarraDeMenu() {
        JMenuBar jmb = new JMenuBar();
        JMenu jm;
        JMenuItem jmi;

        jm = new JMenu("Calculador");
        jmi = new JMenuItem("Sair");
        jmi.addActionListener(ev -> System.exit(0));
        jm.add(jmi);
        jmb.add(jm);

        jm = new JMenu("Três Números");
        jmi = new JMenuItem("Menor...");
        jmi.addActionListener(ev -> definaPainel(Opcao.MENOR_DE_TRES));
        jm.add(jmi);
        jmi = new JMenuItem("Média...");
        jmi.addActionListener(ev -> definaPainel(Opcao.MEDIA_DE_TRES));
        jm.add(jmi);
        jmi = new JMenuItem("Soma...");
        jmi.addActionListener(ev -> definaPainel(Opcao.SOMA_DE_TRES));
        jm.add(jmi);
        jmb.add(jm);

        jm = new JMenu("Dois Números");
        jmi = new JMenuItem("Maior que...");
        jmi.addActionListener(ev -> definaPainel(Opcao.MAIOR_QUE));
        jm.add(jmi);
        jmi = new JMenuItem("Divisível por...");
        jmi.addActionListener(ev -> definaPainel(Opcao.DIVISIVEL_POR));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Multiplique...");
        jmi.addActionListener(ev -> definaPainel(Opcao.MULTIPLICA));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Divida...");
        jmi.addActionListener(ev -> definaPainel(Opcao.DIVIDE));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Máximo Divisor Comum...");
        jmi.addActionListener(ev -> definaPainel(Opcao.MDC));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Amigos...");
        jmi.addActionListener(ev -> definaPainel(Opcao.AMIGOS));
        jm.add(jmi);
        jmb.add(jm);

        jm = new JMenu("Um Número");
        jmi = new JMenuItem("Par...");
        jmi.addActionListener(ev -> definaPainel(Opcao.PAR));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Ano Bissexto...");
        jmi.addActionListener(ev -> definaPainel(Opcao.BISSEXTO));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Soma dos divisores...");
        jmi.addActionListener(ev -> definaPainel(Opcao.SOMA_DIVISORES));
        jm.add(jmi);
        jmb.add(jm);

        jmi = new JMenuItem("Primo...");
        jmi.addActionListener(ev -> definaPainel(Opcao.PRIMO));
        jm.add(jmi);
        jmb.add(jm);
        jmi = new JMenuItem("Composto...");
        jmi.addActionListener(ev -> definaPainel(Opcao.COMPOSTO));
        jm.add(jmi);
        jmb.add(jm);

        return jmb;
    }

    private void definaPainel(Opcao opcao) {
        JPanel p = new JPanel();
        JPanel painelOpcao = null;

        switch (opcao) {
            case MENOR_DE_TRES: painelOpcao = new PainelMenorDeTres(c); break;
            case MEDIA_DE_TRES: painelOpcao = new PainelMediaDeTres(c); break;
            case SOMA_DE_TRES: painelOpcao = new PainelSomaDeTres(c); break;
            case PAR : painelOpcao = new PainelPar(c); break;
            case MAIOR_QUE : painelOpcao = new PainelMaiorQue(c); break;
            case DIVISIVEL_POR : painelOpcao = new PainelDivisivelPor(c); break;
            case MULTIPLICA : painelOpcao = new PainelMultiplica(c); break;
            case DIVIDE : painelOpcao = new PainelDivide(c); break;
            case BISSEXTO : painelOpcao = new PainelBissexto(c); break;
            case MDC : painelOpcao = new PainelMDC(c); break;
            case SOMA_DIVISORES : painelOpcao = new PainelSomaDivisores(c); break;
            case AMIGOS : painelOpcao = new PainelAmigos(c); break;
            case PRIMO : painelOpcao = new PainelPrimo(c); break;
            case COMPOSTO : painelOpcao = new PainelComposto(c); break;
        }

        p.add(painelOpcao);
        setContentPane(p);
        pack();
    }

    public void interaja() {
        setVisible(true);
    }
}
