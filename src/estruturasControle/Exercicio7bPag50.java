package estruturasControle;

import java.util.Scanner;

public class Exercicio7bPag50 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o índice de Poluição da empresa:");
		double indice = sc.nextDouble();
		
		sc.close();
		
		if(indice < 0.40 && indice > 0.29 ) {
			
				System.out.println("Segue notificação as referentes empresas do Grupo 1 à suspenção das atividades.");
		
		} else if (indice < 0.50 && indice > 0.39) {
				
					System.out.println("Segue notificação as referentes empresas do Grupo 1 e 2 à suspenção das atividades.");
				} else if (indice >= 0.50) {
					
							System.out.println("Segue notificação a todos Grupos e suas respectivas empresas à suspenção das atividades.\"");
						}
	}
}
