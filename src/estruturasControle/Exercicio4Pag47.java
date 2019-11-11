package estruturasControle;

import java.util.Scanner;

public class Exercicio4Pag47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, qual o seu peso?");
		double peso = sc.nextDouble();
		
		System.out.println("\nQual a sua altura?");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		sc.close();
		
		if( imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		} else if ( imc <= 25 ) {
				System.out.println("Você está no peso ideal!! Parabéns!");
			} else if ( imc <= 30) {
					System.out.println("Você está acima do peso!");
				} else if (imc > 30) {
						System.out.println("Você está Obeso!! Procura ajuda médica!");
					}
		
	}
}
