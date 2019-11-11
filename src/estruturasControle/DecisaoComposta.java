package estruturasControle;

import java.util.Scanner;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		System.out.println("Informe um número:");
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		boolean eNumero = false;
		
		while(eNumero == false) {
			try {
				
			 num =Integer.parseInt(sc.next());
			 eNumero = true;
			 
			} catch (NumberFormatException e) {
					
				 System.out.print("Informe um número válido: ");
				 
			 }
		}	 
			
		sc.close();
		
		if(num > 20 )
						
			System.out.print("O número " + num + " é maior que 20");
		else if(num < 20)
			System.out.println("O número " + num + " é menor que 20");
		
		else 
			System.out.println("O número é  20");
			
	}
}
