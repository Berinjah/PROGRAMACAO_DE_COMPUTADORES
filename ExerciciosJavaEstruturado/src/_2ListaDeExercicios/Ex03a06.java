package _2ListaDeExercicios;

public class Ex03a06 {

	public static void main(String[] args) 
	{
		//Declare uma variável do tipo String com a frase "Curso de Java"
		String str = "Curso de Java";//Cria uma string chamada str
		//Concatene na variável criada acima a frase " - Exemplo String"
		str = str + (" - Exemplo String");//Concatena na String o texto " - Exemplo String"
		System.out.println(str);
		//Imprima na tela (console) o númeor de caracteres da String
		System.out.println("Tamanho da String: " + str.length());
		//Crie uma nova String, pegando o pedaço da primeira String que compreenda a frase "Exemplo String"
		String xyz;
		xyz = (str.substring(16, 30));
		System.out.println(xyz);
		
		
		
		
	}

}
