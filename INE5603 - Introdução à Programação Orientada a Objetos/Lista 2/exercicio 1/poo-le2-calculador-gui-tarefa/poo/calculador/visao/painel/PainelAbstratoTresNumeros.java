package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;
import javax.swing.*;

public abstract class PainelAbstratoTresNumeros extends PainelAbstrato
{
    JTextField jtfN1;
    JTextField jtfN2;
    JTextField jtfN3;

    public PainelAbstratoTresNumeros(Calculador c, String titulo, String nomeBotaoCalcular) {
        super(c,titulo,nomeBotaoCalcular);
    }

    @Override
    protected void definaCampos() {
        jtfN1 = new JTextField(10);
        jtfN1.addKeyListener(kl);
        jtfN2 = new JTextField(10);
        jtfN2.addKeyListener(kl);
        jtfN3 = new JTextField(10);
        jtfN3.addKeyListener(kl);

        add(new JLabel("Primeiro Número"));
        add(jtfN1);
        add(new JLabel("Segundo Número"));
        add(jtfN2);
        add(new JLabel("Terceiro Número"));
        add(jtfN3);
    }

    @Override
    protected boolean podeCalcular() {
        boolean pode;

        try {
            Integer.parseInt(jtfN1.getText());
            Integer.parseInt(jtfN2.getText());
            Integer.parseInt(jtfN3.getText());
            pode = true;
        } catch (NumberFormatException ex) {
            pode = false;
        }

        return pode;
    }

    @Override
    protected void evCalcular() {
        int n1 = Integer.parseInt(jtfN1.getText());
        int n2 = Integer.parseInt(jtfN2.getText());
        int n3 = Integer.parseInt(jtfN3.getText());
        String resultado = executeCalculo(c,n1,n2,n3);

        jtfResultado.setText(resultado);
    }

    protected  abstract String executeCalculo(Calculador c, int n1, int n2, int n3);
}
