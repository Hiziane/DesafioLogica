package exercicios;

import java.util.Scanner;

class Alunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota = 0;
		int aprovado = 0;
		int reprovado = 0;
		double media = 0;
		
		for (int contador = 1; contador <= 10; contador  ++) {// 10 alunos
			System.out.printf("Informe a nota do aluno %s \n", contador);
			nota = sc.nextDouble();
			if (nota < 60) 
				reprovado = reprovado +1;
			else 
				aprovado = aprovado +1;
			media = media + nota;
		}
		System.out.printf("%d alunos foram aprovados.", aprovado);
		System.out.printf("\n%d alunos foram reprovados.", reprovado);
		System.out.printf("\nA media da turma e %.2f ", (media/10));
		sc.close();

	}

}
