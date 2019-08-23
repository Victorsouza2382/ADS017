
package atividade02;


import javax.swing.JFrame;



public class TestaJanelaPrincipal {

    private static String JanelaPrincipal;
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setSize(640, 480);
        janela.setAlwaysOnTop(true);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("JanelaPrincipal");
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
       
        
       
    }
}
