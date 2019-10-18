import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class OuvinteMouseWheelListener implements MouseWheelListener {

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("Você girou o equivalente a " + e.getWheelRotation() + " clique(s) na barra de rolagem");
    }
    
}
