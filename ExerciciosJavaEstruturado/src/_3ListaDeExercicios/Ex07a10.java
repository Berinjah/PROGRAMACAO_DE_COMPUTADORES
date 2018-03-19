package _3ListaDeExercicios;

public class Ex07a10 {

	public static void main(String[] args) 
	{
		//Calcula a área de uma circunferência com raio 12, onde PI=3,1415 e área = PI*r²
		float PI = 3.1415f;
		float r = 12f;
		float circun = 2 * PI * r;
		System.out.println(circun);
		//Calcule o resto da divisão de 99 por 4
		float resto = 99%4;
		System.out.println(resto);
		//Divida um número por 2 sem utilizar o operador "/"
		float div = 50f; 
		div = div * 0.5f;
		System.out.println(div);
		//Multiplique um número por 8 sem utilizar o operador "*"
		double mul = 1;
		mul = mul + mul + mul + mul + mul + mul + mul + mul;
		System.out.println(mul);
	}

}
