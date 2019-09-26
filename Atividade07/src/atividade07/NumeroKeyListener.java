
package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


public class NumeroKeyListener  implements KeyListener{

    private Object e;

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
      
    }

    @Override
    public void keyReleased(KeyEvent ke) {
          if (e.getKeyCode() < KeyEvent.VK_0 || e.getKeyCode() > KeyEvent.VK_9) {
  JOptionPane.showMessageDialog(null, "A tecla pressionada não é numérica!");        
}
    }
    
}
