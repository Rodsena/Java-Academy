package estruturasControle;

import java.util.Scanner;

public class Exercicio7a2Pag49 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double C, N, salarioE = 0, E = 0;
		double salarioTotal;
		
		System.out.print("Insira o c�digo: ");
		C = sc.nextDouble();
		
		System.out.print("Insira o n�mero de horas trabalhadas: ");
		N = sc.nextDouble();
		sc.close();
		
		if(N > 50.00) {
			E = N - 50.00;
			salarioE = 20.00 *  E;
			salarioTotal = salarioE + (10 * (N - E));
			System.out.println("O seu sal�rio � R$ " + salarioTotal + " sendo em horas extra R$ " + salarioE);
		} else {
			salarioTotal = salarioE + (10 * (N - E));
			System.out.println("O seu sal�rio � R$ " + salarioTotal + " voc� n�o fez hora extra.");
		}
		
	}
}
