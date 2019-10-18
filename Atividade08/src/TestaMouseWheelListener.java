import javax.swing.JFrame;

public class TestaMouseWheelListener {
    public static void main(String[] args) {
   
        OuvinteMouseWheelListener ouvinte = new OuvinteMouseWheelListener();
        JFrame janela = new JFrame();
        janela.addMouseWheelListener(ouvinte);
        janela.setVisible(true);
        janela.setSize(550, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
