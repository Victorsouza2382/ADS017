
package atividade07;

import javax.swing.JFrame;


public class TestaOuvinteTeclado {
    public static void main(String[] args) {
         OuvinteTeclado ouvinte = new OuvinteTeclado();
         JFrame janela = new JFrame();
         janela.addKeyListener(ouvinte);
         janela.setSize(500, 400);
         janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         janela.setVisible(true);
    }
}
