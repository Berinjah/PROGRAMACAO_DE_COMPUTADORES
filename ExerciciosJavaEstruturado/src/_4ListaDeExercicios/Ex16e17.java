package _4ListaDeExercicios;

public class Ex16e17 {

	public static void main(String[] args) 
	{
		/*Crie um proggrama que recebe dois argumentos e calcule a �rea de um quadril�tero
		e exiba na tela com a seguinte mensagem:
		"Lado a = <a>"
		"Lado b = <b>"
		"A �rea � = <valor>" */
		double a = 4, b = 4, area;
		area = a * b;
		System.out.println("Lado a = " + a);
		System.out.println("Lado b = " + b);
		System.out.println("A �rea � = " + area);
		
		/*incremente o programa de c�lculo de �rea (16) para exibir ao final a mensagem:
		"A figura � um quadrado" caso seja um quadrado
		"A figura � um ret�ngulo" caso seja um ret�ngulo */
		if(a==b) 
		{
			System.out.println("\nA figura � um quadrado");
		}
		else 
		{
			System.out.println("\nA figura � um ret�ngulo");
		}
	}

}
