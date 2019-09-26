
package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class OuvinteTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println(" Pressionou a tecla + e.getKeyChar()");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
    
    
}
