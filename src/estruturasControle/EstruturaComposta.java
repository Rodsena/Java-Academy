package estruturasControle;

import java.util.Scanner;

public class EstruturaComposta {

	public static void main(String[] args) {
		
		double salario = 0;
		double bonus = 0;
		int tempo = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o salário?");
		
		salario = sc.nextDouble();
		
		System.out.println("Qual o tempo?");
		
		tempo = sc.nextInt();
		sc.close();
		
		if(tempo >= 5) {
			
			bonus = salario * 0.20;
		}
		else {
			bonus = salario * 0.10;
		}
		
		System.out.println("O valor do bonus é R$ " + bonus);
			
		
		
	}
}
