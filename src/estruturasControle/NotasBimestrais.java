package estruturasControle;

import java.util.Scanner;

public class NotasBimestrais {
	
	public static void main(String[] args) {
		
		double[] num = new double [4];
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 4; j++) {
			
			System.out.println("Por favor insira a Nota " + (j+1));
			
			num[j]=Double.parseDouble(sc.next());
		   
			total += num[j];
		}
		sc.close();
		
		if(total/4>= 7) {
			System.out.println("Aluno Aprovado, parabéns!");
		}
		else {
			System.out.println("Aluno Reprovado, estude mais!");
		}
	}
}
