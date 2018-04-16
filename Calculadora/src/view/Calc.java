package view;

import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import calculos.CalculosMatematicos;


public class Calc extends JFrame {
	
	//Declara o visor da calculadora
	JTextField txtVisor = new JTextField("0");
	
	//Declara os botões da calculadora
	JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMPlus = new JButton("M+");
	JButton btnMMinus = new JButton("M-");
	JButton btnBackspace = new JButton("◄─");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnNegar = new JButton("±");
	JButton btnRaiz = new JButton("√");
	JButton btnPlus = new JButton("+");
	JButton btnMinus = new JButton("-");
	JButton btnPercent = new JButton("%");
	JButton btnMultiplied = new JButton("*");
	JButton btnUmDivididoPor = new JButton("1/x");
	JButton btnDivided = new JButton("/");
	JButton btnDot = new JButton(".");
	JButton btnEquals = new JButton("=");
	
	DecimalFormat df = new DecimalFormat("##.0000"); //Ainda não implementado - Decimal Format define quantos números irão aparecer após a vírgula, facilitando a visualização na hora dos calculos com números decimais
	
	private String sinal = null;
	private double valor1 = 0, valor2 = 0, valor3 = 0;
	private boolean dot = false;	
	
	CalculosMatematicos cm = new CalculosMatematicos(); 
	
