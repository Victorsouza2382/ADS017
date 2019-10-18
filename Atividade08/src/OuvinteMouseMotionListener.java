import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class OuvinteMouseMotionListener implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastando o mouse");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse na posição " + e.getLocationOnScreen());
    }
    
}
