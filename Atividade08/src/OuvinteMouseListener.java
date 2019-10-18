import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OuvinteMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicou o botão" + e.getButton() +  " " + e.getClickCount() + " vez (es)."); 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressionou um botão do mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberou um botão do mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entrou");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Saiu");
    }
    
}
