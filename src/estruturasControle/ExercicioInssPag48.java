package estruturasControle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioInssPag48 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Informe o seu salario: ");
		double salarioBruto = sc.nextDouble();
		
		sc.close();
		
		if (salarioBruto <= 360.01) {
			double salarioLiquido = salarioBruto - (salarioBruto * 0.08);
			String salarioS = df.format(salarioLiquido);
			System.out.println("\nO seu salario líquido é R$ "+ salarioS + " sobre a alíquota de 8%");
		} else if (salarioBruto <= 600.00) {
				double salarioLiquido = salarioBruto - (salarioBruto * 0.09);
				String salarioS = df.format(salarioLiquido);
				System.out.println("\nO seu salario líquido é R$ "+ salarioS + " sobre a alíquota de 9%");
				} else if (salarioBruto <= 1200.00) {
						double salarioLiquido = salarioBruto - (salarioBruto * 0.11);
						String salarioS = df.format(salarioLiquido);
						System.out.println("\nO seu salario líquido é R$ "+ salarioS + " sobre a alíquota de 11%");
						} else  {
							double salarioLiquido = salarioBruto - 132.00;
							String salarioS = df.format(salarioLiquido);
							System.out.println("\nO seu salario líquido é R$ "+ salarioS + " sobre a alíquota de teto máximo.");
							}
	}
}
