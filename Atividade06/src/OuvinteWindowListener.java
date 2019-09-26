import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OuvinteWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Janela Aberta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Fechando a Janela");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Janela Fechada");    
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Janela Minimizada!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Janela Restaurada!");    
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Janela Ativada!"); 
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Janela Inativa!");    
    }
    
    
}
