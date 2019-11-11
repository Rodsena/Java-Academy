package estruturasControle;

import java.util.Scanner;

public class Exercicio2Pag45 {

	public static void main(String[] args) {
		double totalParaPagar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		double valorProd = sc.nextDouble();
		
		System.out.println("Informe a condi��o de pagamento:\n1. � vista em dinheiro ou cheque = 10% de desconto.\n"
				+ "2. � vista no cart�o no cart�o de cr�dito = 5% de desconto.\n"
				+ "3. em duas vezes, pre��o sem juros.\n"
				+ "4. em tr�s vezes, com 10% de juros.\n");
		
		int opcao = sc.nextInt();
		
		sc.close();
		
		switch (opcao) {
			case 1:
					totalParaPagar = valorProd - (valorProd * 0.10);
					System.out.print("Total � pagar " + totalParaPagar);
				break;
			case 2:
					totalParaPagar = valorProd - (valorProd * 0.05);
					System.out.print("Total � pagar " + totalParaPagar);
			break;
			case 3:
					totalParaPagar = valorProd;
					double parcela = totalParaPagar / 2;
					System.out.print("Total � pagar " + totalParaPagar + " em duas parcelas de " + parcela);
			break;
			case 4:
					totalParaPagar = valorProd + (valorProd * 0.10);
					parcela = totalParaPagar / 3;
					System.out.print("Total � pagar " + totalParaPagar + " em tr�s parcelas de " + parcela);
				
			break;	
			default:
			break;
		}
	}
}
