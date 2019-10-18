
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TestaAreaTexto {
    public static void main(String[] args) {
        
        JLabel rotulo = new JLabel("Observação");
        JTextArea obs = new JTextArea(5, 20);
        obs.setLineWrap(true);
        obs.setWrapStyleWord(true);
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(obs);
        
        JPanel painel = new JPanel();
        painel.add(rotulo);
        painel.add(rolagem);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}

