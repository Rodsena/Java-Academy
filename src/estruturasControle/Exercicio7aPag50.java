package estruturasControle;

import java.util.Scanner;

public class Exercicio7aPag50 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero.");
		int num = sc.nextInt();
		sc.close();
		
		if (num > 0) {
			
			if(num % 2 == 0) {
				System.out.println("O n�mero "+ num + " � Positivo e Par");
			} else {
				System.out.println("O n�mero "+ num + " � Positivo e �mpar");
			}
		} else if(num < 0 ) {
			
					if(num % 2 == 0) {
						System.out.println("O n�mero "+ num + " � Negativo e Par");
					} else {
						System.out.println("O n�mero "+ num + " � Negativo e �mpar");
					}
				} else {
					System.out.println("O n�mero � zero!");
				}
	}
}
