
import javax.swing.JFrame;

public class TestaWindowFocusListener {
    public static void main(String[] args) {
   
        
   OuvinteWindowFocusListener ouvinte = new OuvinteWindowFocusListener();
   
   JFrame janela = new JFrame();
   janela.addWindowFocusListener(ouvinte);
   janela.setSize(400, 400 );
   janela.setVisible(true);
   janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   janela.setLocationRelativeTo(null);
}
}
