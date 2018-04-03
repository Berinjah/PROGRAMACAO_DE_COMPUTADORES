package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calc extends JFrame {
	
	JTextField txtVisor = new JTextField();
	
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
	JButton btnBackspace = new JButton("←");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnNegar = new JButton("-+");
	JButton btnRaiz = new JButton("√");
	JButton btnPlus = new JButton("+");
	JButton btnMinus = new JButton("-");
	JButton btnPercent = new JButton("%");
	JButton btnMultiplied = new JButton("*");
	JButton btnUmDivididoPor = new JButton("1/x");
	JButton btnDivided = new JButton("/");
	JButton btnDot = new JButton(".");
	JButton btnEquals = new JButton("=");
	
	
	public Calc() {
		super ("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(20, 30, 300, 100);
		paine.add(txtVisor);
		
		btn0.setBounds(20, 400 , 115, 45);
		paine.add(btn0);
		
		btn1.setBounds(20, 350, 55, 45);
		paine.add(btn1);
		
		btn2.setBounds(80, 350, 55, 45);
		paine.add(btn2);
		
		btn3.setBounds(140, 350, 55, 45);
		paine.add(btn3);
		
		btn4.setBounds(20, 300, 55, 45);
		paine.add(btn4);
		
		btn5.setBounds(80, 300, 55, 45);
		paine.add(btn5);
		
		btn6.setBounds(140, 300, 55, 45);
		paine.add(btn6);
		
		btn7.setBounds(20, 250, 55, 45);
		paine.add(btn7);
		
		btn8.setBounds(80, 250, 55, 45);
		paine.add(btn8);
		
		btn9.setBounds(140, 250, 55, 45);
		paine.add(btn9);
		
		btnMC.setBounds(20, 150, 55, 45);
		paine.add(btnMC);
		
		btnMR.setBounds(80, 150, 55, 45);
		paine.add(btnMR);
		
		btnMS.setBounds(140, 150, 55, 45);
		paine.add(btnMS);
		
		btnMPlus.setBounds(200, 150, 55, 45);
		paine.add(btnMPlus);
		
		btnMMinus.setBounds(260, 150, 55, 45);
		paine.add(btnMMinus);
		
		btnBackspace.setBounds(20, 200, 55, 45);
		paine.add(btnBackspace);
		
		btnCE.setBounds(80, 200, 55, 45);
		paine.add(btnCE);
		
		btnC.setBounds(140, 200, 55, 45);
		paine.add(btnC);
		
		btnNegar.setBounds(200, 200, 55, 45);
		paine.add(btnNegar);
		
		btnRaiz.setBounds(260, 200, 55, 45);
		paine.add(btnRaiz);
		
		btnPlus.setBounds(200, 400, 55, 45);
		paine.add(btnPlus);
		
		btnMinus.setBounds(200, 350, 55, 45);
		paine.add(btnMinus);
		
		btnPercent.setBounds(260, 250, 55, 45);
		paine.add(btnPercent);
		
		btnMultiplied.setBounds(200, 300, 55, 45);
		paine.add(btnMultiplied);
		
		btnUmDivididoPor.setBounds(260, 300, 55, 45);
		paine.add(btnUmDivididoPor);
		
		btnDivided.setBounds(200, 250, 55, 45);
		paine.add(btnDivided);
		
		btnDot.setBounds(140, 400, 55, 45);
		paine.add(btnDot);
		
		btnEquals.setBounds(260, 350, 55, 95);
		paine.add(btnEquals);
		
		this.setVisible(true);
		this.setSize(355, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		 
		Calc calc = new Calc();

	}

}
