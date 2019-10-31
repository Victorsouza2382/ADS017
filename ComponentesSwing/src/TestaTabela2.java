
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TestaTabela2 {
    
    public static void main(String[] args) {
        Object[][] dados = {
            {"Victor", "victorsouza2382@gmail.com", "29/08/1999"},
            {"TantoFaz", "TuQdeixagmail.com", "23/03/1966"},
            {"Jairo", "Fimose@gmail.com", "19/02/2987"}
        };
        Object[] colunas = {"Nome", "Email", "Data Nascimento"};
        
        JTable tabela = new JTable(dados, colunas);
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(tabela);
        
        JFrame janela = new JFrame();
        janela.add(rolagem);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        
    }
    
}
