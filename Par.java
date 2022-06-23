package condicional;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um numero: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O numero %d e par.\n", num);
		}
		System.out.println("\nEncerrando a execucao.");
		
		sc.close();

	}

}
