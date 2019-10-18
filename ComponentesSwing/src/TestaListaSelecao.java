
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class TestaListaSelecao {
    public static void main(String[] args) {
        
        JLabel rotulo = new JLabel("Contatos");
        String[] contatos = {"Ana", "Natan", "Giovanna", "Alberto", "Victor", "Bruno", "Arthur"};
        JList lista = new JList(contatos);
        lista.setVisibleRowCount(4);
       
        JScrollPane rolagem  = new JScrollPane();
        rolagem.setViewportView(lista);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotulo);
        painel.add(rolagem);
        
        JFrame janela = new JFrame ();
        janela.add(painel);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
