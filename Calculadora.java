package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		double num1, num2;
		
		System.out.println("Informe o 1 valor: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o 2 valor: ");
		num2 = sc.nextDouble();
		
		System.out.println("\n\nCalculadora\n");
		System.out.println("\n1. Soma \n2. Subtracao"+
				"\n3. Multiplicacao \n4. Divisao");
		System.out.println("\nEscolha uma opcao: ");
		
		opcao = sc.nextInt();
		
			switch(opcao) {
			case 1:
				System.out.printf("%f + %f = %f", num1, num2, num1+num2);
				break;
			case 2:
				System.out.printf("%f - %f = %f", num1, num2, num1-num2);
				break;
			case 3:
				System.out.printf("%f * %f = %f", num1, num2, num1*num2);
				break;
			case 4:
				System.out.printf("%f / %f = %f", num1, num2, num1/num2);
				break;
			default :
				System.out.println("Opcao invalida!");
			}
		
		sc.close();

	}

}
