package atividade03;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJanelaComPaineis {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(
           BorderFactory.createLineBorder(Color.RED));
        
        JPanel painel2 = new JPanel();
        painel2.setBorder(
            BorderFactory.createLineBorder(Color.GREEN));
        
        JPanel painel3 = new JPanel();
        painel3.setBorder(
            BorderFactory.createLineBorder(Color.BLUE));
        
        JPanel painel4 = new JPanel();
        painel4.setBorder(
            BorderFactory.createLineBorder(Color.BLACK));
        
        JFrame painel  = new JFrame();
        painel4.add(painel1);
        painel4.add(painel2);
        painel4.add(painel3);
        painel4.add(painel4);
    }
}
