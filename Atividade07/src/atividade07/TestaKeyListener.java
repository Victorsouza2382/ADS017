
package atividade07;

import javax.swing.JFrame;


public class TestaKeyListener {
    public static void main(String[] args) {
        OuvinteKeyListener ouvinte = new OuvinteKeyListener();
         JFrame janela = new JFrame();
         janela.addKeyListener(ouvinte);
         janela.setSize(500, 400);
         janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         janela.setVisible(true);
         
    }
}
