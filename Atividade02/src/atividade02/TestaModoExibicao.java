
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame JanelaPrincipal = new JFrame();
        JanelaPrincipal.setTitle("Janela Principal");
        JanelaPrincipal.setSize(640, 480);
        JanelaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JanelaPrincipal.setVisible(true);
        JanelaPrincipal.setLocationRelativeTo(null);
        
        
        JDialog CaixaDialogo = new JDialog(JanelaPrincipal, false);
        CaixaDialogo.setTitle("Caixa Dialogo");
        CaixaDialogo.setLocationRelativeTo(CaixaDialogo);
        CaixaDialogo.setSize(320, 240);
        CaixaDialogo.setVisible(true);
        CaixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       CaixaDialogo.setLocationRelativeTo(CaixaDialogo);
        
        
    }
}

