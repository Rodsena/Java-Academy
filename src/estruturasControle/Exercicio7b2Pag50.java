package estruturasControle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7b2Pag50 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[500];
		int maior = 0;
		int menor = 99999999;
		int contador = 0;
		int total = 0;
		boolean verifica = false;
		
		for (int i = 0; i < 5; i++) {
			verifica = false;
			System.out.print("Informe o " + (i + 1) + "º número: ");
			while (verifica == false) {
				try {
					num[i] = Integer.parseInt(sc.next());
					verifica = true;
					while (num[i] < 0) {

						System.out.print("Informe um número positivo: ");
						num[i] = sc.nextInt();

					}

					if (num[i] > maior) {
						maior = num[i];
					}
					if (num[i] < menor) {
						menor = num[i];
					}

				} catch (InputMismatchException e) {

					System.out.print("Informe um número inteiro: ");

				} catch (NumberFormatException e) {
					
					System.out.print("Informe um número inteiro: ");
				}
			}
			sc.close();
			total += num[i];
			contador++;
		}

		int media = total / contador;

		System.out.println("O total dos números informados é " + total + ", o maior número  digitado foi " + maior
				+ ", o menor " + menor + " e a média dos números informados é " + media);

	}
}
