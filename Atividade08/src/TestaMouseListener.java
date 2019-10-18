import javax.swing.JFrame;

public class TestaMouseListener {
    public static void main(String[] args) {
   
        OuvinteMouseListener ouvinte = new OuvinteMouseListener();
        JFrame janela = new JFrame();
        janela.addMouseListener(ouvinte);
        janela.setSize(500, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
}
