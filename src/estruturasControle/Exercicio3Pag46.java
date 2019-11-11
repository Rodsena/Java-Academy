package estruturasControle;

import java.util.Scanner;

public class Exercicio3Pag46 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira 2 valores: ");
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			
			System.out.print("1 - Adi��o\n"
					+ "2 - Subtra��o\n"
					+ "3 - Multiplica��o\n"
					+ "4 - Divis�o\n"
					+ "Escolha uma op��o: ");
			
			int opcao = sc.nextInt();
			
			
			switch (opcao) {
			case 1:
				int total = valor1 + valor2;
				System.out.println("Total da soma � " + total);
				break;
			case 2:
				total = valor1 - valor2;
				System.out.println("Total da subtra��o � " + total);
				break;
			case 3:
				total = valor1 * valor2;
				System.out.println("Total da multiplica��o � " + total);
				break;
			case 4:
				while (valor2 == 0) {
					try {
						System.out.print("Insira um valor maior que 0: ");
						valor2 = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Valor inv�lido");
					}					
				}
				total = valor1 / valor2;
				System.out.println("Total da divis�o � " + total);
				sc.close();
				break;
			
			default:
				break;
			}
		}
}
