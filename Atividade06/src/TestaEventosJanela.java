
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class TestaEventosJanela {

    public static void main(String[] args) {

        Janela janela = new Janela();
        janela.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(janela, "janela da aula");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                int opcao = JOptionPane.showConfirmDialog(janela, "Quer sair da aplicação?", "Confirma?", JOptionPane.YES_NO_OPTION);
                if(opcao == JOptionPane.YES_OPTION);
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        janela.setVisible(true);

    }
}
