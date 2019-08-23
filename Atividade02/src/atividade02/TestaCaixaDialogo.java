package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class TestaCaixaDialogo {
    public static void main(String[] args) {
        JDialog dialogo = new JDialog();
        dialogo.setTitle("Caixa de dialogo");
        dialogo.setVisible(true);
        dialogo.setSize(320, 240);
        dialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialogo.setLocationRelativeTo(null);
        
    }
}
