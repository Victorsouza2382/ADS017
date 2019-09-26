import javax.swing.JFrame;

public class TestaWindowStateListener {
    public static void main(String[] args) {
   
        OuvinteWindowStateListener ouvinte = new OuvinteWindowStateListener();
        
        JFrame janela = new JFrame();
        janela.addWindowStateListener(ouvinte);
        janela.setSize(350, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
        
}
}
