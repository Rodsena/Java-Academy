package arrays.rodrigorodrigues;

public class ArrayPag70 {

	public static void main(String[] args) {
			
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] dobro = new int [10];
		System.out.print("Inteiros  Dobro");
		for (int i = 0; i < dobro.length; i++) {
				
			dobro[i] = num[i] + num[i];
			
			System.out.print("\n   " + num[i] + "        " + dobro[i]);
		}
	}
}
