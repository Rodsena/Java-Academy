package estruturasControle;

import java.util.Scanner;


public class Exercicio1Pag45 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int [] valor = new int[3];
			
			for (int i = 0; i < 3; i++) {
				
				System.out.println("Insira o valor " + (i+1));
				 
				valor[i] = sc.nextInt();
			}
			sc.close();
			
				if(valor[0]>valor[1]) {
					if(valor[0]>valor[2]) {
						System.out.println(valor[0] + ", "+ valor[1] + ", " + valor[2]);
				}
				else {
					System.out.println(valor[2] + ", " + valor[0] + ", " + valor[1]);
				}
			}
			else if(valor[1]>valor[2]) {
				
					if(valor[2]>valor[0])
						System.out.println(valor[1] + ", "+ valor[2] + ", " + valor[0]);
			}
			else {
				System.out.println(valor[2] + ", "+ valor[1] + ", " + valor[0]);
			}
		}
}