	public Calc() { //Construtor
		
		super ("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		 
		//Define as caracteristicas do visor, como margem, fonte, tamanho da fonte e tamanho do visor
		txtVisor.setBounds(20, 40, 171, 50);
		txtVisor.setMargin(new Insets(1,1,1,1));
		txtVisor.setFont(new Font("Arial", Font.PLAIN, 20));
		paine.add(txtVisor);
		
		btn0.setBounds(20, 245, 65, 25);
		btn0.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {//Define o número do botão para que ele apareça no visor (mesma lógica para todos os botões numéricos)
				if(txtVisor.getText().equals("0")) {//caso o número no visor seja zero, ele só define como 0 novamente (mesma lógica para todos os botões numéricos)
					txtVisor.setText("0");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"0");//caso o número seja diferente de zero, ele captura o número, armazena e concatena com zero (mesma lógica para todos os botões numéricos)
				}
				
			}
			
		});
		btn0.setMargin(new Insets(1,1,1,1));
		btn0.setFont(new Font("Arial", Font.PLAIN, 12));
		paine.add(btn0);
		
		btn1.setBounds(20, 215, 30, 25);
		btn1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"1");
				}
				
			}
			
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn1.setMargin(new Insets(1,1,1,1));
		paine.add(btn1);
		
		btn2.setBounds(55, 215, 30, 25);
		btn2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"2");
				}
				
			}
			
		});
		btn2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn2.setMargin(new Insets(1,1,1,1));
		paine.add(btn2);
		
		btn3.setFont(new Font("Arial", Font.PLAIN, 12));
		btn3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"3");
				}
				
			}
			
		});
		btn3.setMargin(new Insets(1,1,1,1));
		btn3.setBounds(90, 215, 30, 25);
		paine.add(btn3);
		
		btn4.setBounds(20, 185, 30, 25);
		btn4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"4");
				}
				
			}
			
		});
		btn4.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn4.setMargin(new Insets(1,1,1,1));
		paine.add(btn4);
		
		btn5.setBounds(55, 185, 30, 25);
		btn5.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"5");
				}
				
			}
			
		});
		btn5.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn5.setMargin(new Insets(1,1,1,1));
		paine.add(btn5);
		
		btn6.setBounds(90, 185, 30, 25);
		btn6.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"6");
				}
				
			}
			
		});
		btn6.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn6.setMargin(new Insets(1,1,1,1));
		paine.add(btn6);
		
		btn7.setBounds(20, 155, 30, 25);
		btn7.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("7");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"7");
				}
				
			}
			
		});
		btn7.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn7.setMargin(new Insets(1,1,1,1));
		paine.add(btn7);
		
		btn8.setBounds(55, 155, 30, 25);
		btn8.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"8");
				}
				
			}
			
		});
		btn8.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn8.setMargin(new Insets(1,1,1,1));
		paine.add(btn8);
		
		btn9.setBounds(90, 155, 30, 25);
		btn9.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}
				else {
					txtVisor.setText(txtVisor.getText()+"9");
				}
				
			}
			
		});
		btn9.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn9.setMargin(new Insets(1,1,1,1));
		paine.add(btn9);
		
		//Definição de botões com características lógicas
		btnMC.setBounds(20, 95, 30,25);
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //botão MC define (ou limpa) o número armazenado com o botão MS para zero
				valor3 = 0;
			}
		});
		paine.add(btnMC);
		
		btnMR.setBounds(55, 95, 30,25);
		btnMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//MR imprime o valor armazenado com o botão MS
				txtVisor.setText(valor3 + ""); /*a variável valor3 é concatenada com a string "" para ser convetida de double para string 
												(mesma lógica para todos os botões com essa característica)*/ 
			}
			
		});
		paine.add(btnMR);
		
		btnMS.setBounds(90, 95, 30,25);
		btnMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMS.setMargin(new Insets(1,1,1,1));
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//MS armazena o valor do visor na varável valor3
				valor3 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("0"); //define o valor do visor para zero
			}
		});
		paine.add(btnMS);
		
		btnMPlus.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMPlus.setMargin(new Insets(1,1,1,1));
		btnMPlus.setBounds(125, 95, 30,25);
		btnMPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//M+ soma o valor da variável valor3 com o valor que está no visor
				valor2 = Double.parseDouble(txtVisor.getText());//armazena o valor contido no visor na variável valor2
				valor3 = cm.soma(valor3, valor2);/*o método soma faz o calculo e armazena o resultado na variável valor3 se o resultado não fosse armazenado na variável 
												  valor3, o valor contido na variável valor3 seria sempre o mesmo, impossibilitando que o botão fosse usado mais de uma 
												  vez seguida, FUNÇÃO SEMELHANTE EM OUTRAS FUNÇÕES COMO PLUS, MINUS, MULTIPLIED E DIVIDED*/
				txtVisor.setText("0");		
			}
		});
		paine.add(btnMPlus);
				
		btnMMinus.setBounds(160, 95, 30,25);
		btnMMinus.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMMinus.setMargin(new Insets(1,1,1,1));
		btnMMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//caracteristicas muito parecidas com a do M+, porem este botão subtrai ao invés de somar
				valor2 = Double.parseDouble(txtVisor.getText());
				valor3 = cm.subtracao(valor3, valor2);
				txtVisor.setText("0");
			}
		});
		paine.add(btnMMinus);
		
		btnBackspace.setBounds(20, 125, 30, 25);
		btnBackspace.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnBackspace.setMargin(new Insets(1,1,1,1));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tam = (txtVisor.getText());//captura o texto e armazena na variável tam
				tam = tam.substring(0, tam.length() - 1); /*lenght() para contar os caracteres, substring para selecionar todos os caracteres
														  menos um, por ultimo 'tam' recebe o resultado*/	
				txtVisor.setText(tam);
			}
		});
		paine.add(btnBackspace);
		
		btnCE.setBounds(55, 125, 30, 25);
		btnCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnCE.setMargin(new Insets(1,1,1,1));
		btnCE.addActionListener(new ActionListener() {//Limpa o valor digitado no visor
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});	
		paine.add(btnCE);
		
		btnC.setBounds(90, 125, 30, 25);
		btnC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnC.setMargin(new Insets(1,1,1,1));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Mesma função do CE porém C zera também os valores das variáveis principais
				valor1 = 0;
				valor2 = 0;
				txtVisor.setText("0");
			}
		});
		paine.add(btnC);
		
		btnNegar.setBounds(125, 125, 30, 25);
		btnNegar.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnNegar.setMargin(new Insets(1,1,1,1));
		btnNegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = cm.negar(Double.parseDouble(txtVisor.getText()));
				txtVisor.setText(valor1 + "");
			}
		});
		paine.add(btnNegar);
		
		btnRaiz.setBounds(160, 125, 30, 25);
		btnRaiz.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnRaiz.setMargin(new Insets(1,1,1,1));
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = cm.raiz(Double.parseDouble(txtVisor.getText()));
				txtVisor.setText(valor1 + "");
			}
		});
		paine.add(btnRaiz);
		
		btnPlus.setBounds(125, 245, 30, 25);
		btnPlus.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnPlus.setMargin(new Insets(1,1,1,1));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor1 != 0) {
					valor1 = cm.soma(valor1, Double.parseDouble(txtVisor.getText()));
				}else {
					valor1 = Double.parseDouble(txtVisor.getText());
				}
				txtVisor.setText("0");
				dot = false;
				sinal = "soma";
			}
		});
		paine.add(btnPlus);
		
		btnMinus.setBounds(125, 215, 30, 25);
		btnMinus.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMinus.setMargin(new Insets(1,1,1,1));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor1 != 0) {
					valor1 = cm.subtracao(valor1, Double.parseDouble(txtVisor.getText()));
				}else {
					valor1 = Double.parseDouble(txtVisor.getText());
				}
				txtVisor.setText("0");
				dot = false;
				sinal = "subtração";
			}
		});
		paine.add(btnMinus);
		
		btnPercent.setBounds(160, 155, 30, 25);
		btnPercent.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnPercent.setMargin(new Insets(1,1,1,1));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = cm.porcentagem(valor1, Double.parseDouble(txtVisor.getText()));
				txtVisor.setText(valor2 + "");
			}
		});
		paine.add(btnPercent);
		
		btnMultiplied.setBounds(125, 185, 30, 25);
		btnMultiplied.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMultiplied.setMargin(new Insets(1,1,1,1));
		btnMultiplied.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor1 != 0) {
					valor1 = cm.multiplicacao(valor1, Double.parseDouble(txtVisor.getText()));
				}else {
					valor1 = Double.parseDouble(txtVisor.getText());
				}
				txtVisor.setText("0");
				dot = false;
				sinal = "multiplicação";
			}
			
		});
		paine.add(btnMultiplied);
				
		btnUmDivididoPor.setBounds(160, 185, 30, 25);
		btnUmDivididoPor.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnUmDivididoPor.setMargin(new Insets(1,1,1,1));
		btnUmDivididoPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = cm.umDivididoPorX(Double.parseDouble(txtVisor.getText()));
				txtVisor.setText(valor1 + "");
			}
			
		});
		paine.add(btnUmDivididoPor);
		
		btnDivided.setBounds(125, 155, 30, 25);
		btnDivided.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnDivided.setMargin(new Insets(1,1,1,1));
		btnDivided.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor1 != 0) {
					valor1 = cm.divisao(valor1, Double.parseDouble(txtVisor.getText()));
				}else {
					valor1 = Double.parseDouble(txtVisor.getText());
				}
				txtVisor.setText("0");
				dot = false;
				sinal = "divisão";
			}
		});
		paine.add(btnDivided);
		
		btnDot.setBounds(90, 245, 30, 25);
		btnDot.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnDot.setMargin(new Insets(1,1,1,1));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dot == false) {/*Caso a variável dot seja false um ponto é adicionado, quando true a função não faz nada até que ao usar outra função, como a 
									multiplicação, o valor de dot é definido como false novamente, isso impede que o usuário coloque mais de um ponto, impedindo erros 
									em tempo de execução*/ 
					dot = true;
					txtVisor.setText(txtVisor.getText() + ".");					
				}
			}
		});
		paine.add(btnDot);
		
		btnEquals.setBounds(160, 215, 30, 55);
		btnEquals.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnEquals.setMargin(new Insets(1,1,1,1));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String total = null;
				valor2 = Double.parseDouble(txtVisor.getText());
						
				if(sinal.equals("soma")) {
					total = (cm.soma(valor1, valor2) + "");
				}else if(sinal.equals("subtração")) {
					total = (cm.subtracao(valor1, valor2) + "");				
				}else if(sinal.equals("multiplicação")) {
					total = (cm.multiplicacao(valor1, valor2) + "");				
				}else if(sinal.equals("divisão")) {
					total = (cm.divisao(valor1, valor2) + "");	
				}
				
				if(total.endsWith(".0")){/*Semelhante ao backspace, porém só 'apaga' o conteúdo de uma string caso ela terminel com '.0' para que todo valor não aparente 
										  ser um double*/
					total = total.substring(0, total.length() - 2);
				}else {
					
				}
				txtVisor.setText(total);
				
				/*zera as variáveis para que não gere conflito com as contas posteriores ao usar uma função como a soma, por exmplo, o if vai verificar que o valor 
				 da variável 'valor1' é diferente de zero e irá somar com o valor da capturado na tela*/
				valor1 = 0;
				valor2 = 0;
			}
		});
		paine.add(btnEquals);
		
		this.setVisible(true);
		this.setSize(228, 325);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		 
		Calc calc = new Calc();

	}

}
