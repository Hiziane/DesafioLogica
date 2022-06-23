package sequencial;

import java.util.Scanner;

public class Aumento1 {

	public static void main(String[] args) {
		
		double salarioBruto;
		Scanner sc = new Scanner(System.in); // objeto criado para capturar dados digitados
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble(); // pega os dados digitados no teclado
		
		salarioBruto = salarioBruto * 1.05; // aumento de 5% sobre o salario
		
		System.out.printf("O novo salario bruto � R$%.2f", salarioBruto);
		sc.close();

	}

}
