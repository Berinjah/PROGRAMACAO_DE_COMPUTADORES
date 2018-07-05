package exemplo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NovaTela extends JFrame{
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(20);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(20);
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField(20);
	JLabel lblCEP = new JLabel("CEP: ");
	JTextField txtCEP = new JTextField(20);
	JLabel lblObsevacoes = new JLabel("Obsevacoes: ");
	JTextField txtObsevacoes = new JTextField(20);
	
	public NovaTela() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(10, 10));
		pane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		pane.add(lblNome);
		pane.add(txtNome);
		
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		
		pane.add(lblCidade);
		pane.add(txtCidade);
		
		pane.add(lblCEP);
		pane.add(txtCEP);
		
		pane.add(lblObsevacoes);
		pane.add(txtObsevacoes);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NovaTela novatela = new NovaTela();

	}

}
