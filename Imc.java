package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		double peso, altura;
		String classificacao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		peso = sc.nextDouble();
		System.out.println("Informe a altura: ");
		altura = sc.nextDouble();
		
		double imc = peso/Math.pow(altura, 2);
		
		if (imc < 18.5) {
			classificacao = "abaixo do peso";
		}else if (imc < 25) {
			classificacao = "peso normal";
		} else if (imc < 30) {
			classificacao = "sobrepeso";
		} else if (imc < 35) {
			classificacao = "obesidade nivel I";
		} else if (imc < 40) {
			classificacao = "obesidade nivel II";
		} else {
			classificacao = "obesidade morbida";
		}
		
		System.out.printf("\nO seu IMC e %.2f e esta classificado como %s.",imc, classificacao);
		
		sc.close();

	}

}
