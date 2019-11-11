package cap8lab;

import java.util.Random;

import javax.swing.JOptionPane;

public class Cap8lab1 {

	public static int maiorNumero (int[] array) {
		
		int maior = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] > maior) {
				
				maior = array[i];
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {

		int[] numeros = new int[4];

		Random gerador = new Random();

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = gerador.nextInt(100);
			
			System.out.println(numeros[i]);
		}
		int maior = maiorNumero(numeros);
		
		JOptionPane.showMessageDialog(null, maior);
	}
}
