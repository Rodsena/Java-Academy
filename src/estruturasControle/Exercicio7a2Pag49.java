package estruturasControle;

import java.util.Scanner;

public class Exercicio7a2Pag49 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double C, N, salarioE = 0, E = 0;
		double salarioTotal;
		
		System.out.print("Insira o código: ");
		C = sc.nextDouble();
		
		System.out.print("Insira o número de horas trabalhadas: ");
		N = sc.nextDouble();
		sc.close();
		
		if(N > 50.00) {
			E = N - 50.00;
			salarioE = 20.00 *  E;
			salarioTotal = salarioE + (10 * (N - E));
			System.out.println("O seu salário é R$ " + salarioTotal + " sendo em horas extra R$ " + salarioE);
		} else {
			salarioTotal = salarioE + (10 * (N - E));
			System.out.println("O seu salário é R$ " + salarioTotal + " você não fez hora extra.");
		}
		
	}
}
