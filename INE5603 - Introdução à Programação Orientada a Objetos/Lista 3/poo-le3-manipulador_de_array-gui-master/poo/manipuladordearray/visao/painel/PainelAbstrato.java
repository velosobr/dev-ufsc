package poo.manipuladordearray.visao.painel;

import poo.manipuladordearray.modelo.ManipuladorDeArray;
import javax.swing.*;
import java.awt.event.*;

public abstract class PainelAbstrato extends JPanel
{
    ManipuladorDeArray ma;
    JTextField jtfNumeros;
    int[] numeros;

    JButton btCalcular;
    JTextField jtfResultado;
    KeyListener kl;
    
    final protected int TAM_RESULTADO_VARIAVEL;
    final protected int TAM_RESULTADO_FIXO;

    public PainelAbstrato(ManipuladorDeArray ma, String titulo, String nomeBotao) {
        this.ma = ma;
        TAM_RESULTADO_VARIAVEL = 50;
        TAM_RESULTADO_FIXO = 10;

        setBorder(BorderFactory.createTitledBorder(titulo));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        btCalcular = new JButton(nomeBotao);
        btCalcular.setEnabled(false);
        btCalcular.addActionListener(ev -> gereResultado());
        jtfResultado = new JTextField();
        jtfResultado.setEditable(false);
        jtfResultado.setColumns(definaTamanhoDoResultado());

        kl = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ev) {
                jtfResultado.setText("");
                btCalcular.setEnabled(temTodosOsDados());
            }
        };
        jtfNumeros = new JTextField(50);
        jtfNumeros.addKeyListener(kl);

        JPanel p = new JPanel();
        p.add(new JLabel("Números"));
        p.add(jtfNumeros);
        add(p);

        definaCampos();
        add(btCalcular);
        JPanel pResultado = new JPanel();
        pResultado.add(new JLabel("Resultado"));
        pResultado.add(jtfResultado);
        add(pResultado);
    }

    protected int[] obtenhaNumeros(String numerosEmString) {
        int[] numeros = null;

        if (numerosEmString.startsWith("{") && numerosEmString.endsWith("}")) {
            numerosEmString = numerosEmString.substring(0, numerosEmString.length()-1).substring(1).trim();
            if (numerosEmString.equals(""))
                numeros = new int[0];
            else

            if (!numerosEmString.startsWith(",") && !numerosEmString.endsWith(",")) {
                String[] sNumeros = numerosEmString.split(",");
                numeros = new int [sNumeros.length];
                try {
                    for (int i = 0; i < numeros.length; i++)
                        numeros[i] = Integer.parseInt(sNumeros[i].trim());
                } catch (NumberFormatException ex) {
                    numeros = null;
                }
            }
        }

        return numeros;
    }

    private boolean temTodosOsDados() {
        numeros = obtenhaNumeros(jtfNumeros.getText());

        return numeros != null && podeCalcular();
    }

    protected String convertaArrayParaString(int[] numeros) {
        StringBuffer sb = new StringBuffer("{");
        for (int i = 0; i < numeros.length-1; i++)
            sb.append(String.valueOf(numeros[i])).append(",");

        if (numeros.length > 0)
            sb.append(numeros[numeros.length-1]);
        sb.append("}");

        return sb.toString();
    }

 
    protected void gereResultado() {
        try {
            jtfResultado.setText(executeCalculo(ma, numeros));
        } catch (Exception ex) {
            jtfResultado.setText("ERRO");
        }
    }
    
    protected abstract String executeCalculo(ManipuladorDeArray ma, int[] numeros);

    protected abstract void definaCampos();

    protected abstract int definaTamanhoDoResultado();    

    protected abstract boolean podeCalcular();
}
