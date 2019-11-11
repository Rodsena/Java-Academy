package estruturasControle;

import java.util.Scanner;

public class Exercicio7cPag50 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Informe a idade do nadador: ");
		int idade = sc.nextInt();
		
		if (idade < 8 && idade >3) {
			
				System.out.println("Idade nadador: " + idade + "\nCategoria: Infantil A");
				
		} else if (idade < 12 && idade > 7) {
			
					System.out.println("Idade nadador: " + idade + "\nCategoria: Infantil B");
					
				} else if ( idade < 14 && idade > 11) {
					
							System.out.println("Idade nadador: " + idade + "\nCategoria: Juvenil A");
						
						} else if ( idade < 18 && idade > 13) {
							
									System.out.println("Idade nadador: " + idade + "\nCategoria: Juvenil B");
									
								} else if ( idade > 17 ) {
									
											System.out.println("Idade nadador: " + idade + "\nCategoria: Adulto");
											
										}
		else 
			System.out.println("Não possui idade mínima para iniciar.");
		
		sc.close();
	}
}
