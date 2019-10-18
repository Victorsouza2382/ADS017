
package Atividade11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormularioCampoEdicao extends JFrame{
    
    JButton botaoAdicionar = new JButton("Adicionar");
    JTextField campoTexto = new JTextField(20);
    JTextArea areaTexto = new JTextArea(5,20);

    public FormularioCampoEdicao() throws HeadlessException {
        JLabel rotulo = new JLabel("Digite um texto: ");
        
        JPanel painelButton = new JPanel();
        painelButton.add(botaoAdicionar);
        
        JScrollPane painelRolagem = new JScrollPane();
        painelRolagem.setViewportView(areaTexto);
        
        JPanel painelComp = new JPanel(new GridLayout(5,1));
        painelComp.add(rotulo);
        painelComp.add(campoTexto);
        painelComp.add(painelRolagem);
        
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
       
        add(painelComp);
        add(painelButton,BorderLayout.SOUTH);
        
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                areaTexto.append(campoTexto.getText());
                campoTexto.setText("");
            }
        });
        
        
    }
    
    
    
}
