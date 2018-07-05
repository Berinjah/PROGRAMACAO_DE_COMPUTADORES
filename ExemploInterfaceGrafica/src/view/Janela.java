package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JComboBox cboEstado = new JComboBox();
	JButton btnCadastrar = new JButton("Cadastrar");
	
	public Janela() {
		super("Minha Janela");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblNome.setBounds(20, 20, 40, 25);
		paine.add(lblNome);
		
		txtNome.setBounds(60, 20, 250, 25);
		paine.add(txtNome);
		
		cboEstado.addItem("SP");
		cboEstado.addItem("RJ");
		cboEstado.addItem("AC");
		
		cboEstado.setBounds(60, 50, 150, 25);
		paine.add(cboEstado);
		
		btnCadastrar.setBounds(20, 90, 100, 100);
		paine.add(btnCadastrar);
		
		this.setVisible(true);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela janela = new Janela();

	}

}
