package estruturasControle;

import java.util.Scanner;

public class Exercicio7a3Pag49 {
	public static void main(String[] args) {
		
		int [] num = new int [4];
		int [] quadrado = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Insira o " + (i + 1) + "� valor: ");
			num[i] = sc.nextInt();
			
			quadrado[i] = num[i] * num[i];
			
		}
		sc.close();
		if(num[2] >= 1000) {
			
				System.out.print("\nO quadrado do 3� valor " + num[2] + " � :" + quadrado[2] );
		} else {
			
			for (int i = 0; i < 4; i++) {
				
				System.out.print("\nO quadrado do " + (i + 1) + "� valor " + num[i] + " � : " + quadrado[i] );
			}			
		}
		
	}
}
 