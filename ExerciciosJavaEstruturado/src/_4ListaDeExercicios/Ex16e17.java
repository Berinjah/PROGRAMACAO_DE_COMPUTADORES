package _4ListaDeExercicios;

public class Ex16e17 {

	public static void main(String[] args) 
	{
		/*Crie um proggrama que recebe dois argumentos e calcule a área de um quadrilátero
		e exiba na tela com a seguinte mensagem:
		"Lado a = <a>"
		"Lado b = <b>"
		"A área é = <valor>" */
		double a = 4, b = 4, area;
		area = a * b;
		System.out.println("Lado a = " + a);
		System.out.println("Lado b = " + b);
		System.out.println("A área é = " + area);
		
		/*incremente o programa de cálculo de área (16) para exibir ao final a mensagem:
		"A figura é um quadrado" caso seja um quadrado
		"A figura é um retângulo" caso seja um retângulo */
		if(a==b) 
		{
			System.out.println("\nA figura é um quadrado");
		}
		else 
		{
			System.out.println("\nA figura é um retângulo");
		}
	}

}
