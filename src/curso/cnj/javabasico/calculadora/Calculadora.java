package curso.cnj.javabasico.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, soma, subtracao, multi, divi;
		
		System.out.print("inseria um n�mero: ");
		num1 = in.nextInt();
		System.out.println();
		System.out.print("inseria outro n�mero: ");
		num2 = in.nextInt();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma �: "+soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtracao �: "+subtracao);
		
		multi = num1 * num2;
		System.out.println("O resultado da multiplica��o �: "+multi);

		divi = num1 / num2;
		System.out.println("O resultado da divis�o �: "+divi);
		
		in.close();
	}

}
