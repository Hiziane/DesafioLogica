package exercicios;

import java.util.Scanner;

class Salario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario = 0;
		double percentual =0 ;
		int anoEntrada =0;
		int anoAtual= 0;
		
		System.out.printf("Informe o ano de entrada na empresa:");
		anoEntrada = sc.nextInt();
		System.out.printf("Informe o ano atual :");
		anoAtual = sc.nextInt();
		
		if (anoAtual <= anoEntrada)
			System.out.print("O ano de Entrada não pode ser inferior ou igual ao atual.");
		else{
			System.out.printf("Informe o salario inicial R$: ");
			salario = sc.nextDouble();
			
			for (int ano = anoEntrada+1; ano <= anoAtual; ano  ++) {
		
				System.out.printf("Informe o percentual de reajuste do ano %d: ",ano);
				percentual = sc.nextDouble();
				salario = salario * (1 + percentual/100);
			}
		}
		
		System.out.printf("\nO salario atual sera de R$ %.2f \n", salario);
		
		sc.close();

	}

}
