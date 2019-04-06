package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

import javax.swing.*;

public abstract class PainelAbstratoUmNumero extends PainelAbstrato
{
    JLabel jlNomeNumero;
    JTextField jtfNumero;

    public PainelAbstratoUmNumero(ManipuladorDeArray ma, String titulo, String nomeBotao, String nomeNumero) {
        super(ma,titulo,nomeBotao);
        jlNomeNumero.setText(nomeNumero);
    }

    @Override
    protected void definaCampos() {
        JPanel p = new JPanel();
        jlNomeNumero = new JLabel();
        p.add(jlNomeNumero);
        jtfNumero = new JTextField(10);
        jtfNumero.addKeyListener(kl);
        p.add(jtfNumero);
        add(p);
    }

    @Override
    protected boolean podeCalcular() {
        boolean pode;

        try {
            Integer.parseInt(jtfNumero.getText());
            pode = true;
        } catch (NumberFormatException ex) {
            pode = false;
        }

        return pode;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        return executeCalculo(ma, numeros, Integer.parseInt(jtfNumero.getText()));
    }

    protected abstract String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero);
}
