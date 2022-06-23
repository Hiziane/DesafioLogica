package sequencial;
// Exercicio 1 
//Calcule e mostre a média ponderada de 4
//valores informados pelo usuário.

import java.util.Scanner;

public class MediaPonderada {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); // in de entrada
		
		// tipos de dados do Java: int, float, double, char, boolean, String
		
		double n1,n2,n3,n4; // double tem mais casas decimais
		
		System.out.println("Digite N1: "); // escreve sysout e pressiona ctrt + espaco
		                      // ele preenche sozinho o restante
		n1 = sc.nextDouble();
		
		System.out.println("Digite N2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite N3: ");
		n3 = sc.nextDouble();
		
		System.out.println("Digite N4: ");
		n4 = sc.nextDouble();
		
		// 2f ficaria com 2 casas decimais
		System.out.printf("As notas %.1f, " + "%.1f, %.1f, %.1f\n ",n1,n2,n3,n4); 
		
		System.out.printf("A media ponderada é " +"%.1f",(n1*2+n2*2+n3*3+n4*3)/10);
		
		sc.close();// garantir que a variavel seja fechada
	}
}
