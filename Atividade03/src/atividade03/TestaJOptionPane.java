package atividade03;

import javax.swing.JOptionPane;

public class TestaJOptionPane {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog(null,"Informe um valor ");
        JOptionPane.showMessageDialog(null, "O valor informado foi" + valor);
        int opcao =  JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi" + opcao);
        JOptionPane.showMessageDialog(null, "o sistema estará em manutenção das 23hrs às 04hrs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório." ,"Alerta", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);         
    }
}
