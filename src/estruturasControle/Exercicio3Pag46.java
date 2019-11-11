package estruturasControle;

import java.util.Scanner;

public class Exercicio3Pag46 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira 2 valores: ");
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			
			System.out.print("1 - Adição\n"
					+ "2 - Subtração\n"
					+ "3 - Multiplicação\n"
					+ "4 - Divisão\n"
					+ "Escolha uma opção: ");
			
			int opcao = sc.nextInt();
			
			
			switch (opcao) {
			case 1:
				int total = valor1 + valor2;
				System.out.println("Total da soma é " + total);
				break;
			case 2:
				total = valor1 - valor2;
				System.out.println("Total da subtração é " + total);
				break;
			case 3:
				total = valor1 * valor2;
				System.out.println("Total da multiplicação é " + total);
				break;
			case 4:
				while (valor2 == 0) {
					try {
						System.out.print("Insira um valor maior que 0: ");
						valor2 = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Valor inválido");
					}					
				}
				total = valor1 / valor2;
				System.out.println("Total da divisão é " + total);
				sc.close();
				break;
			
			default:
				break;
			}
		}
}
