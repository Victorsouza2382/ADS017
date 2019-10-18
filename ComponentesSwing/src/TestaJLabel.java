import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TestaJLabel {
    public static void main(String[] args) {
        
        JLabel rotulo = new JLabel();
        rotulo.setText("Um texto não editável.");
        rotulo.setToolTipText("Essa é a dica!");
        rotulo.setEnabled(false);
        rotulo.setVisible(true);
        
        JPanel painel = new JPanel();
        painel.add(rotulo);
        
        JMenuItem menuArquivoNovo = new JMenuItem("Novo...");
        menuArquivoNovo.setMnemonic('N');
        menuArquivoNovo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialogo = new JDialog();
                dialogo.setSize(200, 100);
                dialogo.setModal(true);
                dialogo.setVisible(true);
            }
        });
        
        JMenuItem menuArquivoSalvar = new JMenuItem("Salvar");
        menuArquivoSalvar.setMnemonic('R');
        menuArquivoSalvar.setEnabled(false);
        //menuArquivoSalvar.setVisible(false);
        JMenuItem menuArquivoSair = new JMenuItem("Sair");
        menuArquivoSair.setMnemonic('S');
        menuArquivoSair.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        menuArquivo.add(menuArquivoNovo);
        menuArquivo.add(menuArquivoSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(menuArquivoSair);
        
        JMenu menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic('E');
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('J');
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menuArquivo);
        barraMenu.add(menuEditar);
        barraMenu.add(menuAjuda);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 400);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
}
}
