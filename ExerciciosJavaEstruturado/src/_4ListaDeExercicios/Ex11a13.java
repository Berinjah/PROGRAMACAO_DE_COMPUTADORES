package _4ListaDeExercicios;

public class Ex11a13 {

	public static void main(String[] args) 
	{
		/*Crie uma vari�vel inteira com um valor qualquer e verifique se o valor desta var�vel � menor que 15 ou maior que 100*/
	    int i = 200;
		String t = "Essa vari�vel � menor que 15 ou maior que 100", f = "Essa vari�vel N�O � menor que 15 e N�O � maior que 100";
		String resultado = (i < 15 || i > 100) ? t : f;
		System.out.println(resultado);
				
		//Crie uma vari�vel com o valor de ponto flutuante com um valor qualquer e verifique se o valor desta vari�vel est� entre 1.99 e 5.99 
		double pf = 6f;
		String v2 = "O valor desta vari�vel est� entre 1.99 e 5.99", f2 = "O valor desta vari�vel N�O est� entre 1.99 e 5.99";
		String resultado2 = (pf >= 1.99 && pf <= 5.99 ? v2 : f2);
		System.out.println(resultado2);
			
		//Agora compare se o valor das duas vari�veis acima s�o iguais
		if (i==pf)// == s� deve ser usado para compara��o de tipos primitivos
		{
			System.out.println("A vari�vel 'i' tem o mesmo valor da var�vel 'pf'");
		}else 
		{
			System.out.println("A vari�vel 'i' N�O tem o mesmo valor da var�vel 'pf'");
		}
			
		
		
		//exibi��o em ordem alfab�tica
		//calcula a �rea de um quadrilatero e iddentifica se � um quadrado ou retangulo (ex 16 e 17)		
	}

}
