package arrays.rodrigorodrigues;

public class ArrayPag68 {
	
	public static void main(String[] args) {
		
		int[] notas = { 6, 7, 8, 4 };

		int total = 0;

		for (int i = 0; i < notas.length - 1; i++) {

			total += notas[i];
		}
		int media = total / notas.length;
		if (media >= 7)
			System.out.println("Parabéns passou de ano!");
		else if (media >= 4) {
			System.out.println("Refazer a prova!");
		} else
			System.out.println("Reprovado!");

	}
}
 