package _3ListaDeExercicios;

public class Ex07a10 {

	public static void main(String[] args) 
	{
		//Calcula a �rea de uma circunfer�ncia com raio 12, onde PI=3,1415 e �rea = PI*r�
		float PI = 3.1415f;
		float r = 12f;
		float circun = 2 * PI * r;
		System.out.println(circun);
		//Calcule o resto da divis�o de 99 por 4
		float resto = 99%4;
		System.out.println(resto);
		//Divida um n�mero por 2 sem utilizar o operador "/"
		float div = 50f; 
		div = div * 0.5f;
		System.out.println(div);
		//Multiplique um n�mero por 8 sem utilizar o operador "*"
		double mul = 1;
		mul = mul + mul + mul + mul + mul + mul + mul + mul;
		System.out.println(mul);
	}

}
