import javax.swing.JFrame;

public class TestaMouseMotionListener {
    public static void main(String[] args) {
   
        OuvinteMouseMotionListener ouvinte = new OuvinteMouseMotionListener();
        JFrame janela = new JFrame();
        janela.addMouseMotionListener(ouvinte);
        janela.setSize(600, 600);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
