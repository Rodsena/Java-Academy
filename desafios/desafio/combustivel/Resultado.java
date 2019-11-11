package desafio.combustivel;



import java.awt.HeadlessException;

import javax.swing.JOptionPane;


public class Resultado {
	public static void main(String[] args) {
		
		Combustivel c = new Combustivel();
		
		
		while (c.getEtanol() == 0) {
			try {
				c.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol: ")));

			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "informe o valor correto", "Erro", JOptionPane.ERROR_MESSAGE, null);
			} catch (HeadlessException e) {
				
				e.printStackTrace();
			}
		}
		while (c.getGasolina() == 0) {
			try {
				c.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina")));

			} catch (NumberFormatException e) {
			
				JOptionPane.showMessageDialog(null, "informe o valor correto", "Erro", JOptionPane.ERROR_MESSAGE, null);
			} catch (HeadlessException e) {
			
				e.printStackTrace();
			}
		}
		
		
		boolean melhor = c.calculaCombustivel(c.getEtanol(), c.getGasolina());
		
		if(melhor) {
			
			JOptionPane.showMessageDialog(null, "Etanol tem o melhor custo benefício!!");
		} else {
			JOptionPane.showMessageDialog(null, "Gasolina tem o melhor custo benefício!!");
		}
		
	}
}
