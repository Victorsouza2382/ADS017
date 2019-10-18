
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TestaCampoTexto {

    public static void main(String[] args) {
        JLabel rotuloTexto = new JLabel("Informe texto:");
        JLabel rotuloDataNascimento = new JLabel("Data de nascimento");
        JTextField campoTexto = new JTextField(40);
        JTextField campoDataNascimento = new JTextField(15);
        campoDataNascimento.setText(" / / ");
        
        GridLayout leiaute = new GridLayout(10, 2);

        JPanel painel = new JPanel();
        painel.setLayout(leiaute);
        painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloTexto);
        painel.add(campoTexto);
        painel.add(rotuloDataNascimento);
        painel.add(campoDataNascimento);

        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(600, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
