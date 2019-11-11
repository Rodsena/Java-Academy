package desafio.maternidade;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TelaDeCadastro extends RegistroDeNascimento {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<RegistroDeNascimento> bebe = new ArrayList<RegistroDeNascimento>();
		/* OPCAO 1 - RECEBENDO AS INFORMAÇÕES DOS BEBES E INSERINDO NO ARRAY*/
//		for (int i = 0; i < 4; i++) {
//
//			RegistroDeNascimento baby = new RegistroDeNascimento();
//			baby.setNome(JOptionPane.showInputDialog("Insira o nome do bebê"));
//			baby.setNomeMae(JOptionPane.showInputDialog("Insira o nome da mãe do bebê"));
//			baby.setSexo(JOptionPane.showInputDialog("Insira o sexo do bebê"));
//
//			bebe.add(baby);
//		}
//		Thread.sleep(1000);
		
		/* OPCAO 2 - POPULANDO O ARRAY*/ 	
		RegistroDeNascimento baby = new RegistroDeNascimento("BERNARDO","JOANA","MASCULINO");
		bebe.add(baby);
		RegistroDeNascimento baby2 = new RegistroDeNascimento("MARIA","ANTONIA","FEMININO");
		bebe.add(baby2);
		RegistroDeNascimento baby3 = new RegistroDeNascimento("JESSICA","FLORINDA","FEMININO");
		bebe.add(baby3);
		RegistroDeNascimento baby4 = new RegistroDeNascimento("OSÓRIO","DANIELA","MASCULINO");
		bebe.add(baby4);
		
		/* STRING AUXILIAR */
		String decisao;

		for (int i = 0; i < bebe.size(); i++) {

			decisao = JOptionPane
					.showInputDialog(bebe.get(i).getNome() + " nasceu com 9 meses?\n\n Responda com S(sim) ou N (não)");

			if (decisao.equalsIgnoreCase("N")) {

				bebe.get(i)
						.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento")));

				if (bebe.get(i).getMesesGestacao() < 8) {

					bebe.get(i).setUti(true);
				}
			}
		}

		ArrayList<String> bebesUTI = new ArrayList<String>();

		for (int i = 0; i < bebe.size(); i++) {
			if (bebe.get(i).isUti() == true) {

				bebesUTI.add(bebe.get(i).getNome());
			}
		}
		decisao = "Encaminhar para UTI:\n";
		for (int i = 0; i < bebesUTI.size(); i++) {

			decisao += "\n" + bebesUTI.get(i);
		}
		Thread.sleep(1000);
		JOptionPane.showMessageDialog(null, decisao, "Emergência", JOptionPane.WARNING_MESSAGE, null);
	}
}
