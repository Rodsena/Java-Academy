package metodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaCalculadora2 {
		

public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();

		int[] num1 = {1,2,3,4,5,6};
		
		int resultado = cal.calcular(num1);
		int resultado2 = cal.somar(1,2);
		int resultado3 = cal.subtrair(4,5);
		int resultado4 = cal.multiplicar(8,8);
		int resultado5 = cal.divisao(8,8);
		
		JOptionPane.showMessageDialog(null, resultado);
		JOptionPane.showMessageDialog(null, resultado2);
		JOptionPane.showMessageDialog(null, resultado3);
		JOptionPane.showMessageDialog(null, resultado4);
		JOptionPane.showMessageDialog(null, resultado5);

		
	}

}
