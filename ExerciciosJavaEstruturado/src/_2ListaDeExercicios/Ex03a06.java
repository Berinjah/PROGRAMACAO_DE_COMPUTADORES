package _2ListaDeExercicios;

public class Ex03a06 {

	public static void main(String[] args) 
	{
		//Declare uma vari�vel do tipo String com a frase "Curso de Java"
		String str = "Curso de Java";//Cria uma string chamada str
		//Concatene na vari�vel criada acima a frase " - Exemplo String"
		str = str + (" - Exemplo String");//Concatena na String o texto " - Exemplo String"
		System.out.println(str);
		//Imprima na tela (console) o n�meor de caracteres da String
		System.out.println("Tamanho da String: " + str.length());
		//Crie uma nova String, pegando o peda�o da primeira String que compreenda a frase "Exemplo String"
		String xyz;
		xyz = (str.substring(16, 30));
		System.out.println(xyz);
		
		
		
		
	}

}
