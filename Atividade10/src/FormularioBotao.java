import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FormularioBotao extends JFrame {

        JButton botaoSalvar = new JButton();
        JButton botaoFechar = new JButton();
        JCheckBox checkCursoAds = new JCheckBox();
        JCheckBox checkCursoSegInf = new JCheckBox();
        JCheckBox checkCursoJogos = new JCheckBox();
        JCheckBox checkCursoRedes = new JCheckBox();
        JRadioButton radioBolsaIntegral100 = new JRadioButton();
        JRadioButton radioBolsaParcial75 = new JRadioButton();
        JRadioButton radioBolsaParcial50 = new JRadioButton();
        JRadioButton radioBolsaParcial25 = new JRadioButton();
        JRadioButton radioSemBolsa = new JRadioButton();

    public FormularioBotao() {
        
            botaoSalvar = new JButton("Salvar");
            botaoFechar = new JButton("Fechar");
            checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
            checkCursoSegInf = new JCheckBox("Sistemas de Informação");
            checkCursoJogos = new JCheckBox("Jogos Digitais");
            checkCursoRedes = new JCheckBox("Redes de Computadores");
            radioBolsaIntegral100 = new JRadioButton("Integral 100%");
            radioBolsaParcial75 = new JRadioButton("Parcial 75%");
            radioBolsaParcial50 = new JRadioButton("Parcial 50%");
            radioBolsaParcial25 = new JRadioButton("Parcial 25%");
            radioSemBolsa = new JRadioButton("Sem Bolsa");
            
            JLabel rotulo = new JLabel("Selecione até duas opções de curso:");
            JLabel rotulo1 = new JLabel("Deseja cursar com bolsa de estudo?");
            
            JPanel painelBotao = new JPanel();
            JPanel painelCentral = new JPanel();
            
            painelBotao.add(botaoSalvar);
            painelBotao.add(botaoFechar);
            
        GridLayout leiaute = new GridLayout(10, 1);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);
        
    }
        
}

