package desafio.elevador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class PredioMain {

	public static void main(String[] args) throws InterruptedException {

		// CRIANDO LISTA PARA RECEBER OS ANDARES

		ArrayList<Integer> andar = new ArrayList<Integer>();

		// INFORMANDO O ANDAR NO ELEVADOR
		boolean opcao = false;

		while (opcao == false) {
			String opc = JOptionPane.showInputDialog("10 09 08\n07 06 05\n04 03 02\n01 S = para sair");
			if (opc.equalsIgnoreCase("S")) {
				opcao = true;
			} else
				andar.add(Integer.parseInt(opc));
		}
		// ORDENANDO A LISTA EM ORDEM CRESCENTE
		Collections.sort(andar);

		// ELEVADOR SUBINDO
		for (int i = 0; i <= andar.get(andar.size() - 1); i++) {

			System.out.println(i);

			Thread.sleep(1000);

			for (Integer a : andar) {
				if (a == i) {
					System.out.println("Aguardando saída passageiro.");

					Thread.sleep(1000);

					break;
				}
			}
		}

		System.out.println("\nPreparando para descer...\n");

		Thread.sleep(1000);

		// INVERTERNDO AS POSIÇÕES DA LISTA
		Collections.reverse(andar);

		// ELEVADOR DESCENDO
		for (int i = andar.get(0); i >= 0; i--) {

			System.out.println(i);

			Thread.sleep(1000);

			// DESCENDO COM PARADAS
//			for(Integer a:andar) {
//				if(a == i) {
//					System.out.println("Aguardando saída passageiro.");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
//				} 
//			}
		}

	}

}
