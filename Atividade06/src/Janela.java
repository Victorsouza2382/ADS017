import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Janela extends JFrame {

    public Janela() throws HeadlessException {
        setSize(500, 400);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
