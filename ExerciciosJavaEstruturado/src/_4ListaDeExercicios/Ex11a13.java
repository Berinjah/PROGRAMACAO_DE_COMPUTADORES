package _4ListaDeExercicios;

public class Ex11a13 {

	public static void main(String[] args) 
	{
		/*Crie uma variável inteira com um valor qualquer e verifique se o valor desta varável é menor que 15 ou maior que 100*/
	    int i = 200;
		String t = "Essa variável é menor que 15 ou maior que 100", f = "Essa variável NÃO é menor que 15 e NÃO é maior que 100";
		String resultado = (i < 15 || i > 100) ? t : f;
		System.out.println(resultado);
				
		//Crie uma variável com o valor de ponto flutuante com um valor qualquer e verifique se o valor desta variável está entre 1.99 e 5.99 
		double pf = 6f;
		String v2 = "O valor desta variável está entre 1.99 e 5.99", f2 = "O valor desta variável NÃO está entre 1.99 e 5.99";
		String resultado2 = (pf >= 1.99 && pf <= 5.99 ? v2 : f2);
		System.out.println(resultado2);
			
		//Agora compare se o valor das duas variáveis acima são iguais
		if (i==pf)// == só deve ser usado para comparação de tipos primitivos
		{
			System.out.println("A variável 'i' tem o mesmo valor da varável 'pf'");
		}else 
		{
			System.out.println("A variável 'i' NÃO tem o mesmo valor da varável 'pf'");
		}
			
		
		
		//exibição em ordem alfabética
		//calcula a área de um quadrilatero e iddentifica se é um quadrado ou retangulo (ex 16 e 17)		
	}

}
