package estruturasControle;

import java.util.Scanner;

public class Exercicio7aPag50 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número.");
		int num = sc.nextInt();
		sc.close();
		
		if (num > 0) {
			
			if(num % 2 == 0) {
				System.out.println("O número "+ num + " é Positivo e Par");
			} else {
				System.out.println("O número "+ num + " é Positivo e Ímpar");
			}
		} else if(num < 0 ) {
			
					if(num % 2 == 0) {
						System.out.println("O número "+ num + " é Negativo e Par");
					} else {
						System.out.println("O número "+ num + " é Negativo e Ímpar");
					}
				} else {
					System.out.println("O número é zero!");
				}
	}
}
