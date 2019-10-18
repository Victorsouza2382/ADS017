import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestaRotulo {
    public static void main(String[] args) {
   
        JLabel rotulo1 = new JLabel("Este rótulo está ativo.");
        //rotulo1.setText("Este rótulo está ativo.");
        rotulo1.setToolTipText("Rótulo 1");
        
        JLabel rotulo2 = new JLabel("Este rótulo está inativo.");
        //rotulo2.setText("Este rótulo está inativo.");
        rotulo2.setEnabled(false);
        rotulo2.setToolTipText("Rótulo 2");
        
        JFrame janela = new JFrame();
        janela.add(rotulo1,BorderLayout.NORTH);
        janela.add(rotulo2,BorderLayout.SOUTH);
        janela.setVisible(true);
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}
}
