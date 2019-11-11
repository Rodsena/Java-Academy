package cap8lab;

import javax.swing.JOptionPane;

public class Cap8lab2 {
	public static void main(String[] args) {
		
		if (args.length > 0) {
			
			int soma = 0;
			
			for (int i = 0; i < args.length; i++) {
				
				soma += Integer.parseInt(args[i]);
			}
			int media = 0;
			
			media = soma / args.length;
		
			JOptionPane.showMessageDialog(null, "A média das idades: \n" + args[0]+ " " +args[1]+ " " + args[2]+ " " + args[3] + ""
					+ "\né de: " + media);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Entre com valores válidos para as idades");
		}
		
		
		
	}
}
