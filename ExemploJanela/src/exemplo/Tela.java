package exemplo;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Tela extends JFrame {
	
	JToolBar toolbar = new JToolBar();
	
	JList ltsEstados;
	JScrollPane scrollpane;
	JScrollPane scrEstado;
	
	public Tela() {
		super ("Exemplo de Tela");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		toolbar.add(new JButton("Abrir"));
		toolbar.add(new JButton("Novo"));
		toolbar.add(new JButton("Salvar"));
		toolbar.add(new JButton("Fechar"));
		
		toolbar.setBounds(0, 0, 500, 40);
		pane.add(toolbar);
	
		String estados[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", 
							"RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
		
		ltsEstados = new JList(estados);
		scrollpane = new JScrollPane(ltsEstados);
		
		scrollpane.setBounds(20, 506, 100, 80);
		pane.add(scrollpane);
		
		String[] coluna = {"Nome", "Cidade", "Estado"};
		String[] [] dados = {{"Eduardo Jorge", "Salvador", "Bahia"}, {"Gustavo Neves", "Caetité", "Bahia"},
							{"Tarcísio Araújo", "Mutuípe", "Bahia"}, {"Rafael", "Campinas", "São Paulo"}};
		
		JTable listEstados = new JTable(dados, coluna);
		JScrollPane scrEstado = new JScrollPane(listEstados);
		
		scrEstado.setBounds(20, 150, 400, 200);
		pane.add(scrEstado);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static void main(String[] args) {
		Tela tela = new Tela();
	}

}
