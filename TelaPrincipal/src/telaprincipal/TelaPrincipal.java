/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaprincipal;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Linnety3
 */
public class TelaPrincipal extends JFrame{
     private JLabel label;
    private JButton botao;
    
    public TelaPrincipal(){
        super("Primeiro JFrame - Tela Principal");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        label = new JLabel();
        botao = new JButton();
        
        label.setText("Primeiro JLabel!!!");
        botao.setText("Botão");
        
        container.add( label );
        container.add( botao );
        
        setSize(360, 150);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
