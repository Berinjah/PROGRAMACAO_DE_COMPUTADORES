package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaCadastroClientes extends JFrame{
	
	JLabel lblPreencha = new JLabel("Preencha os campos e clique em 'gravar dados'");
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado: ");
	
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	
	JLabel lblCelular = new JLabel("Celular: ");
	JTextField txtCelular = new JTextField();
	
	JLabel lblEmail = new JLabel("E-mail: ");
	JTextField txtEmail = new JTextField();
	
	JComboBox cboEstado = new JComboBox();
	
	JButton btnGravarCadastro = new JButton("Gravar Cadastro");
	
	JButton btnNovoCadastro = new JButton("Novo Cadastro");
	
	JButton btnVerCadastros = new JButton("Ver Cadastros");
	
	public JanelaCadastroClientes() {
		super("Cadastro de Clientes");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblPreencha.setBounds(80, 20, 500, 25);
		paine.add(lblPreencha);
		
		lblNome.setBounds(60, 50, 40, 25);
		paine.add(lblNome);
		txtNome.setBounds(130, 50, 250, 25);
		paine.add(txtNome);
		
		lblEndereco.setBounds(60, 80, 80, 25);
		paine.add(lblEndereco);
		txtEndereco.setBounds(130, 80, 250, 25);
		paine.add(txtEndereco);
		
		lblBairro.setBounds(60, 110, 50, 25);
		paine.add(lblBairro);
		txtBairro.setBounds(130, 110, 250, 25);
		paine.add(txtBairro);
		
		lblEstado.setBounds(60, 140, 80, 25);
		paine.add(lblEstado);
		cboEstado.setBounds(130, 140, 150, 25);
		paine.add(cboEstado);
		
		cboEstado.addItem("SP");
		cboEstado.addItem("RJ");
		cboEstado.addItem("AC");
		
		lblTelefone.setBounds(60, 170, 60, 25);
		paine.add(lblTelefone);
		txtTelefone.setBounds(130, 170, 120, 25);
		paine.add(txtTelefone);
		
		lblCelular.setBounds(60, 200, 60, 25);
		paine.add(lblCelular);
		txtCelular.setBounds(130, 200, 120, 25);
		paine.add(txtCelular);
		
		lblEmail.setBounds(60, 230, 50, 25);
		paine.add(lblEmail);
		txtEmail.setBounds(130, 230, 250, 25);
		paine.add(txtEmail);
		
		btnGravarCadastro.setBounds(20, 270, 130, 50);
		paine.add(btnGravarCadastro);
		
		btnNovoCadastro.setBounds(160, 270, 130, 50);
		paine.add(btnNovoCadastro);
		
		btnVerCadastros.setBounds(300, 270, 130, 50);
		paine.add(btnVerCadastros);
		
		this.setVisible(true);
		this.setSize(475, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaCadastroClientes janela = new JanelaCadastroClientes();

	}

}
