
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class TextaCaixaCombinacao {

    public static void main(String[] args) {
        JLabel rotuloUF = new JLabel("UF");
        JLabel rotuloCidade = new JLabel("Cidade");
        
        String[] ufs = {"DF", "GO"};
        JComboBox caixaUF = new JComboBox(ufs);
        caixaUF.addItem("MG");
        caixaUF.setSelectedIndex(0);
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Brasilia");
        JComboBox caixaCidade = new JComboBox();
        caixaCidade.setModel(modelo);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloUF);
        painel.add(caixaUF);
        painel.add(rotuloCidade);
        painel.add(caixaCidade);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
