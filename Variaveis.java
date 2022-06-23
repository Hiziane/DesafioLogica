package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		
		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		char genero = 'F';
		
		System.out.printf("A quantidade de itens em estoque � %d\n",quantidade);
		System.out.printf("O valor da parcela � R$%.1f\n", valorMercadoria);
		System.out.printf("O Erinaldo pesa %.2f quilos\n", peso);// sem o .2 mostra varias casas apos a virgula
		System.out.printf("Do g�nero %c tem matriculados %d alunas\n", genero, quantidade);
		

	}

}
