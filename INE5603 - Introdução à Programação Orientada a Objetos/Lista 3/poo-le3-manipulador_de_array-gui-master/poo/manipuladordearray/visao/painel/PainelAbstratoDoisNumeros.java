package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

import javax.swing.*;

public abstract class PainelAbstratoDoisNumeros extends PainelAbstrato
{
    JLabel jlNomeNumero1;
    JTextField jtfNumero1;
    JLabel jlNomeNumero2;
    JTextField jtfNumero2;

    public PainelAbstratoDoisNumeros(ManipuladorDeArray ma, String titulo, 
    String nomeBotao, String nomeNumero1, String nomeNumero2) {
        super(ma,titulo,nomeBotao);
        jlNomeNumero1.setText(nomeNumero1);
        jlNomeNumero2.setText(nomeNumero2);

    }

    @Override
    protected void definaCampos() {
        JPanel p = new JPanel();

        jlNomeNumero1 = new JLabel();
        p.add(jlNomeNumero1);
        jtfNumero1 = new JTextField(10);
        jtfNumero1.addKeyListener(kl);
        p.add(jtfNumero1);

        jlNomeNumero2 = new JLabel();
        p.add(jlNomeNumero2);
        jtfNumero2 = new JTextField(10);
        jtfNumero2.addKeyListener(kl);
        p.add(jtfNumero2);

        add(p);

    }

    @Override
    protected boolean podeCalcular() {
        boolean pode;

        try {
            Integer.parseInt(jtfNumero1.getText());
            Integer.parseInt(jtfNumero2.getText());
            pode = true;
        } catch (NumberFormatException ex) {
            pode = false;
        }

        return pode;
    }

    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros) {
        int numero1 = Integer.parseInt(jtfNumero1.getText());
        int numero2 = Integer.parseInt(jtfNumero2.getText());

        return executeCalculo(ma, numeros, numero1, numero2);
    }

    protected abstract String executeCalculo(ManipuladorDeArray ma, int[] numeros, int numero1, int numero2);

}
