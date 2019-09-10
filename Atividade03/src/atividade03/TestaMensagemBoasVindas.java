package atividade03;

import javax.swing.JOptionPane;



public class TestaMensagemBoasVindas {
    public static void main(String[] args) {
        int opcao =  JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            String nome = JOptionPane.showInputDialog(null,"Informe seu nome");
            
            if(nome != null){
               JOptionPane.showMessageDialog(null, "Bem vindo Falcomer");               
            } else {
                JOptionPane.showMessageDialog(null, "Nome não informado!", "Erro!", JOptionPane.ERROR_MESSAGE);
                
            }
        } else{
            JOptionPane.showMessageDialog(null, "Atenção! Insira seu nome!" ,"Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
