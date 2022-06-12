package DesafioLogica;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		//Catalogando produtos no estoque:
		
		// -- preço unitario
		// -- quantidade
		// -- categoria: C (cama, mesa e banho); E (eletrodomesticos) e V (vestuário);
		
		// a loja trabalha com 15 tipos de produtos.
		
		// 1º -----------------------------  calcule e mostre: ----------------------------------------
		// ---- C = aliquota 37,41%
		// ---- V = aliquota 43,14%
		// ---- E = aliquota 38,42%
		
		// 2º ----------------------------- calcule a margem de lucro ---------------------------------
		// ---- C = 30%
		// ---- V = 50%
		// ---- E = 35%
		
		// 3º --------------------- qual o total dos produtos em estoque separados por categoria --------

		
		Scanner sc = new Scanner(System.in);
		
		double precoUnit = 0;
		double aliquota = 0;
		double precoVenda = 0;
		double aux = 0;
		int quantidade = 0;
		int quantidadeC = 0;
		int quantidadeE = 0;
		int quantidadeV = 0;
		double estoqueC = 0;
		double estoqueE = 0;
		double estoqueV = 0;
		int erro;
		String  categoria;
		
		
		for (int contador = 1; contador <= 15; contador  ++) {	
			
			erro = 0;
			
			System.out.printf("\n\nInforme a categoria(C-E-V) do produto %s :", contador);
			
			categoria = sc.next();
									
			while (erro == 0){
				if (categoria.equals("C") || categoria.equals("c")) {
				
					System.out.print("Preco unitario: R$ ");
					precoUnit = sc.nextDouble();
					
					System.out.print("Quantidade: ");
					quantidade = sc.nextInt();
				
					aliquota = precoUnit*(37.41/100);
					aux = precoUnit - aliquota;
					precoVenda = (aux +(aux * 30/100)+aliquota);
					quantidadeC = quantidadeC + quantidade;
					estoqueC = estoqueC + (precoVenda*quantidade);
					System.out.printf("Valor Imposto: R$ %.2f", aliquota);
					//System.out.printf("\nPreco sem imposto: R$ %.2f", aux);
					System.out.printf("\nPreco Unitario Venda: R$ %.2f", precoVenda);
					//System.out.printf("\nValor Total Estoque C : R$ %.2f", estoqueC);
					
				}else {
					if (categoria.equals("E") || categoria.equals("e")) {
						System.out.print("Preco unitario: R$ ");
						precoUnit = sc.nextDouble();
						
						System.out.print("Quantidade: ");
						quantidade = sc.nextInt();
					
						aliquota = precoUnit*(38.42/100);
						aux = precoUnit - aliquota;
						precoVenda = (aux +(aux * 35/100)+aliquota);
						quantidadeE = quantidadeE + quantidade;
						estoqueE = estoqueE + (precoVenda*quantidade);
						System.out.printf("Valor Imposto: R$ %.2f", aliquota);
						//System.out.printf("\nPreco sem imposto: R$ %.2f", aux);
						System.out.printf("\nPreco Unitario Venda: R$ %.2f", precoVenda);
						//System.out.printf("\nValor Total Estoque E : R$ %.2f", estoqueE);
						
					}else {
						if (categoria.equals("V") || categoria.equals("v")) {
							System.out.print("Preco unitario: R$ ");
							precoUnit = sc.nextDouble();
							
							System.out.print("Quantidade: ");
							quantidade = sc.nextInt();
						
							aliquota = precoUnit*(43.14/100);
							aux = precoUnit - aliquota;
							precoVenda = (aux +(aux * 50/100)+aliquota);
							quantidadeV = quantidadeV + quantidade;
							estoqueV = estoqueV + (precoVenda*quantidade);
							System.out.printf("Valor Imposto: R$ %.2f", aliquota);
							//System.out.printf("\nPreco sem imposto: R$ %.2f", aux);
							System.out.printf("\nPreco Unitario Venda: R$ %.2f", precoVenda);
							//System.out.printf("\nValor Total Estoque V : R$ %.2f", estoqueV);
						}else {
							System.out.println("\nCategoria Invalida. Informe C, E ou V. ");
							contador --;
							erro =1;
						}
					}
				}
			
			erro = 1;	
			}
		}
		System.out.println("\n\n*****************************************");
		System.out.println("\n***********Quantidade em Estoque***********");
		System.out.println("\n*******************************************");
		System.out.println("\n\n------Categoria: Cama, Mesa e Banho------");
		System.out.printf("\nQuantidade Total:  %d",quantidadeC);
		System.out.printf("\nValor Total : R$ %.2f", estoqueC);
		System.out.println("\n\n------Categoria: Eletrodomesticos-------");
		System.out.printf("\nQuantidade Total: %d",quantidadeE);
		System.out.printf("\nValor Total: R$ %.2f", estoqueE);
		System.out.println("\n\n----------Categoria: Vestuario----------");
		System.out.printf("\nQuantidade Total: %d",quantidadeV);
		System.out.printf("\nValor Total: R$ %.2f", estoqueV);
		
		sc.close();
	}

}
