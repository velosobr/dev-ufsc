package poo.manipuladordearray.visao.painel;

import javax.swing.*;
import poo.manipuladordearray.modelo.ManipuladorDeArray;

public abstract class PainelAbstratoUmArray extends PainelAbstrato
{
    JLabel jlNomeNumeros2;
    JTextField jtfNumeros2;
    int[] numeros2;

    public PainelAbstratoUmArray(ManipuladorDeArray ma, String titulo, String nomeBotao, String nomeNumeros2)
    {
        super(ma, titulo, nomeBotao);
        jlNomeNumeros2.setText(nomeNumeros2);
    }

    @Override
    protected void definaCampos() {
        JPanel p = new JPanel();
        jlNomeNumeros2 = new JLabel();
        p.add(jlNomeNumeros2);
        jtfNumeros2 = new JTextField(50);
        jtfNumeros2.addKeyListener(kl);
        p.add(jtfNumeros2);
        add(p);
    }

    @Override
    protected boolean podeCalcular() {
        numeros2 = obtenhaNumeros(jtfNumeros2.getText());
        return numeros2 != null;
    }
    
    @Override
    protected String executeCalculo(ManipuladorDeArray ma, int[] numeros1) {
        return executeCalculo(ma, numeros1, numeros2);
    }
    
    protected abstract String executeCalculo(ManipuladorDeArray ma, int[] numeros1, int[] numeros2);    
}
