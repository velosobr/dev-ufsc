package poo.manipuladordearray.visao;

import poo.manipuladordearray.modelo.ManipuladorDeArray;
import poo.manipuladordearray.visao.painel.*;
import javax.swing.*;

public class InterfaceComUsuario extends JFrame
{
    ManipuladorDeArray ma;

    enum Opcao {
        SOMA,
        POSICOES_IMPARES,
        PRIMEIRO_E_ULTIMO,
        QUANTAS_OCORRENCIAS,
        MAIOR,
        POSICAO_MAIOR,
        QTD_ACIMA_LIMITE,
        MEDIA,
        MULTIPLICA_POR_FATOR,   // multiplica alterando o array
        MULTIPLICADO_POR_FATOR, // multiplica retornando novo array
        COPIA_N_PRIMEIROS,
        COPIA,
        PARES,
        DUPLIQUE,
        POSSUI_PAR,
        SEM_REPETICOES,
        INVERTA,
        PRIMEIRA_POSICAO_DE_NUMERO,
        POSICOES,
        SEM_OCORRENCIAS,
        NUMEROS_NO_INTERVALO,
        SUBSTITUI_OCORRENCIAS,
        SUBSTITUI_PRIMEIRA_OCORRENCIA,
        SUBSTITUI_ULTIMA_OCORRENCIA,
        PARTE,
        UNE_DOIS_ARRAYS,
        NUMEROS_EM_POSICOES
    }

    public InterfaceComUsuario(ManipuladorDeArray ma) {
        super("POO - Manipulador de Array");

        this.ma = ma;
        setContentPane(definaPainelInicial());
        setJMenuBar(definaBarraDeMenu());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }

    private JPanel definaPainelInicial() {
        JPanel painelInicial = new JPanel();
        JLabel jl = new JLabel("Programa que manipula array de inteiros. Exemplo de array: {8,23,-6,200}");
        JPanel p = new JPanel();
        p.add(jl);
        painelInicial.add(p);

        return painelInicial;
    }

    private JMenuBar definaBarraDeMenu() {
        JMenuBar jmb = new JMenuBar();
        JMenu jm;
        JMenuItem jmi;

        jm = new JMenu("Programa");
        jmi = new JMenuItem("Sair");
        jmi.addActionListener(ev -> System.exit(0));
        jm.add(jmi);
        jmb.add(jm);

        jmb.add(definaMenuSemParametro());
        jmb.add(definaMenuUmNumero());
        jmb.add(definaMenuDoisNumeros());
        jmb.add(definaMenuUmArray());

        return jmb;
    }

