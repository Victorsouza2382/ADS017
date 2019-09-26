
package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MaiusculoKeyListener implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
       if (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') {
  e.setKeyChar(Character.toUpperCase(e.getKeyChar()));        
}
    }

    @Override
    public void keyPressed(KeyEvent ke) {
     
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
   
    
    
}
