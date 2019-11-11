package estruturasControle;

import java.util.Scanner;

public class Exercicio7aPag49 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double P, M = 0, E = 0;
		System.out.print("Insira o Kg: ");
		P = sc.nextDouble();
		sc.close();
		
		if(P > 50.00) {
			E = P - 50.00;
			M = 4.00 *  E;
			
			System.out.println("Execedeu " + E + " Kg - Multa à pagar R$ " + M);
		} else {
			System.out.println("Execedeu " + E + " Kg - Multa à pagar R$ " + M);
		}
		
	}
}