    private JMenu definaMenuSemParametro() {
        JMenu jm;
        JMenuItem jmi;

        jm = new JMenu("Opções Sem Parâmetro");
        jmi = new JMenuItem("Soma...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.SOMA));
        jm.add(jmi);
        jmi = new JMenuItem("Em posições ímpares...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.POSICOES_IMPARES));
        jm.add(jmi);
        jmi = new JMenuItem("Primeiro e Último...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.PRIMEIRO_E_ULTIMO));
        jm.add(jmi);
        jmi = new JMenuItem("Maior...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.MAIOR));
        jm.add(jmi);
        jmi = new JMenuItem("Posição do Maior...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.POSICAO_MAIOR));
        jm.add(jmi);
        jmi = new JMenuItem("Média...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.MEDIA));
        jm.add(jmi);
        jmi = new JMenuItem("Cópia...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.COPIA));
        jm.add(jmi);
        jmi = new JMenuItem("Pares...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.PARES));
        jm.add(jmi);
        jmi = new JMenuItem("Duplique...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.DUPLIQUE));
        jm.add(jmi);
        jmi = new JMenuItem("Possui par...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.POSSUI_PAR));
        jm.add(jmi);
        jmi = new JMenuItem("Sem repetições...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.SEM_REPETICOES));
        jm.add(jmi);
        jmi = new JMenuItem("Inverta...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.INVERTA));
        jm.add(jmi);

        return jm;
    }

    private JMenu definaMenuUmNumero() {
        JMenu jm;
        JMenuItem jmi;

        jm = new JMenu("Opções Com Um Número");
        jmi = new JMenuItem("Quantas Ocorrências...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.QUANTAS_OCORRENCIAS));
        jm.add(jmi);
        jmi = new JMenuItem("Quantidade Acima de Limite...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.QTD_ACIMA_LIMITE));
        jm.add(jmi);
        jmi = new JMenuItem("Multiplica por fator...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.MULTIPLICA_POR_FATOR));
        jm.add(jmi);
        jmi = new JMenuItem("Multiplicado por fator...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.MULTIPLICADO_POR_FATOR));
        jm.add(jmi);
        jmi = new JMenuItem("Cópia dos N primeiros...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.COPIA_N_PRIMEIROS));
        jm.add(jmi);
        jmi = new JMenuItem("Primeira posição de número...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.PRIMEIRA_POSICAO_DE_NUMERO));
        jm.add(jmi);
        jmi = new JMenuItem("Posições de número...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.POSICOES));
        jm.add(jmi);
        jmi = new JMenuItem("Sem ocorrências de número...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.SEM_OCORRENCIAS));
        jm.add(jmi);

        return jm;
    }

    private JMenu definaMenuDoisNumeros() {
        JMenu jm;
        JMenuItem jmi;

        jm = new JMenu("Opções Com Dois Números");

        jmi = new JMenuItem("Números no intervalo...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.NUMEROS_NO_INTERVALO));
        jm.add(jmi);
        jmi = new JMenuItem("Substitui ocorrências...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.SUBSTITUI_OCORRENCIAS));
        jm.add(jmi);
        jmi = new JMenuItem("Substitui primeira ocorrência...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.SUBSTITUI_PRIMEIRA_OCORRENCIA));
        jm.add(jmi);
        jmi = new JMenuItem("Substitui última ocorrência...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.SUBSTITUI_ULTIMA_OCORRENCIA));
        jm.add(jmi);
        jmi = new JMenuItem("Obtém parte...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.PARTE));
        jm.add(jmi);

        return jm;
    }
    
    private JMenu definaMenuUmArray() {
        JMenu jm;
        JMenuItem jmi;

        jm = new JMenu("Opções Com Um Array");

        jmi = new JMenuItem("Unir...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.UNE_DOIS_ARRAYS));
        jm.add(jmi);
        jmi = new JMenuItem("Em posições...");
        jmi.addActionListener(ev -> evDefinidoPainel(Opcao.NUMEROS_EM_POSICOES));
        jm.add(jmi);

        return jm;
    }

    private void evDefinidoPainel(Opcao opcao) {
        JPanel p = new JPanel();

        switch (opcao) {
            case SOMA: p.add(new PainelSoma(ma)); break;   
            case POSICOES_IMPARES: p.add(new PainelPosicoesImpares(ma)); break;
            case PRIMEIRO_E_ULTIMO: p.add(new PainelPrimeiroEUltimo(ma)); break;
            case QUANTAS_OCORRENCIAS: p.add(new PainelQuantasOcorrencias(ma)); break;
            case MAIOR: p.add(new PainelMaior(ma)); break;
            case POSICAO_MAIOR: p.add(new PainelPosicaoMaior(ma)); break;
            case QTD_ACIMA_LIMITE: p.add(new PainelQuantidadeAcimaLimite(ma)); break;
            case MEDIA: p.add(new PainelMedia(ma)); break;
            case MULTIPLICA_POR_FATOR: p.add(new PainelMultipliquePorFator(ma)); break;
            case MULTIPLICADO_POR_FATOR: p.add(new PainelMultiplicadoPorFator(ma)); break;
            case COPIA_N_PRIMEIROS: p.add(new PainelCopiaNPrimeiros(ma)); break;
            case COPIA: p.add(new PainelCopia(ma)); break;
            case PARES: p.add(new PainelPares(ma)); break;
            case DUPLIQUE: p.add(new PainelDuplique(ma)); break;
            case POSSUI_PAR: p.add(new PainelPossuiPar(ma)); break;
            case SEM_REPETICOES: p.add(new PainelSemRepeticoes(ma)); break;
            case INVERTA: p.add(new PainelInverta(ma)); break;
            case PRIMEIRA_POSICAO_DE_NUMERO: p.add(new PainelPrimeiraPosicao(ma)); break;
            case POSICOES: p.add(new PainelPosicoes(ma)); break;
            case SEM_OCORRENCIAS: p.add(new PainelSemOcorrencias(ma)); break;
            case NUMEROS_NO_INTERVALO: p.add(new PainelNumerosNoIntervalo(ma)); break;
            case SUBSTITUI_OCORRENCIAS: p.add(new PainelSubstituiOcorrencias(ma)); break;
            case SUBSTITUI_PRIMEIRA_OCORRENCIA: p.add(new PainelSubstituiPrimeiraOcorrencia(ma)); break;
            case SUBSTITUI_ULTIMA_OCORRENCIA: p.add(new PainelSubstituiUltimaOcorrencia(ma)); break;
            case PARTE: p.add(new PainelParte(ma)); break;
            case UNE_DOIS_ARRAYS: p.add(new PainelUne(ma)); break;
            case NUMEROS_EM_POSICOES: p.add(new PainelEmPosicoes(ma)); break;
        }

        setContentPane(p);
        pack();
    }

    public void interaja() {
        setVisible(true);
    }
}
