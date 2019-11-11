package metodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaCalculadora {

public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();

		System.out.println("insera os valores:");

		Scanner sc = new Scanner(System.in);
		
		Scanner ler = new Scanner(System.in);

		int soma = 0;
		int[] num = new int[6];
		
		int i = 0;
		
		while ( i < 6) {
			
			num[i] = Integer.parseInt(ler.next());
			i++;
		}
		
		ler.close();
		
		int cincoargumentos = cal.calcular(3, 7, 8, 9, 10);

		JOptionPane.showMessageDialog(null, cincoargumentos);

		for ( i = 0; i < 5; i++) {

			soma = cal.calcular(num[i], num[i + 1]);
			System.out.println("total de " + num[i] + " + " + num[i + 1] + "= " + soma);
		}



	}
}
