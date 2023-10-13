package joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		//icone default de informação
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
		
		//icone de exclamação
		JOptionPane.showMessageDialog(null, "Atenção - e-mail não informado.", "Atenção"
				, JOptionPane.WARNING_MESSAGE);
		
		//icone de erro
		JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro"
				, JOptionPane.ERROR_MESSAGE);
		
		//sem icone
		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
		
		
		//coletando icone
		URL url = ExemploJOptionPane2.class.getResource("algaworks.png");
		Icon icone = new ImageIcon(url);
		
		//apresentando com icone selecionado
		JOptionPane.showMessageDialog(null, "Obrigado por escolher a AlgaWokrs", "AlgaWorks"
				, JOptionPane.INFORMATION_MESSAGE, icone);
		
	}
	
}