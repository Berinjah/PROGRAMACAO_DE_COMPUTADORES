package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaPrincipal extends JFrame {

	JLabel lblNome = new JLabel ("Nome: ");
	
	public JanelaPrincipal() {
		
		super("Janela Principal");
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		JanelaPrincipal janela = new JanelaPrincipal();

	}

}
