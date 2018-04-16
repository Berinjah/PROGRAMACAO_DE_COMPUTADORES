package calculos;

public class CalculosMatematicos{
	
	//Funções matemáticas que serão usadas nos botões da calculadora
	
	public double soma(double a, double b) { 
		return a + b;
	}
	
	public double subtracao (double a, double b) {
		return a - (b);
	}
	
	public double multiplicacao(double a, double b) {
		 return a * b;
	}
	
	public double divisao (double a, double b) {
		return a / b;
	}
	
	public double porcentagem (double a, double b) {

		return a * (b * 0.01);
	}
	
	public double raiz (double a) {
		return Math.sqrt(a);
	}
	
	public double negar(double a) {
 
		return a - a - a;
	}
	
	public double umDivididoPorX (double a) {
		return 1 / a;
	}
}