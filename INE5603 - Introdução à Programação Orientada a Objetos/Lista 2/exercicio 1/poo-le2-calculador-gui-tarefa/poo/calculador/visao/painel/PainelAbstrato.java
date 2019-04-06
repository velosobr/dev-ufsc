package poo.calculador.visao.painel;

import poo.calculador.modelo.Calculador;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.DecimalFormat;


public abstract class PainelAbstrato extends JPanel
{
    Calculador c;
    JTextField jtfResultado;
    JButton btCalcula;
    KeyListener kl;
    
    public PainelAbstrato(Calculador c, String titulo, String nomeBotao) {
        this.c = c;
        Border borda = BorderFactory.createTitledBorder(titulo);
        setBorder(borda);
        btCalcula = new JButton(nomeBotao);
        btCalcula.setEnabled(false);

        kl = new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ev) {
                    jtfResultado.setText("");
                    btCalcula.setEnabled(podeCalcular());
                };
            };
        jtfResultado = new JTextField(10);
        jtfResultado.setEditable(false);

        btCalcula.addActionListener(ev -> evCalcular());   
        
        definaCampos();
        add(btCalcula);
        add(new JLabel("Resultado"));
        add(jtfResultado);
    }
    
    protected abstract boolean podeCalcular();
    
    protected abstract void evCalcular();
    
    protected abstract void definaCampos();
}
