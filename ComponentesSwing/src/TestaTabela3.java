
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TestaTabela3 {

    public static void main(String[] args) {
        String[][] dados = {};
        String[] colunas = {"Nome", "Email", "Data Nascimento"};

        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);

        modelo.addRow(new String[]{"Ana", "oioioiioi@gmail.com", "23/10/2321"});
        modelo.addRow(new String[]{"Gio", "oasasaeoi@gmail.com", "1/07/2312"});
        modelo.addRow(new String[]{"Bia", "oasasa@gmail.com", "13/08/1989"});
        //modelo.removeRow(0);

        JTable tabela = new JTable(modelo);

        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(tabela);

        JButton botao = new JButton("Remover");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linha = tabela.getSelectedRow();
                if (linha >= 0) {
                    modelo.removeRow(linha);
                }
            }

        });
        
        JPanel painel = new JPanel();
        painel.add(botao);

        JFrame janela = new JFrame();
        janela.add(rolagem);
        janela.add(painel, BorderLayout.SOUTH);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);

    }
}
