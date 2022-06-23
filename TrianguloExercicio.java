package exercicios;

import java.util.Scanner;

class triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a= 0;
		double b= 0;
		double c= 0;
		double base= 0;
		double altura= 0;
		
		while(altura<=0 || base<=0 ) {
			System.out.printf("Informe o valor de A \n");
			a = sc.nextDouble();
			System.out.printf("Informe o valor de B \n");
			b = sc.nextDouble();
			System.out.printf("Informe o valor de C \n");
			c = sc.nextDouble();
			if (c>a && a>0)
				base = c -a;
			else
				base = 0;
			if (b>a && a>0) 
				altura =(a+b+c)/2.0;
			else
				altura = 0;
		}
		if (base >0 && altura>0)
			System.out.printf("A area do triangulo e %.2f", ((base*altura)/2));
		    System.out.printf("\n\n base do triangulo e %.2f",base);
		    System.out.printf("\n altura do triangulo e %.2f",altura);
		
		sc.close();
	}

}
