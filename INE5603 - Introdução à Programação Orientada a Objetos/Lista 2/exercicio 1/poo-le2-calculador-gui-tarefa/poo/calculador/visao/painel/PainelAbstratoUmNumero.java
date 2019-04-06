package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;

import javax.swing.*;

public abstract class PainelAbstratoUmNumero extends PainelAbstrato
{
    JTextField jtfNumero;

    public PainelAbstratoUmNumero(Calculador c, String titulo, String nomeBotaoCalcular) {
        super(c, titulo, nomeBotaoCalcular);
    }

    @Override
    protected void definaCampos() {
        jtfNumero = new JTextField(10);
        jtfNumero.addKeyListener(kl);

        add(new JLabel("Número"));
        add(jtfNumero);
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
    protected void evCalcular() {
        int n = Integer.parseInt(jtfNumero.getText());
        String resultado = executeCalculo(c,n);

        jtfResultado.setText(resultado);
    }

    protected  abstract String executeCalculo(Calculador c, int n);

}
