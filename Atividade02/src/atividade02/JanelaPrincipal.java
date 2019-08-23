
package atividade02;


import javax.swing.JFrame;


public class JanelaPrincipal extends JFrame{
    private JanelaSobre janelaSobre;
    
    public JanelaPrincipal(){
        super();
        janelaSobre = new JanelaSobre(this, true);
        
    }
    public void exibir(){
        setSize(640, 480);
        setTitle("Aplicacao GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        janelaSobre.exibir();
        
           
    }
    
}
