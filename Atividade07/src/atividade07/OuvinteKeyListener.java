
package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OuvinteKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent ke) {
            System.out.println("Digitou uma tecla");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
            System.out.println("Pressionou uma tecla");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
            System.out.println("Liberou uma tecla");
    }
    
    
}
